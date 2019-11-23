package com.haozz.util.javaTest;

/**
 * <p>Coding</p>
 *
 * @author haozz
 * @version $Id: DemoClass.java, v 0.1 2018/12/13 21:38 haozz Exp $
 */
public class JavaTest {

    public static void main(String args[]){
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t1");
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t2");
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t3");
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t4");
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t5");
            }
        }).start();

        System.out.println("t-main");

    }

}
