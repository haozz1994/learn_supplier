package com.haozz.util.supplier1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <p>Coding</p>
 *
 * @author haozz
 * @version $Id: DemoClass.java, v 0.1 2018/12/3 17:26 haozz Exp $
 */
public class UseMethodRef {

    public static int compareMC(MyClass a, MyClass b) {
        return a.getValue() - b.getValue();
    }

    public static void main(String args[]) {
        List<MyClass> a1 = Arrays.asList(new MyClass(1), new MyClass(4), new MyClass(2), new MyClass(9), new MyClass(3), new MyClass(7));

        //UseMethodRef::compareMC生成了抽象接口Comparator定义的compare()方法的实例

//        MyClass maxValObj = Collections.max(a1, new Comparator<MyClass>() {
//            @Override
//            public int compare(MyClass o1, MyClass o2) {
//                return UseMethodRef.compareMC(o1,o2);
//            }
//        });

//        MyClass maxValObj = Collections.max(a1,(o1,o2) -> UseMethodRef.compareMC(o1,o2));

        MyClass maxValObj = Collections.max(a1, UseMethodRef::compareMC);
        System.out.println("Maximum value is: " + maxValObj.getValue());
    }
}
