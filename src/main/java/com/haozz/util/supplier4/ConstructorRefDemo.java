package com.haozz.util.supplier4;


/**
 * <p>Coding</p>
 *
 * @author haozz
 * @version $Id: DemoClass.java, v 0.1 2018/12/3 19:14 haozz Exp $
 */
public class ConstructorRefDemo {
    public static void main(String args[]){

        MyFunc1 s = new MyFunc1() {
            @Override
            public MyClass func(int n) {
                return new MyClass(n);
            }
        };

        s = n -> new MyClass(n);


        MyFunc1 myClassCons = MyClass::new;
        MyClass mc = myClassCons.func(100);
        System.out.println("val in mc is: "+mc.getValue());
    }
}
