package com.haozz.util.javaTest;


/**
 * <p>Coding</p>
 *
 * @author haozz
 * @version $Id: DemoClass.java, v 0.1 2019/1/3 19:47 haozz Exp $
 */
public class Test {
//
//    public int div(int a,int b){
//        try{
//            return a/b;
//        }catch (Exception e){
//            System.out.println("Exception");
//        }finally {
//            System.out.println("finally");
//        }
//        return 0;
//    }
//
//    public static void main(String[] args) {
//        Test demo = new Test();
//        System.out.println("伤是："+demo.div(9,0));
//    }

    public int add(int a,int b){
        try{
            return a+b;
        }catch (Exception e){
            System.out.println("catch");
        }finally {
            System.out.println("finally");
        }
        return 0;
    }

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.add(9,34));
    }
}
