package com.haozz.util.supplier2;

/**
 * <p>Coding</p>
 *
 * @author haozz
 * @version $Id: DemoClass.java, v 0.1 2018/12/3 17:52 haozz Exp $
 */
public class MyStringOps {

    public String strReverse1(String str){
        String result = "";
        for(int i = str.length()-1;i>=0;i--){
            result += str.charAt(i);
        }
        return result;
    }
}
