package web;

import dto.NiitBlogResult;
import entity.Article;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.ArticleService;
import util.XSSUtil;

import java.util.List;

/**
 * Created by Justin on 2017/7/19.
 */
@Controller
@RequestMapping("/article")
public class ArticleController {
    //日志工具
    private final Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ArticleService articleService;

    /**
     * 按关键字查找博文
     * @param searchValue
     * @return
     */
    @RequestMapping(value = "/SearchSimpleArticles",method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public NiitBlogResult<List<Article>> SearchSimpleArticles(@RequestParam String searchValue){
        searchValue=XSSUtil.killXSS(searchValue);//防预XSS,Sql注入
        List<Article> articles=articleService.searchArticle(searchValue);//调用service层方法
        if(articles.isEmpty())return new NiitBlogResult<List<Article>>(false,"没有找到相关的博文");
        else return new NiitBlogResult<List<Article>>(true,articles);
    }

    /**
     * 获取所有新博文的数量 根据网页中最新博文的日期查找更新的博文
     * @param firstArticleDate
     * @return
     */
    @RequestMapping(value = "/getNumOfNewSimpleArticlesAll",method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public int getNumOfNewSimpleArticles(@RequestParam String firstArticleDate){
        firstArticleDate=XSSUtil.killXSS(firstArticleDate);//防预XSS,Sql注入
        return articleService.getNumOfNewAll(firstArticleDate);//调用service层方法
    }

    /**
     * 获取所有新博文的简介(包括博文id,作者,标题,标签,点赞数,评论数等)
     * @param firstArticleDate
     * @return
     */
    @RequestMapping(value = "/getNewSimpleArticlesAll",method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public NiitBlogResult<List<Article>> getNewSimpleArticlesAll(@RequestParam String firstArticleDate){
        firstArticleDate=XSSUtil.killXSS(firstArticleDate);//防预XSS,Sql注入
        NiitBlogResult<List<Article>> result=null;
        List<Article> articles=articleService.getNewArticlesAll(firstArticleDate);//调用service层方法
        if(articles.isEmpty())result=new NiitBlogResult<List<Article>>(false,"没有更新的博文了");
        else result=new NiitBlogResult<List<Article>>(true,articles);
        return result;
    }


    /**
     * 获取关注人的新博文的数量 根据网页中最新博文的日期查找更新的博文
     * @param firstArticleDate
     * @param studentId
     * @return
     */
    @RequestMapping(value = "/getNumOfNewSimpleArticlesFollow",method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public int getNumOfNewSimpleArticlesFollow(@RequestParam String firstArticleDate,@RequestParam String studentId){
        firstArticleDate=XSSUtil.killXSS(firstArticleDate);//防预XSS,Sql注入
        studentId=XSSUtil.killXSS(studentId);
        return articleService.getNumOfNewFollow(firstArticleDate,studentId);//调用service层方法
    }

    /**
     * * 获取关注人的新博文的简介(包括博文id,作者,标题,标签,点赞数,评论数等)
     * @param firstArticleDate
     * @param studentId
     * @return
     */
    @RequestMapping(value = "/getNewSimpleArticlesFollow",method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public NiitBlogResult<List<Article>> getNewSimpleArticlesFollow(@RequestParam String firstArticleDate,@RequestParam String studentId){
        firstArticleDate=XSSUtil.killXSS(firstArticleDate);//防预XSS,Sql注入
        studentId=XSSUtil.killXSS(studentId);//防预XSS,Sql注入
        NiitBlogResult<List<Article>> result=null;
        List<Article> articles=articleService.getNewArticlesFollow(firstArticleDate,studentId);//调用service层方法
        if(articles.isEmpty())result=new NiitBlogResult<List<Article>>(false,"没有更新的博文了");
        else result=new NiitBlogResult<List<Article>>(true,articles);
        return result;
    }

    /**
     * 博文列表页到底后点击获取更多博文的接口
     * @param lastArticleDate
     * @return
     */
    @RequestMapping(value = "/getSimpleArticlesAll",method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public NiitBlogResult<List<Article>> getSimpleArticlesAll(@RequestParam String lastArticleDate){
        NiitBlogResult<List<Article>> result=null;
        lastArticleDate= XSSUtil.killXSS(lastArticleDate);//防预XSS,Sql注入
        List<Article> articles=articleService.getSimpleAll(lastArticleDate);//调用service层方法
        if(articles.isEmpty())result=new NiitBlogResult<List<Article>>(false,"已经到底了");
        else result=new NiitBlogResult<List<Article>>(true,articles);
        return result;
    }

    /**
     * 获取推荐博文的简介(包括博文id,作者,标题,标签,点赞数,评论数等)
     * @return
     */
    @RequestMapping(value = "/getHotArticles",method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public NiitBlogResult<List<Article>> getNewSimpleArticlesAll(){
        NiitBlogResult<List<Article>> result=null;
        List<Article> articles=articleService.getHotArticles();//调用service层方法
        if(articles.isEmpty())result=new NiitBlogResult<List<Article>>(false,"没有推荐的博文了");
        else result=new NiitBlogResult<List<Article>>(true,articles);
        return result;
    }

    /**
     * 根据博文id获取博文的所有内容 (进入博文详页的接口)
     * @param articleId
     * @return
     */
    @RequestMapping(value = "/getArticle",method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public NiitBlogResult<Article> getArticle(@RequestParam long articleId){
        NiitBlogResult<Article> result=null;
        Article articles=articleService.getById(articleId);//调用service层方法
        if(articles==null)result=new NiitBlogResult<Article>(false,"该博文不存在");
        else result=new NiitBlogResult<Article>(true,articles);
        return result;
    }

    /**
     * 添加博文 (用于写博文接口)
     * @param authorId
     * @param title
     * @param body
     * @param tags
     * @return
     */
    @RequestMapping(value = "/addArticle",method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String addArticle(@RequestParam String authorId,@RequestParam String title,@RequestParam String body,@RequestParam String[] tags){
        authorId=XSSUtil.killXSS(authorId);//防预XSS
        title=XSSUtil.killXSS(title);
        body=XSSUtil.killXSS(body);
        for(String s:tags){
            s=XSSUtil.killXSS(s);
        }
        if(articleService.addArticle(authorId,title,body,tags))return "yes";
        return "no";
    }

    /**
     * 删除博文接口 (更新博文状态为已删除，归档)
     * @param articleId
     * @return
     */
    @RequestMapping(value = "/delArticle",method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String delArticle(@RequestParam long articleId){
        if(articleService.delArticle(articleId))return "yes";
        return "no";
    }

    /**
     * 更新博文接口
     * @param articleId
     * @param title
     * @param body
     * @param tags
     * @return
     */
    @RequestMapping(value = "/updateArticle",method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String updateArticle(@RequestParam long articleId,@RequestParam String title,@RequestParam String body,@RequestParam String[] tags){
        title=XSSUtil.killXSS(title);
        body=XSSUtil.killXSS(body);
        for(String s:tags){
            s=XSSUtil.killXSS(s);
        }
        if(articleService.updateArticle(articleId,title,body,tags))return "yes";
        return "no";
    }
}
