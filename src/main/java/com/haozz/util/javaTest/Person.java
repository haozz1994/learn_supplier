package com.haozz.util.javaTest;

import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * <p>Coding</p>
 *
 * @author haozz
 * @version $Id: DemoClass.java, v 0.1 2018/12/13 21:39 haozz Exp $
 */
public class Person extends Parent {

    int i = 1;

    {
        i = 2;
        System.out.println(i);
    }

    Person(){
        i = 11;
        System.out.println(i);
    }

    @Override
    public void aaa() {
        i = 10;
        System.out.println(i);
    }

    public static void main(String[] args) {
        int i = 12;
        System.out.println(i+=i-=i*=i);

//        InputStreamReader s = new InputStreamReader(new FileInputStream("1.dat"));
    }
}
