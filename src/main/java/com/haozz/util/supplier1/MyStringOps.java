package com.haozz.util.supplier1;

/**
 * <p>Coding</p>
 *
 * @author haozz
 * @version $Id: DemoClass.java, v 0.1 2018/12/3 16:58 haozz Exp $
 */
public class MyStringOps {

    public static String strReverse(String str){
        String result = "";
        for(int i = str.length() -1 ;i >= 0 ;i--){
            result += str.charAt(i);

        }
        return result;
    }
}
