package com.haozz.util.supplier1;

/**
 * <p>Coding</p>
 *
 * @author haozz
 * @version $Id: DemoClass.java, v 0.1 2018/12/3 17:00 haozz Exp $
 */
public class MethodDefDemo {

    public static String stringOp(StringFunc sf,String s){
        return sf.func(s);
    }

    public static void main(String args[]){
        String inStr = "lambda add power to Java";
        //MyStringOps::strReverse相当于实现了接口方法func()
        // 并在接口方法func()中作了MyStringOps.serReverse()操作

//        String outStr = stringOp(new StringFunc() {
//            @Override
//            public String func(String n) {
//                return MyStringOps.strReverse(n);
//            };
//        }, inStr);

//        String outStr = stringOp(n -> MyStringOps.strReverse(n) , inStr);
        String outStr = stringOp(MyStringOps::strReverse,inStr);
        System.out.println("Original string: "+inStr);
        System.out.println("String reserved: "+outStr);
    }
}
