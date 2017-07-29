#建表后插入数据脚本
#学生表
INSERT INTO student VALUES
('jiumam123','hst123','胡斯庭',1,'1996-03-01','704855911',2014,'Java',3,'咖哩万岁！',4000),
('banana123','dyx123','董雨潇',2,'1995-08-20','829477933',2014,'Java',4,'咖哩万岁！',10000),
('justin123','zdq123','张殿钦',1,'1992-07-07','927394388',2014,'.NET',17,'咖哩万岁！',3000),
('liulong123','liulong123','刘隆国',1,'1995-04-07','749377492',2014,'OpenSource',1,'咖哩万岁！',8000);
#留言表
INSERT INTO leaveMsg(l_pageOwnerId,l_fromWhoId,l_fromWhoName,l_toWhoId,l_toWhoName,l_msg) VALUES
('jiumam123','banana123','董雨潇',NULL,NULL,'踩踩留沙发~'),
('jiumam123','jiumam123','胡斯庭','banana123','董雨潇','踩回去！'),
('jiumam123','banana123','董雨潇','jiumam123','胡斯庭','再踩！'),
('jiumam123','justin123','张殿钦','banana123','董雨潇','真无聊~');
#私信表
INSERT INTO whisper(w_senderId,w_catcherId,w_msg) VALUES
('jiumam123','banana123','雷猴！'),
('banana123','jiumam123','哈喽！'),
('jiumam123','banana123','Bye Bye！'),
('banana123','jiumam123','See you！');
#草稿表
INSERT INTO draft(d_stuId,d_title,d_draft) VALUES
('jiumam123','印度美食指南','还没查。'),
('jiumam123','中印关系报告','还没写。');
#关注表
INSERT INTO follows(f_fromWhoId,f_fromWhoName,f_toWhoId,f_toWhoName) VALUES
('jiumam123','胡斯庭','banana123','董雨潇'),
('jiumam123','胡斯庭','justin123','张殿钦'),
('banana123','董雨潇','jiumam123','胡斯庭'),
('liulong123','刘隆国','jiumam123','胡斯庭');
#通知表
INSERT INTO notification(n_fromWhoId,n_fromWhoName,n_toWhoId,n_toWhoName,n_msg,n_status) VALUES
('jiumam123','胡斯庭','banana123','董雨潇','我关注了你。',1),
('jiumam123','胡斯庭','justin123','张殿钦','我关注了你。',1),
('banana123','董雨潇','jiumam123','胡斯庭','我关注了你。',1),
('liulong123','刘隆国','jiumam123','胡斯庭','我关注了你。',1);
#博文表
INSERT INTO article(a_authorId,a_authorName,a_title,a_body) VALUES
('jiumam123','胡斯庭','XSS攻击及预防','省略一万字'),
('banana123','董雨潇','SQL注入原理','省略一万字');
#点赞表
INSERT INTO likesTable(like_likerId,like_likerName,like_belikedId,like_belikedAuthor) VALUES
('jiumam123','胡斯庭',1000,'jiumam123'),
('banana123','董雨潇',1000,'jiumam123'),
('liulong123','刘隆国',1000,'jiumam123');
#评论表
INSERT INTO comment(c_articleId,c_fromWhoId,c_fromWhoName,c_toWhoId,c_toWhoName,c_text) VALUES
(1000,'jiumam123','胡斯庭',NULL,NULL,'补充几点。。。'),
(1000,'banana123','董雨潇',NULL,NULL,'很好！'),
(1000,'jiumam123','胡斯庭','banana123','董雨潇','3Q！'),
(1000,'justin123','张殿钦','jiumam123','胡斯庭','斯盖尔！');
#打赏表
INSERT INTO donate(don_donatorId,don_donatorName,don_earnArticle,don_earnerId,don_money) VALUES
('banana123','董雨潇',1000,'jiumam123',300),
('justin123','张殿钦',1000,'jiumam123',500),
('liulong123','刘隆国',1000,'jiumam123',400);
#标签表
INSERT INTO tag(ta_id,t_name) VALUES
(1000,'XSS'),
(1000,'跨站脚本攻击'),
(1001,'SQL注入');
#敏感词表
INSERT INTO sensitiveWord(sw_name) VALUES
('asshole'),
('法克'),
('傻逼');
#推荐表
INSERT INTO hotArticle(ha_articleId) VALUES
(1000);