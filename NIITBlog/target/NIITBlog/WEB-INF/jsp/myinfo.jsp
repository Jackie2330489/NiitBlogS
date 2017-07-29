<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人管理</title>
    <%@include file="common/head.jsp"%>
</head>
<body>
<%@include file="common/nav.jsp"%>
<div class="container">
    <ul class="nav nav-pills nav-stacked col-sm-2 col-md-2 col-lg-2 visible-sm visible-md visible-lg" role="tablist">
        <li role="presentation" class="active"><a href="#panelMyArticle" aria-controls="panelMyArticle" role="tab" data-toggle="tab">我的博文</a></li>
        <li role="presentation"><a href="#panelMyFollow" aria-controls="panelMyFollow" role="tab" data-toggle="tab">我的关注</a></li>
        <li role="presentation"><a href="#panelMyFan" aria-controls="panelMyFan" role="tab" data-toggle="tab">我的粉丝</a></li>
        <li role="presentation"><a href="#panelMyLike" aria-controls="panelMyLike" role="tab" data-toggle="tab">我赞的博文</a></li>
        <li role="presentation"><a href="#panelMyDonate" aria-controls="panelMyDonate" role="tab" data-toggle="tab">我打赏的博文</a></li>
        <li role="presentation"><a href="#panelMyNotis" aria-controls="panelMyNotis" role="tab" data-toggle="tab">消息管理</a></li>
        <li role="presentation"><a href="#panelMyComment" aria-controls="panelMyComment" role="tab" data-toggle="tab">评论管理</a></li>
        <li role="presentation"><a href="#panelMyWhisper" aria-controls="panelMyWhisper" role="tab" data-toggle="tab">私信</a></li>
        <li role="presentation"><a href="#panelMyLeaveMsg" aria-controls="panelMyLeaveMsg" role="tab" data-toggle="tab">留言墙</a></li>
        <li role="presentation"><a href="#panelMyInfo" aria-controls="panelMyInfo" role="tab" data-toggle="tab">个人信息</a></li>
    </ul>
    <div class="tab-content col-xs-12 col-sm-10 col-md-10 col-lg-10">
        <div role="tabpanel" class="tab-pane active" id="panelMyArticle">
            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                <blockquote>
                    <strong>我的博文</strong>
                </blockquote>
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
                        <span style="color: red;">删除</span>&nbsp;
                        <a href="#"> <span class="glyphicon glyphicon-heart" style="color: red;"></span></a>
                        <span>(263)</span>
                        <span class="glyphicon glyphicon-comment"></span>
                        <span>(263)</span>
                    </div>
                </div>
            </div>
            </div>
        </div>
        <div role="tabpanel" class="tab-pane" id="panelMyFollow">
            <div class="col-xs-12 col-sm-6 col-md-4 col-lg-4">
                <blockquote>
                    <strong>我的关注</strong>
                </blockquote>
            <div class="panel panel-warning">
                <div class="panel-heading">
                    <img src="https://ss0.baidu.com/6ONWsjip0QIZ8tyhnq/it/u=2198761902,335858300&fm=173&s=4E1105C742776D961911D48A0300F091&w=218&h=146&img.JPEG"
                              class="img-responsive img-circle"
                              style="width: 50px;height: 50px;display: inline;"/>
                    <span class="text-info">胡斯庭</span>
                </div>
                <div class="panel-body" style="text-align: center;">
                    关注 4 | 粉丝 4 | 博文 1
                </div>
                <div class="panel-footer" style="text-align: center;">
                    2014级Java3班
                </div>
            </div>
            </div>
        </div>
        <div role="tabpanel" class="tab-pane" id="panelMyFan">
            <div class="col-xs-12 col-sm-6 col-md-4 col-lg-4">
                <blockquote>
                    <strong>我的粉丝</strong>
                </blockquote>
                <div class="panel panel-warning">
                    <div class="panel-heading">
                        <img src="https://ss0.baidu.com/6ONWsjip0QIZ8tyhnq/it/u=2198761902,335858300&fm=173&s=4E1105C742776D961911D48A0300F091&w=218&h=146&img.JPEG"
                             class="img-responsive img-circle"
                             style="width: 50px;height: 50px;display: inline;"/>
                        <span class="text-info">胡斯庭</span>
                    </div>
                    <div class="panel-body" style="text-align: center;">
                        关注 4 | 粉丝 4 | 博文 1
                    </div>
                    <div class="panel-footer" style="text-align: center;">
                        2014级Java3班
                    </div>
                </div>
            </div>
        </div>
        <div role="tabpanel" class="tab-pane" id="panelMyLike">
            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                <blockquote>
                    <strong>我赞的博文</strong>
                </blockquote>
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
        <div role="tabpanel" class="tab-pane" id="panelMyDonate">
            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                <blockquote>
                    <strong>我打赏的博文</strong>
                </blockquote>
            <div class="panel panel-info">
                <div class="panel-heading"><span class="text-info">胡斯庭</span>：Panel heading
                    <div style="display: inline;float: right">已打赏20.00</div>
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
        <div role="tabpanel" class="tab-pane" id="panelMyNotis">
            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                <blockquote>
                    <strong>我的消息</strong>
                </blockquote>
                <div class="panel panel-danger">
                    <div class="panel-body">
                        <span class="text-danger">系统消息</span>
                        ：
                        <span class="text-info">胡斯庭</span>
                        <span class="">点赞了你的文章</span>
                        <div style="display: inline;float: right">2分钟前</div>
                    </div>
                    <div class="panel-footer">
                        <span>来自博文：XXS预防</span>
                        <span style="color: red;float: right">删除</span>
                    </div>
                </div>
                <div class="panel panel-danger">
                    <div class="panel-body">
                        <span class="text-danger">系统消息</span>
                        ：
                        <span class="text-info">胡斯庭</span>
                        <span class="">打赏了你的文章2000咖喱币</span>
                        <div style="display: inline;float: right">2分钟前</div>
                    </div>
                    <div class="panel-footer">
                        <span>来自博文：XXS预防</span>
                        <span style="color: red;float: right">删除</span>
                    </div>
                </div>
            </div>
        </div>
        <div role="tabpanel" class="tab-pane" id="panelMyComment">
            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                <blockquote>
                    <strong>我的评论</strong>
                </blockquote>
                <div class="panel panel-info">
                    <div class="panel-body">
                        <span class="text-info">胡斯庭</span>
                        回复
                        <span class="text-info">董雨潇</span>
                        ：
                        <span class="">哈哈哈有意思</span>
                        <div style="display: inline;float: right">2分钟前</div>
                    </div>
                    <div class="panel-footer">
                        <span>来自博文：XXS预防</span>
                        <span style="color: red;float: right">删除</span>
                    </div>
                </div>
            </div>
        </div>
        <div role="tabpanel" class="tab-pane" id="panelMyWhisper">
            <div class="col-xs-6 col-sm-3 col-md-3 col-lg-3">
                <blockquote>
                    <strong>私信</strong>
                </blockquote>
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        最近联系好友：
                    </div>
                    <div class="panel-body">
                        <div class="text-info">胡斯庭</div>
                        <div class="text-info">董雨潇</div>
                    </div>
                </div>
            </div>
            <div class="col-xs-6 col-sm-5 col-md-5 col-lg-5">
                <div class="input-group" style="margin-bottom: 5px;">
                    <input type="text" class="form-control" placeholder="搜好友" aria-describedby="basic-addon2">
                    <span class="input-group-addon" id="basic-addon2"><span class="glyphicon glyphicon-search"></span></span>
                </div>
                <div>
                    <div class="panel panel-primary" style="margin-bottom: 5px;">
                        <div class="panel-heading">
                            2014级Java3班
                        </div>
                        <div class="panel-body">
                            <div class="text-info">胡斯庭</div>
                        </div>
                    </div>
                    <div class="panel panel-primary" style="margin-bottom: 5px;">
                        <div class="panel-heading">
                            2014级Java3班
                        </div>
                        <div class="panel-body">
                            <div class="text-info">胡斯庭</div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div role="tabpanel" class="tab-pane" id="panelMyLeaveMsg">
            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                <blockquote>
                    <strong>留言墙</strong>
                </blockquote>
                <div class="panel panel-success">
                    <div class="panel-heading"><span class="text-info">胡斯庭</span>
                        <div style="display: inline;float: right">2分钟前</div>
                    </div>
                    <div class="panel-body">
                        踩踩
                        <span style="color: red;float: right">删除</span>
                    </div>
                </div>
            </div>
        </div>
        <div role="tabpanel" class="tab-pane" id="panelMyInfo">
            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                <blockquote>
                    <strong>个人信息</strong>
                </blockquote>
                <form>
                    <p class="bg-info text-muted" style="text-align: center;">基本信息</p>
                    <div class="form-group" style="width: 46.5%;float: left;margin-left:2%;">
                        <label for="userHeadImg" style="display: block;">头像</label>
                        <div  style="float: left;line-height: 50px;width:75%;">
                        <div class="input-group">
                        <input id="userHeadImg" type="text" class="form-control" style="margin-top:8px;" placeholder="仅限jpg,png,jpeg"/>
                        <div class="input-group-btn">
                            <button type="button" class="btn btn-default" onclick="$('input[id=lefile]').click();">选择本地</button>
                            <button type="button" class="btn btn-default">预览</button>
                        </div>
                            <input id="lefile" type="file" style="display:none"/>
                        </div>
                        </div>
                        <div  style="float: left;margin-left: 5%;">
                            <img src="https://ss0.baidu.com/6ONWsjip0QIZ8tyhnq/it/u=2198761902,335858300&fm=173&s=4E1105C742776D961911D48A0300F091&w=218&h=146&img.JPEG"
                                 class="img-responsive img-circle"
                                 style="width: 50px;height: 50px;"/>
                        </div>
                    </div>
                    <div class="clearfix"></div>
                    <div class="form-group" style="width: 46.5%;float: left;margin-left:2%;">
                        <label for="userId">用户名</label>
                        <input type="text" class="form-control" id="userId" value="jiumam123" readonly>
                    </div>
                    <div class="form-group" style="width: 46.5%;float: left;margin-left:3%;">
                        <label for="userName">姓名</label>
                        <input type="text" class="form-control" id="userName" value="胡斯庭" readonly>
                    </div>
                    <div class="clearfix"></div>
                    <div class="form-group" style="width: 46.5%;float: left;margin-left:2%;">
                        <label for="userIntro">简介</label>
                        <input type="text" class="form-control" id="userIntro" value="咖喱万岁！" name="inputIntro">
                    </div>
                    <div class="form-group" style="width: 46.5%;float: left;margin-left:3%;">
                        <label for="birthday">生日</label>
                        <input type="date" class="form-control" id="birthday" name="inputBirthday"/>
                    </div>
                    <div class="clearfix"></div>
                    <div class="form-group" style="width: 46.5%;float: left;margin-left:2%;">
                        <label style="display: block;">性别</label>
                        <label class="radio-inline">
                            <input type="radio" name="sex" id="sexRadio1" value="1"> 男
                        </label>
                        <label class="radio-inline">
                            <input type="radio" name="sex" id="sexRadio2" value="0"> 女
                        </label>
                    </div>
                    <div class="clearfix"></div>
                    <p class="bg-info text-muted" style="text-align: center;">联系信息</p>
                    <div class="form-group" style="width: 46.5%;float: left;margin-left: 2%;">
                        <label for="userGrade">年级</label>
                        <input type="number" class="form-control" id="userGrade" name="inputGrade">
                    </div>
                    <div class="form-group" style="width: 46.5%;float: left;margin-left:3%;">
                        <label for="userSpec">方向</label>
                        <select class="form-control" id="userSpec">
                            <option>Java</option>
                            <option>OpenSource</option>
                            <option>.Net</option>
                        </select>
                    </div>
                    <div class="clearfix"></div>
                    <div class="form-group" style="width: 46.5%;float: left;margin-left:2%;">
                        <label for="userClass">班级</label>
                        <input type="number" class="form-control" id="userClass" name="inputClass">
                    </div>
                    <div class="form-group" style="width: 46.5%;float: left;margin-left:3%;">
                        <label for="userQQ">QQ</label>
                        <input type="number" class="form-control" id="userQQ" name="inputQQ">
                    </div>
                    <div class="clearfix"></div>
                    <p class="bg-info text-muted" style="text-align: center;">私密信息</p>
                    <div class="clearfix"></div>
                    <div class="form-group" style="width: 46.5%;float: left;margin-left:2%;">
                        <label for="userMoney">咖喱币</label>
                        <input type="number" class="form-control" id="userMoney" name="inputMoney">
                    </div>
                    <div class="clearfix"></div>
                    <p class="bg-info text-muted" style="text-align: center;">修改密码</p>
                    <div class="clearfix"></div>
                    <div class="form-group" style="width: 46.5%;float: left;margin-left:2%;">
                        <label for="userPass1">新密码</label>
                        <input type="password" class="form-control" id="userPass1" name="inputPass1">
                    </div>
                    <div class="form-group" style="width: 46.5%;float: left;margin-left:3%;">
                        <label for="userPass2">确认密码</label>
                        <input type="password" class="form-control" id="userPass2" name="inputPass2">
                    </div>
                    <div class="clearfix"></div>
                    <hr/>
                    <div class="form-group col-xs-12 col-sm-12 col-md-12 col-lg-12" style="text-align: center;">
                        <button type="submit" name="submit" class="btn btn-primary">确认修改</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
<%@include file="common/bottom.jsp"%>
<script src="<%=request.getContextPath()%>/statics/js/myinfo.js"></script>
<script type="text/javascript">
    $('input[id=lefile]').change(function() {
        $('#userHeadImg').val($(this).val());
    });
</script>
</body>
</html>
