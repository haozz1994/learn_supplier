package com.haozz.util.supplier3;

import java.util.Arrays;
import java.util.Comparator;

/**
 * <p>Coding</p>
 *
 * @author haozz
 * @version $Id: DemoClass.java, v 0.1 2018/12/3 19:11 haozz Exp $
 */
public class Demo {

    public static  void  main(String args[]){
        String[] stringArray = { "Barbara", "James", "Mary", "John", "Patricia", "Robert", "Michael", "Linda" };
        Arrays.sort(stringArray, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });

        Arrays.sort(stringArray,(o1,o2) -> o1.compareToIgnoreCase(o2));

        Arrays.sort(stringArray,String::compareToIgnoreCase);

    }
}
