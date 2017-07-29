<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <%@include file="common/head.jsp"%>
</head>
<body>
<%@include file="common/nav.jsp"%>
<div class="col-xs-12 col-sm-8 col-sm-offset-2 col-md-offset-3 col-md-6 col-lg-offset-3 col-lg-6">
    <div class="alert alert-info" role="alert" style="text-align: center;"><strong>欢迎注册！</strong>请填写下面的注册表单</div>
    <form id="registerForm" class="form-horizontal" method="post" action="student/register" accept-charset="UTF-8">
        <div class="form-group">
            <label for="registerId" class="col-sm-2 control-label">用户名</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="registerId" placeholder="注册ID" name="inputRegisterId">
            </div>
        </div>
        <div class="form-group">
            <label for="registerName" class="col-sm-2 control-label">姓名</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="registerName" placeholder="真实姓名(注册后无法更改)" name="inputRegisterName">
            </div>
        </div>
        <div class="form-group">
            <label for="registerGrade" class="col-sm-2 control-label">年级</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="registerGrade" placeholder="范围1970到2017" name="inputRegisterGrade">
            </div>
        </div>
        <div class="form-group">
            <label for="registerSpec" class="col-sm-2 control-label">方向</label>
            <div class="col-sm-10">
                <select class="form-control" id="registerSpec" name="inputRegisterSpec" form="registerForm">
                    <option value="Java">Java</option>
                    <option value="OpenSource">OpenSource</option>
                    <option value=".Net">.Net</option>
                </select>
            </div>
        </div>
        <div class="form-group">
            <label for="registerClass" class="col-sm-2 control-label">班级</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="registerClass" placeholder="范围1到20" name="inputRegisterClass">
            </div>
        </div>
        <div class="form-group">
            <label for="registerPassword1" class="col-sm-2 control-label">密码</label>
            <div class="col-sm-10">
                <input type="password" class="form-control" id="registerPassword1" placeholder="输入密码" name="inputRegisterPassword1">
            </div>
        </div>
        <div class="form-group">
            <label for="registerPassword2" class="col-sm-2 control-label">确认密码</label>
            <div class="col-sm-10">
                <input type="password" class="form-control" id="registerPassword2" placeholder="再次输入密码" name="inputRegisterPassword2">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="form-control btn btn-info">注册</button>
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
////                alert("服务器异常");
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
                inputRegisterId: {
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
                        threshold :  6 , //有6字符以上才发送ajax请求，（input中输入一个字符，插件会向服务器发送一次，设置限制，6字符以上才开始）
                        remote: {//ajax验证。server result:{"valid",true or false} 向服务发送当前input name值，获得一个json数据。例表示正确：{"valid",true}
                            url: 'student/checkID',//验证地址
                            message: '用户已存在',//提示消息
                            delay :  2000,//每输入一个字符，就发ajax请求，服务器压力还是太大，设置2秒发送一次ajax（默认输入一个字符，提交一次，服务器压力太大）
                            type: 'POST'//请求方式
                        },
                        regexp: {
                            regexp: /^[a-zA-Z0-9_]+$/,
                            message: '用户名只能包含大写、小写、数字和下划线'
                        }
                    }
                },
                inputRegisterName: {
                    message: '姓名输入有误',
                    validators: {
                        notEmpty: {
                            message: '姓名不能为空'
                        },
                        stringLength: {
                            min: 2,
                            max: 10,
                            message: '姓名必须在2到10位之间'
                        }
                    }
                },
                inputRegisterPassword1: {
                    message: '密码输入有误',
                    validators: {
                        notEmpty: {
                            message: '密码不能为空'
                        },
                        stringLength: {
                            min: 6,
                            max: 20,
                            message: '密码必须在6到20位之间'
                        }
                    }
                },
                inputRegisterPassword2: {
                    message: '密码输入有误',
                    validators: {
                        notEmpty: {
                            message: '输入不能为空'
                        },
                        identical: {
                            field:'inputRegisterPassword1',
                            message: '输入与上面密码不一致'
                        }
                    }
                },
                inputRegisterGrade: {
                    message: '年级输入有误',
                    validators: {
                        notEmpty: {
                            message: '年级不能为空'
                        },
                        numeric: {
                            message: '请输入数字'
                        },
                        between:{
                            min: 1970,
                            max: 2017,
                            message: '请输入1970到2017的数值'
                        }
                    }
                },
                inputRegisterClass: {
                    message: '班级输入有误',
                    validators: {
                        notEmpty: {
                            message: '班级不能为空'
                        },
                        numeric: {
                            message: '请输入数字'
                        },
                        between:{
                            min: 1,
                            max: 20,
                            message: '请输入1到20的数值'
                        }
                    }
                }
            }
        });
    });
</script>
</body>
</html>
