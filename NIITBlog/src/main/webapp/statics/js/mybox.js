$.mybox = {
    getProjectUrl: function () {
        var pathName = window.location.pathname;
        var curWwwPath = window.document.location.href;
        var pos = curWwwPath.indexOf(pathName);
        var localhostPath = curWwwPath.substring(0, pos);
        var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1);
        return localhostPath + projectName + "/";
    },
    checkCookie: function () {
        $.ajax({
            url: $.mybox.getProjectUrl() + "student/checkCookie",
            type: "post",
            success: function (data) {
                if (data == 'no') {
                    $.cookie('USID', null);
                    $.cookie('NIITID', null);
                    window.location.href = $.mybox.getProjectUrl() + "register";
                }
            },
            error: function (e) {
                alert("homejs服务器异常");
            }
        });
    },
    SimpleArticle: function (name, title, time, bodi, tabs, likes, comments) {
        var gly = "";
        // if (ilike) gly = "glyphicon-heart";
        // else ;
        gly = "glyphicon-heart-empty"
        var tabHtml = "";
        for (var t in tabs) {
            tabHtml += "<span class='label label-default'>" + t.tagName + "</span>";
        }
        ;
        var htmls = "<div class='panel panel-info'>" +
            "<div class='panel-heading'><span class='text-info'>" + name + "</span>：" + title +
            "<div class='visible-xs visible-sm visible-md visible-lg' style='display: inline;float: right;'>" + time + "</div>" +
            "</div>" +
            "<div class='panel-body'>" + bodi +
            "</div>" +
            "<div class='panel-footer'>" +
            "<div class='visible-lg-inline visible-md-inline visible-sm-inline'>" +
            tabHtml +
            "</div>" +
            "<div style='display: inline;'>&nbsp;</div>" +
            "<div style='float:right;'>" +
            "<a href='#'> <span class='glyphicon " + gly + "' style='color: red;'></span></a>" +
            "<span>(" + likes + ")</span>" +
            "<span class='glyphicon glyphicon-comment'></span>" +
            "<span>(" + comments + ")</span>" +
            "</div>" +
            "</div>" +
            "</div>";
    },
    Format: function (now, mask) {
        var d = now;
        var zeroize = function (value, length) {
            if (!length) length = 2;
            value = String(value);
            for (var i = 0, zeros = ''; i < (length - value.length); i++) {
                zeros += '0';
            }
            return zeros + value;
        };

        return mask.replace(/"[^"]*"|'[^']*'|\b(?:d{1,4}|m{1,4}|yy(?:yy)?|([hHMstT])\1?|[lLZ])\b/g, function ($0) {
            switch ($0) {
                case 'd':
                    return d.getDate();
                case 'dd':
                    return zeroize(d.getDate());
                case 'ddd':
                    return ['Sun', 'Mon', 'Tue', 'Wed', 'Thr', 'Fri', 'Sat'][d.getDay()];
                case 'dddd':
                    return ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'][d.getDay()];
                case 'M':
                    return d.getMonth() + 1;
                case 'MM':
                    return zeroize(d.getMonth() + 1);
                case 'MMM':
                    return ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec'][d.getMonth()];
                case 'MMMM':
                    return ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'][d.getMonth()];
                case 'yy':
                    return String(d.getFullYear()).substr(2);
                case 'yyyy':
                    return d.getFullYear();
                case 'h':
                    return d.getHours() % 12 || 12;
                case 'hh':
                    return zeroize(d.getHours() % 12 || 12);
                case 'H':
                    return d.getHours();
                case 'HH':
                    return zeroize(d.getHours());
                case 'm':
                    return d.getMinutes();
                case 'mm':
                    return zeroize(d.getMinutes());
                case 's':
                    return d.getSeconds();
                case 'ss':
                    return zeroize(d.getSeconds());
                case 'l':
                    return zeroize(d.getMilliseconds(), 3);
                case 'L':
                    var m = d.getMilliseconds();
                    if (m > 99) m = Math.round(m / 10);
                    return zeroize(m);
                case 'tt':
                    return d.getHours() < 12 ? 'am' : 'pm';
                case 'TT':
                    return d.getHours() < 12 ? 'AM' : 'PM';
                case 'Z':
                    return d.toUTCString().match(/[A-Z]+$/);
                // Return quoted strings with the surrounding quotes removed
                default:
                    return $0.substr(1, $0.length - 2);
            }
        });
    }
}