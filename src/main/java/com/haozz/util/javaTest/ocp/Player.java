package com.haozz.util.javaTest.ocp;

/**
 * <p>Coding</p>
 *
 * @author haozz
 * @version $Id: DemoClass.java, v 0.1 2019/1/8 18:38 haozz Exp $
 */
public class Player {

    private WeaponInterface weapon;
    private String name;

    public Player(WeaponInterface weapon, String name) {
        this.weapon = weapon;
        this.name = name;
    }

    public void action(){
        this.weapon.action();

    }

    public static void main(String[] args) {
        new Player(new GuyWeapon(),"guy").action();
    }

}
