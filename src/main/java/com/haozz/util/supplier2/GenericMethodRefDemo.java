package com.haozz.util.supplier2;

import java.util.Arrays;
import java.util.Comparator;

/**
 * <p>Coding</p>
 *
 * @author haozz
 * @version $Id: DemoClass.java, v 0.1 2018/12/3 18:50 haozz Exp $
 */
public class GenericMethodRefDemo {

    public static <T> int myOp(MyFunc<T> f, T[] vals, T v) {
        return f.func(vals, v);
    }

    public static void main(String args[]) {
        Integer[] vals = {1, 2, 3, 4, 2, 3, 4, 4, 5};
        String[] strs = {"One", "Two", "Three", "Two"};
        int count;

        count =myOp(new MyFunc<Integer>() {
            @Override
            public int func(Integer[] als, Integer v) {
                return MyArrayOps.countMatching(als,v);
            }
        }, vals, 4);

        count = myOp((als, v) -> MyArrayOps.countMatching(als,v),vals,4);

        count = myOp(MyArrayOps::<Integer>countMatching, vals, 4);
        System.out.println("vals contains " + count + " 4s");






        count = myOp(MyArrayOps::countMatching, strs, "Two");
        System.out.println("strs contais "+count+"Twos");



        }
}
