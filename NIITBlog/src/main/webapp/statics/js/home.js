// $(document).ready(function(){
// $("#formbtn").click(function(){
//    $.ajax({
//        url:"file/test",
//        type:"post",
//        success:function(data){
//            alert(data);
//        },
//        error:function(e){
//            alert("no");
//        }
//    });
// });
// $("#Abtn").click(function(){
//    var formA=new FormData(document.getElementById("formA"));
//    $.ajax({
//        url:"file/upload",
//        type:"post",
//        data:formA,
//        contentType:false,
//        processData:false,
//        success:function(data){
//            alert("yes-"+data.data.path);
//            $("#iimm").attr("src",data.data.path);
//        },
//        error:function(e){
//            alert("no");
//        }
//    });
// });
// $("#dlForm").click(function(){
//    var dlForm=new FormData(document.getElementById("dlForm"));
//    $.ajax({
//        url:"file/download",
//        type:"post",
//        data:dlForm,
//        contentType:false,
//        processData:false,
//        success:function (data) {
//            alert("yes");
//        },
//        error:function (e) {
//            alert("no");
//        }
//    });
// });
// });

    if (cookieUSID == "" || cookieUSID == null || cookieNIITID == "" || cookieNIITID == null) {
        // alert("Cookie Null:" + "cookieUSID->" + cookieUSID + ",cookieNIITID->" + cookieNIITID);
        window.location.href = $.mybox.getProjectUrl() + "login";
    }

    // setTimeout($.mybox.checkCookie, 5000);
    setInterval($.mybox.checkCookie,5000);

    $("#navbarPartL").css("display","inline");
    $("#navbarPartR").css("display","none");

    var windowWidth = $(window).width();
    if (windowWidth >= 768 && windowWidth <= 991) {
        $("body").css("padding-top", "110");
    }

    $("#searchDropdown").click(function (e) {
        var target = e.target;
        $("#searchType").text(target.text);
    });

    // $("#navbarStudentName").html(data.data.name+"<span class='caret'></span>");
    $.ajax({
        url: $.mybox.getProjectUrl() + "noti/getUnRead",
        type: "post",
        data:{"studentId":cookieUSID},
        success: function (data) {
            if(data.success){
                var black="";
                $("#navbarStudentName").html(data.data.name+"<span class='caret'></span>");
                var allsum=data.data.fans+data.data.likes+data.data.comments+data.data.donates+data.data.whispers+data.data.leavemsgs;
                if(allsum!=0)black="<span class='badge'>"+allsum+"</span>";
                else black="";
                $("#allUnRead").html("消息"+black+"<span class='caret'></span>");

                if(data.data.fans!=0)black="<span class='badge'>"+data.data.fans+"</span>";
                else black="";
                $("#unReadFans").html("关注"+black);

                if(data.data.likes!=0)black="<span class='badge'>"+data.data.likes+"</span>";
                else black="";
                $("#unReadLikes").html("点赞"+black);

                if(data.data.comments!=0)black="<span class='badge'>"+data.data.comments+"</span>";
                else black="";
                $("#unReadComment").html("评论"+black);

                if(data.data.donates!=0)black="<span class='badge'>"+data.data.donates+"</span>";
                else black="";
                $("#unReadDonate").html("打赏"+black);

                if(data.data.whispers!=0)black="<span class='badge'>"+data.data.whispers+"</span>";
                else black="";
                $("#unReadWhisper").html("私信"+black);

                if(data.data.leavemsgs!=0)black="<span class='badge'>"+data.data.leavemsgs+"</span>";
                else black="";
                $("#unReadLeaveMsg").html("留言"+black);
            }
        },
        error: function (e) {
            alert("服务器异常");
        }
    });

    $("#logout").click(function (e) {
        $.cookie("USID",null);
        $.cookie("NIITID",null);
        $.ajax({
            url: $.mybox.getProjectUrl() + "student/delCookie",
            type: "post",
            success: function (data) {
                if (data == 'yes') {
                    window.location.href=$.mybox.getProjectUrl()+"login";
                }
            },
            error: function (e) {
                alert("服务器异常");
            }
        });
    });