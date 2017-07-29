package util;

import org.apache.commons.lang.StringEscapeUtils;

/**
 * Created by Justin on 2017/7/27.
 */
public class XSSUtil {
    //Spring的预防XSS,sql注入的工具
    public static String killXSS(String input){
        return StringEscapeUtils.escapeJavaScript(StringEscapeUtils.escapeHtml(StringEscapeUtils.escapeSql(input)));
    }
    public static String backXSS(String input){
        return StringEscapeUtils.unescapeHtml(StringEscapeUtils.unescapeJavaScript(input));
    }
}
