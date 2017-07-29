<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
    String cookieUSID="";
    String cookieNIITID="";
    Cookie cookies[]= request.getCookies();
    if(cookies!=null){
        for(Cookie cookie:cookies){
            if(cookie.getName().equals("USID")){
                cookieUSID=cookie.getValue();
            }
            if(cookie.getName().equals("NIITID")){
                cookieNIITID=cookie.getValue();
            }
        }
    }
%>
<script>
    var cookieUSID="<%=cookieUSID%>";
    var cookieNIITID="<%=cookieNIITID%>";
</script>
<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="<%=basePath%>rindex">NIIT BLOG</a>
            <p class="navbar-text">学生博客</p>
        </div>
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <form class="navbar-form navbar-left">
                <div class="input-group">
                    <input type="text" class="form-control" placeholder="输入关键字、标签等">
                    <div class="input-group-btn">
                        <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><p id="searchType" style="display: inline;">搜博文</p><span class="caret"></span></button>
                        <ul id="searchDropdown" class="dropdown-menu dropdown-menu-right">
                            <li><a href="#">搜博文</a></li>
                            <li><a href="#">搜博主</a></li>
                        </ul>
                    </div>
                </div>
                <button type="submit" class="btn btn-default">搜索</button>
            </form>
            <ul id="navbarPartR" class="nav navbar-nav navbar-right">
                <li><a href="<%=basePath%>register">注册</a></li>
                <li><a href="<%=basePath%>login">登录</a></li>
            </ul>
            <ul id="navbarPartL" class="nav navbar-nav navbar-right" style="display: none;">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" id="allUnRead" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">消息<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#" id="unReadFans">关注<span class="badge">4</span></a></li>
                        <li><a href="#" id="unReadLikes">点赞<span class="badge">4</span></a></li>
                        <li><a href="#" id="unReadComment">评论<span class="badge">4</span></a></li>
                        <li><a href="#" id="unReadDonate">打赏<span class="badge">4</span></a></li>
                        <li><a href="#" id="unReadWhisper">私信<span class="badge">4</span></a></li>
                        <li><a href="#" id="unReadLeaveMsg">留言<span class="badge">4</span></a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" id="navbarStudentName" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">- <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">我的主页</a></li>
                        <li><a href="#">我的博文</a></li>
                        <li><a href="#">我的关注</a></li>
                        <li><a href="#">我的粉丝</a></li>
                        <li><a href="#">个人信息</a></li>
                        <li><a href="#" id="logout">退出登录</a></li>
                    </ul>
                </li>
                <li>
                    <a href="#"><span class="glyphicon glyphicon-edit"></span>写博文</a>
                </li>
            </ul>
        </div>
    </div>
</nav>