package com.haozz.util.supplier2;

/**
 * <p>Coding</p>
 *
 * @author haozz
 * @version $Id: DemoClass.java, v 0.1 2018/12/3 18:48 haozz Exp $
 */
public class MyArrayOps {

    public static <T> int countMatching(T[] vals,T v){
        int count = 0 ;
        for(int i = 0; i<vals.length;i++){
            if(vals[i] == v)count++;
        }
        return count;
    }
}
