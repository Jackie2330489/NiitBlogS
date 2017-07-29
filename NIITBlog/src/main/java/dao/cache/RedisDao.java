package dao.cache;

import com.dyuproject.protostuff.LinkedBuffer;
import com.dyuproject.protostuff.ProtostuffIOUtil;
import com.dyuproject.protostuff.runtime.RuntimeSchema;
import dao.ArticleDao;
import dao.StudentDao;
import entity.Article;
import entity.Login;
import entity.Student;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import javax.annotation.Resource;
import java.util.Properties;

/**
 * Created by Justin on 2017/7/22.
 */
public class RedisDao {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final JedisPool jedisPool;

    @Autowired
    private ArticleDao articleDao;

    @Autowired
    private StudentDao studentDao;

    //spring-web.xml中配置了bean
    public RedisDao(JedisPoolConfig jedisPoolConfig, String ip, int port, int timeout, String password) {
        jedisPool = new JedisPool(jedisPoolConfig, ip, port, timeout, password);
    }

    //Article
    public Article getArticle(long articleId) {
        try {
            Jedis jedis = jedisPool.getResource();//获取Jedis(redis工具)
            RuntimeSchema<Article> schema = RuntimeSchema.createFrom(Article.class);
            //创建Article schema
            try {
                String key = "article:" + articleId;
                byte[] bytes = jedis.get(key.getBytes());
                //查找article:XXXX的
                if (bytes != null) {
                    //若找到
                    Article article = schema.newMessage();//创Article对象
                    ProtostuffIOUtil.mergeFrom(bytes, article, schema);//反序列化
                    return article;
                } else if (putArticle(articleId) != null) {
                    //若找不到 从mysql数据库中找 找到并缓存在redis服务器 找不到返回null
                    return getArticle(articleId);
                }
            } finally {
                jedis.close();
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return null;
    }

    //把mysql数据库内article放到redis服务器
    public String putArticle(long articleId) {
        try {
            Jedis jedis = jedisPool.getResource();
            RuntimeSchema<Article> schema = RuntimeSchema.createFrom(Article.class);
            try {
                //查找mysql数所库
                Article article = articleDao.getArticleById(articleId);
                if (article != null) {
                    //若找到 缓存到redis
                    String key = "article:" + articleId;
                    byte[] bytes = ProtostuffIOUtil.toByteArray(article, schema, LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE));
                    //设置保留时间
                    int timeout = 60 * 60 * 24;
                    String result = jedis.setex(key.getBytes(), timeout, bytes);
                    return result;
                }
            } finally {
                jedis.close();
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return null;
    }

    //Student
    public Student getStudent(String studentId) {
        try {
            Jedis jedis = jedisPool.getResource();
            RuntimeSchema<Student> schema = RuntimeSchema.createFrom(Student.class);
            try {
                String key = "student:" + studentId;
                byte[] bytes = jedis.get(key.getBytes());
                //查找student:XXXX 的key
                if (bytes != null) {
                    //若找到直接返回
                    Student student = schema.newMessage();//创建student对象
                    ProtostuffIOUtil.mergeFrom(bytes, student, schema);//反序列化
                    return student;
                } else if (putStudent(studentId) != null) {
                    return getStudent(studentId);
                }
            } finally {
                jedis.close();
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return null;
    }

    public String putStudent(String studentId) {
        try {
            Jedis jedis = jedisPool.getResource();
            RuntimeSchema<Student> schema = RuntimeSchema.createFrom(Student.class);
            try {
                Student student = studentDao.getStudentById(studentId);
                if (student != null) {
                    String key = "student:" + studentId;
                    byte[] bytes = ProtostuffIOUtil.toByteArray(student, schema, LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE));
                    int timeout = 60 * 60 * 24;
                    String result = jedis.setex(key.getBytes(), timeout, bytes);
                    return result;
                }
            } finally {
                jedis.close();
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return null;
    }

    //登录
    public Login getLogin(String md5) {
        try {
            Jedis jedis = jedisPool.getResource();
            RuntimeSchema<Login> schema = RuntimeSchema.createFrom(Login.class);
            try {
                String key = "login:" + md5;
                byte[] bytes = jedis.get(key.getBytes());
                //查找login:XXX的key
                if (bytes != null) {
                    Login login = schema.newMessage();
                    ProtostuffIOUtil.mergeFrom(bytes, login, schema);
                    return login;
                    //找到则返回Login对象(用户id,ip+密码的md5单向加密值)  找不到返回null
                }
            } finally {
                jedis.close();
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return null;
    }

    public String putLogin(Login login) {
        try {
            Jedis jedis = jedisPool.getResource();
            RuntimeSchema<Login> schema = RuntimeSchema.createFrom(Login.class);
            try {
                String key = "login:" + login.getLoginId();
                byte[] bytes = ProtostuffIOUtil.toByteArray(login, schema, LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE));
                int timeout = 60 * 60 * 24;
                String result = jedis.setex(key.getBytes(), timeout, bytes);
                return result;
            } finally {
                jedis.close();
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return null;
    }
}
