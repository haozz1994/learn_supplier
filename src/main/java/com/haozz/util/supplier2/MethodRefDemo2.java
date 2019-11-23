package com.haozz.util.supplier2;

/**
 * <p>Coding</p>
 *
 * @author haozz
 * @version $Id: DemoClass.java, v 0.1 2018/12/3 17:54 haozz Exp $
 */
public class MethodRefDemo2 {

    public static String stringOps(StringFunc sf,String s){
        return sf.func(s);
    }

    public static void main(String args[]){
            String inStr = "lambda add power to Java";
            MyStringOps strOps = new MyStringOps();

        //strOps::strReverse1相当于实现了接口方法func()

//        String outStr = stringOps(new StringFunc() {
//            @Override
//            public String func(String n) {
//                return strOps.strReverse1(n);
//            }
//        }, inStr);

//        String outStr = stringOps(n -> strOps.strReverse1(n),inStr);

        String outStr = stringOps(strOps::strReverse1,inStr);

        System.out.println("Original string: "+inStr);
        System.out.println("String reserved: "+outStr);
    }
}
