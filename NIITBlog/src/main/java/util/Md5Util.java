package util;

import org.springframework.util.DigestUtils;

/**
 * Created by Justin on 2017/7/18.
 */
public class Md5Util {
    //盐值
    private static final String slat="hhkjlhlkh99y9gygg3w5dugut6";
    //单向加密工具
    public static String getMd5(Object object){
        String base=object+"/"+slat;
        return DigestUtils.md5DigestAsHex(base.getBytes());
    }
}
