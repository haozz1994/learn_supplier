package com.haozz.util.javaTest;

/**
 * <p>Coding</p>
 *
 * @author haozz
 * @version $Id: DemoClass.java, v 0.1 2019/1/3 19:59 haozz Exp $
 */
public class Test1 extends Father{
    private String name = "test";

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        System.out.println(test1.getName());
    }

}
