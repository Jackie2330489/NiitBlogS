<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
    <%@include file="common/head.jsp"%>
</head>
<body>
<%@include file="common/nav.jsp"%>
<div class="container">
    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-9">
        <ul class="nav nav-tabs nav-justified" role="tablist" style="margin-bottom: 5px;">
            <li role="presentation" class="active"><a href="#panelAll" aria-controls="panelAll" role="tab" data-toggle="tab">所有</a></li>
            <li role="presentation"><a href="#panelFollow" aria-controls="panelFollow" role="tab" data-toggle="tab">关注</a></li>
            <li role="presentation"><a href="#panelHot" aria-controls="panelHot" role="tab" data-toggle="tab">推荐</a></li>
        </ul>
        <div class="tab-content">
        <div role="tabpanel" class="tab-pane active" id="panelAll">
            <p id="newBlogsAll" class="bg-primary" style="text-align: center;cursor: hand;">有2条新的博文</p>
                <div id="BlogsAll">
                </div>
        </div>
            <div role="tabpanel" class="tab-pane" id="panelFollow">
                <p id="newBlogsFollow" class="bg-primary" style="text-align: center;cursor: hand;">有2条新的博文</p>
                <div id="BlogsFollow">
                <div class="panel panel-info">
                    <div class="panel-heading"><span class="text-info">胡斯庭</span>：Panel heading
                        <div style="display: inline;float: right">2分钟前</div>
                    </div>
                    <div class="panel-body">
                        <p>...
                            sdsd
                            asdasd</p>
                    </div>
                    <div class="panel-footer">
                        <div class="visible-lg-inline visible-md-inline visible-sm-inline">
                            <span class="label label-default">Default</span>
                            <span class="label label-default">Default</span>
                            <span class="label label-default">Default</span>
                            <span class="label label-default">Default</span>
                            <span class="label label-default">Default</span>
                        </div>
                        <div style="display: inline;">&nbsp;</div>
                        <div style="float:right;">
                            <a href="#"> <span class="glyphicon glyphicon-heart" style="color: red;"></span></a>
                            <span>(263)</span>
                            <span class="glyphicon glyphicon-comment"></span>
                            <span>(263)</span>
                        </div>
                    </div>
                </div>
                <div class="panel panel-info">
                    <div class="panel-heading"><span class="text-info">胡斯庭</span>：Panel heading
                        <div style="display: inline;float: right">2分钟前</div>
                    </div>
                    <div class="panel-body">
                        <p>...
                            sdsd
                            asdasd</p>
                    </div>
                    <div class="panel-footer">
                        <div class="visible-lg-inline visible-md-inline visible-sm-inline">
                            <span class="label label-default">Default</span>
                            <span class="label label-default">Default</span>
                            <span class="label label-default">Default</span>
                            <span class="label label-default">Default</span>
                            <span class="label label-default">Default</span>
                        </div>
                        <div style="display: inline;">&nbsp;</div>
                        <div style="float:right;">
                            <a href="#"> <span class="glyphicon glyphicon-heart" style="color: red;"></span></a>
                            <span>(263)</span>
                            <span class="glyphicon glyphicon-comment"></span>
                            <span>(263)</span>
                        </div>
                    </div>
                </div>
                <div class="panel panel-info">
                    <div class="panel-heading"><span class="text-info">胡斯庭</span>：Panel heading
                        <div style="display: inline;float: right">2分钟前</div>
                    </div>
                    <div class="panel-body">
                        <p>...
                            sdsd
                            asdasd</p>
                    </div>
                    <div class="panel-footer">
                        <div class="visible-lg-inline visible-md-inline visible-sm-inline">
                            <span class="label label-default">Default</span>
                            <span class="label label-default">Default</span>
                            <span class="label label-default">Default</span>
                            <span class="label label-default">Default</span>
                            <span class="label label-default">Default</span>
                        </div>
                        <div style="display: inline;">&nbsp;</div>
                        <div style="float:right;">
                            <a href="#"> <span class="glyphicon glyphicon-heart" style="color: red;"></span></a>
                            <span>(263)</span>
                            <span class="glyphicon glyphicon-comment"></span>
                            <span>(263)</span>
                        </div>
                    </div>
                </div>
                <div class="panel panel-info">
                    <div class="panel-heading"><span class="text-info">胡斯庭</span>：Panel heading
                        <div style="display: inline;float: right">2分钟前</div>
                    </div>
                    <div class="panel-body">
                        <p>...
                            sdsd
                            asdasd</p>
                    </div>
                    <div class="panel-footer">
                        <div class="visible-lg-inline visible-md-inline visible-sm-inline">
                            <span class="label label-default">Default</span>
                            <span class="label label-default">Default</span>
                            <span class="label label-default">Default</span>
                            <span class="label label-default">Default</span>
                            <span class="label label-default">Default</span>
                        </div>
                        <div style="display: inline;">&nbsp;</div>
                        <div style="float:right;">
                            <a href="#"> <span class="glyphicon glyphicon-heart" style="color: red;"></span></a>
                            <span>(263)</span>
                            <span class="glyphicon glyphicon-comment"></span>
                            <span>(263)</span>
                        </div>
                    </div>
                </div>
                </div>
            </div>
            <div role="tabpanel" class="tab-pane" id="panelHot">
                <div class="panel panel-info">
                    <div class="panel-heading"><span class="text-info">胡斯庭</span>：Panel heading
                        <div style="display: inline;float: right">2分钟前</div>
                    </div>
                    <div class="panel-body">
                        <p>...
                            sdsd
                            asdasd</p>
                    </div>
                    <div class="panel-footer">
                        <div class="visible-lg-inline visible-md-inline visible-sm-inline">
                            <span class="label label-default">Default</span>
                            <span class="label label-default">Default</span>
                            <span class="label label-default">Default</span>
                            <span class="label label-default">Default</span>
                            <span class="label label-default">Default</span>
                        </div>
                        <div style="display: inline;">&nbsp;</div>
                        <div style="float:right;">
                            <a href="#"> <span class="glyphicon glyphicon-heart" style="color: red;"></span></a>
                            <span>(263)</span>
                            <span class="glyphicon glyphicon-comment"></span>
                            <span>(263)</span>
                        </div>
                    </div>
                </div>
                <div class="panel panel-info">
                    <div class="panel-heading"><span class="text-info">胡斯庭</span>：Panel heading
                        <div style="display: inline;float: right">2分钟前</div>
                    </div>
                    <div class="panel-body">
                        <p>...
                            sdsd
                            asdasd</p>
                    </div>
                    <div class="panel-footer">
                        <div class="visible-lg-inline visible-md-inline visible-sm-inline">
                            <span class="label label-default">Default</span>
                            <span class="label label-default">Default</span>
                            <span class="label label-default">Default</span>
                            <span class="label label-default">Default</span>
                            <span class="label label-default">Default</span>
                        </div>
                        <div style="display: inline;">&nbsp;</div>
                        <div style="float:right;">
                            <a href="#"> <span class="glyphicon glyphicon-heart" style="color: red;"></span></a>
                            <span>(263)</span>
                            <span class="glyphicon glyphicon-comment"></span>
                            <span>(263)</span>
                        </div>
                    </div>
                </div>
                <div class="panel panel-info">
                    <div class="panel-heading"><span class="text-info">胡斯庭</span>：Panel heading
                        <div style="display: inline;float: right">2分钟前</div>
                    </div>
                    <div class="panel-body">
                        <p>...
                            sdsd
                            asdasd</p>
                    </div>
                    <div class="panel-footer">
                        <div class="visible-lg-inline visible-md-inline visible-sm-inline">
                            <span class="label label-default">Default</span>
                            <span class="label label-default">Default</span>
                            <span class="label label-default">Default</span>
                            <span class="label label-default">Default</span>
                            <span class="label label-default">Default</span>
                        </div>
                        <div style="display: inline;">&nbsp;</div>
                        <div style="float:right;">
                            <a href="#"> <span class="glyphicon glyphicon-heart" style="color: red;"></span></a>
                            <span>(263)</span>
                            <span class="glyphicon glyphicon-comment"></span>
                            <span>(263)</span>
                        </div>
                    </div>
                </div>
                <div class="panel panel-info">
                    <div class="panel-heading"><span class="text-info">胡斯庭</span>：Panel heading
                        <div style="display: inline;float: right">2分钟前</div>
                    </div>
                    <div class="panel-body">
                        <p>...
                            sdsd
                            asdasd</p>
                    </div>
                    <div class="panel-footer">
                        <div class="visible-lg-inline visible-md-inline visible-sm-inline">
                            <span class="label label-default">Default</span>
                            <span class="label label-default">Default</span>
                            <span class="label label-default">Default</span>
                            <span class="label label-default">Default</span>
                            <span class="label label-default">Default</span>
                        </div>
                        <div style="display: inline;">&nbsp;</div>
                        <div style="float:right;">
                            <a href="#"> <span class="glyphicon glyphicon-heart" style="color: red;"></span></a>
                            <span>(263)</span>
                            <span class="glyphicon glyphicon-comment"></span>
                            <span>(263)</span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="visible-lg col-lg-3" style="right: 50px;" data-spy="affix">
        <div class="panel panel-default">
            <div class="panel-body">
                <div class="col-lg-6">
                    <img src="https://ss0.baidu.com/6ONWsjip0QIZ8tyhnq/it/u=2198761902,335858300&fm=173&s=4E1105C742776D961911D48A0300F091&w=218&h=146&img.JPEG"
                         class="img-responsive img-circle"
                         style="width: 50px;height: 50px;float: right;"/>
                </div>
                <div id="rightName" class="col-lg-6" style="height: 50px;line-height: 50px;">
                    -
                </div>
                <div id="rightIntro" class="col-lg-12 text-warning text-muted" style="text-align: center;margin-top: 5px;">
                    -
                </div>
                <div id="rightCollections" class="col-lg-12" style="height: 50px;line-height: 50px;text-align: center;">
                    关注 - | 粉丝 - | 博文 -
                </div>
                <div id="rightFrom" class="col-lg-12" style="text-align: center">
                    -
                </div>
            </div>
            <ul class="list-group">
                <li class="list-group-item">
                    <div>
                        <p style="display: inline-block;width: 50%;text-align: right">获赞：</p><p id="rightBeLiked" style="display: inline;">-</p>
                    </div>
                    <div>
                        <p style="display: inline-block;width: 50%;text-align: right">已打赏：</p><p id="rightDonate" style="display: inline;">-</p>
                    </div>
                    <div>
                        <p style="display: inline-block;width: 50%;text-align: right">收到打赏：</p><p id="rightGetDonate" style="display: inline;">-</p>
                    </div>
                    <div>
                        <p style="display: inline-block;width: 50%;text-align: right">我的咖喱币：</p><div id="rightMoney" style="display: inline;">-</div>
                    </div>
                </li>
            </ul>
        </div>
    </div>

</div>
<%@include file="common/bottom.jsp"%>
<script>
$.ajax({
    url: $.mybox.getProjectUrl() + "student/getStudent",
    type: "post",
    data:{"studentId":cookieUSID},
    success: function (data) {
        if(data.success){
            $("#rightName").html(data.data.name);
            $("#rightIntro").html(data.data.intro);
            $("#rightCollections").html("关注 "+data.data.following+" | 粉丝 "+data.data.followers+" | 博文 "+data.data.articlesNum);
            $("#rightBeLiked").html(data.data.likes);
            $("#rightDonate").html(data.data.donates);
            $("#rightGetDonate").html(data.data.earns);
            $("#rightFrom").html(data.data.grade+"级"+data.data.spec+data.data.sclass+"班");
            $("#rightMoney").html(data.data.money);
        }
    },
    error: function (e) {
        alert("服务器异常");
    }
});
var date = new Date($.ajax({async: false}).getResponseHeader("Date"));
var nowdate=$.mybox.Format(date,"yyyy-MM-dd HH:mm:ss")
$.ajax({
    url: $.mybox.getProjectUrl() + "article/getSimpleArticlesAll",
    type: "post",
    data:{"lastArticleDate":nowdate},
    async:false,
    success: function (data) {
        if(data.success){
            for(var d in data.data){
                $("#BlogsAll").append($.mybox.SimpleArticle(d.authorName,d.title,"",d.tags,d.likes,d.commentNum));
            }
        }
    },
    error: function (e) {
        alert("服务器异常");
    }
});
</script>
</body>
</html>