package com.zhu.designpattern.decotator.clothes;

import java.lang.reflect.Field;

/**
 * @description: Client
 * @date: 2023/4/12 14:50
 * @author: zdp
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Person person = new Person("xiaozhu");

        Tshirt tshirt = new Tshirt();
        BigTrouser bigTrouser = new BigTrouser();

        bigTrouser.decorate(person);
        tshirt.decorate(bigTrouser);
        tshirt.show();
    }
}
