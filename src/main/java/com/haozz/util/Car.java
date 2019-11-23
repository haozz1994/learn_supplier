package com.haozz.util;

import java.util.function.Supplier;

/**
 * <p>Coding</p>
 *
 * @author haozz
 * @version $Id: DemoClass.java, v 0.1 2018/11/29 18:02 haozz Exp $
 */
class Car {

    int age = 0;

    //Supplier是jdk1.8的接口，这里和lamda一起使用了
    public static Car create(final Supplier<Car> supplier) {
        return supplier.get();
    }

    public static void collide(final Car car) {
        System.out.println("Collided  ; car.getAge = " + car.getAge());
    }

    public void follow(final Car another) {
        System.out.println("Following : this.age = " + this.getAge() + " ; car.getAge = " + another.getAge());
    }

    public void repair() {
        System.out.println("Repaired " + this.getAge());
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
