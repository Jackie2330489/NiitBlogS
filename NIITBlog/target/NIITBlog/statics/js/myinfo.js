$(document).ready(function(){
    $('form').bootstrapValidator({
        message: 'This value is not valid',
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            inputGrade: {
                message: '年级输入有误',
                validators: {
                    notEmpty: {
                        message: '年级不能为空'
                    },
                    between:{
                        min: 1970,
                        max: 2017,
                        message: '请输入4位数'
                    }
                }
            },
            inputIntro: {
                message: '简介输入有误',
                validators: {
                    stringLength: {
                        max: 40,
                        message: '简介不能超过40'
                    }
                }
            },
            inputClass: {
                message: '班级输入有误',
                validators: {
                    notEmpty: {
                        message: '班级不能为空'
                    },
                    between:{
                        min: 1,
                        max: 20,
                        message: '1到20可输入'
                    }
                }
            },
            inputPass1: {
                message: '密码输入有误',
                validators: {
                    stringLength: {
                        min: 6,
                        max: 20,
                        message: '密码长度必须在6到20位之间'
                    }
                }
            },
            inputPass2: {
                message: '确认密码输入有误',
                validators: {
                    identical: {
                        field:'inputPass1',
                        message: '输入与新密码不一致'
                    }
                }
            }
        }
    });
});