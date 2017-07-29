<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <%@include file="common/head.jsp"%>
</head>
<body>
<%@include file="common/nav.jsp"%>
<div class="col-xs-12 col-sm-8 col-sm-offset-2 col-md-offset-3 col-md-6 col-lg-offset-3 col-lg-6">
    <div class="alert alert-success" role="alert" style="text-align: center;"><strong>欢迎登录！</strong>请输入用户名和密码</div>
    <form class="form-horizontal" method="post" action="student/login">
        <div class="form-group">
            <label for="loginId" class="col-sm-2 control-label">用户名</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="loginId" placeholder="登录ID" name="inputLoginId">
            </div>
        </div>
        <div class="form-group">
            <label for="loginPassword" class="col-sm-2 control-label">密码</label>
            <div class="col-sm-10">
                <input type="password" class="form-control" id="loginPassword" placeholder="输入密码" name="inputLoginPassword">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="form-control btn btn-info">登录</button>
            </div>
        </div>
    </form>
</div>
<a href="#top" target="_self" class="btn btn-info btn-lg" style="right: 0px;bottom:10%;" data-spy="affix"><span class="glyphicon glyphicon-plane"></span></a>
<script src="<%=request.getContextPath()%>/statics/js/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/statics/js/bootstrap.min.js"></script>
<script src="<%=request.getContextPath()%>/statics/js/bootstrapValidator.min.js"></script>
<script src="<%=request.getContextPath()%>/statics/js/jquery.cookie.js"></script>
<script src="<%=request.getContextPath()%>/statics/js/mybox.js"></script>
<script>
    $(document).ready(function(){
        if(!(cookieUSID==""||cookieUSID==null||cookieNIITID==""||cookieNIITID==null)){
//            alert(cookieUSID+","+cookieNIITID);
            window.location.href=$.mybox.getProjectUrl()+"index";
        }
        $("#navbarPartR").css("display","inline");
        $("#navbarPartL").css("display","none");
//        $.ajax({
//            url: $.mybox.getProjectUrl()+"student/checkCookie",
//            type: "post",
//            success: function (data) {
//                if(data=='yes'){
//                    window.location.href=$.mybox.getProjectUrl()+"index";
//                }else{
//                    $.cookie('USID',null);
//                    $.cookie('NIITID',null);
//                }
//            },
//            error: function (e) {
////                alert("loginjsp服务器异常");
//            }
//        });
        var windowWidth=$(window).width();
        if(windowWidth>=768&&windowWidth<=991) {
            $("body").css("padding-top","110");
        }

        $("#searchDropdown").click(function(e){
            var target=e.target;
            $("#searchType").text(target.text);
        });
        $('form').bootstrapValidator({
            message: 'This value is not valid',
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
                inputLoginId: {
                    message: '用户名输入有误',
                    validators: {
                        notEmpty: {
                            message: '用户名不能为空'
                        },
                        stringLength: {
                            min: 6,
                            max: 12,
                            message: '用户名必须在6到12位之间'
                        },
                        regexp: {
                            regexp: /^[a-zA-Z0-9_]+$/,
                            message: '用户名只能包含大写、小写、数字和下划线'
                        }
                    }
                },
                inputLoginPassword: {
                    message: '密码输入有误',
                    validators: {
                        stringLength: {
                            min: 6,
                            max: 20,
                            message: '密码必须在6到20位之间'
                        }
                    }
                }
            }
        });
    });
</script>
</body>
</html>
