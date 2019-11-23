package com.haozz.util.javaTest.ocp;

/**
 * <p>Coding</p>
 *
 * @author haozz
 * @version $Id: DemoClass.java, v 0.1 2019/1/8 22:21 haozz Exp $
 */
public class GuyWeapon implements WeaponInterface {
    @Override
    public void action() {
        System.out.println("this is a guy;");
    }
}
