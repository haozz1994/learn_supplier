package com.haozz.util.javaTest;

/**
 * <p>Coding</p>
 *
 * @author haozz
 * @version $Id: DemoClass.java, v 0.1 2018/12/13 21:39 haozz Exp $
 */
public class Parent {

    int i = 4;

    {
        i = 5;
        System.out.println(i);

    }

    Parent(){
        i = 7;
        System.out.println(i);

    }

    public void aaa(){
        i = 6;
        System.out.println(i);

    }
}
