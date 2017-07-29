package util;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Justin on 2017/7/27.
 */
public class XSSUtilTest {

    @Test
    public void killXSS() throws Exception {
        String input="胡斯庭";
        String output=XSSUtil.killXSS(input);
//        String haha=XSSUtil.backXSS(input);
        String haha=XSSUtil.killXSS(output);
        System.out.println("output:"+output);
        System.out.println("haha:"+haha);
//        if(output.equals(input)) System.out.println("Same");
    }

    @Test
    public void backXSS() throws Exception {
    }

}