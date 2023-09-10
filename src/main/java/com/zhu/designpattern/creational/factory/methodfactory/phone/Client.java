package com.zhu.designpattern.creational.factory.methodfactory.phone;

public class Client {




    public static void main(String[] args) {
        PhoneFactory huaweiFactory = new HuaWeiFactory();
        Phone phone = huaweiFactory.createPhone();
        phone.display();

        PhoneFactory sumsangFactory = new SamSungFactory();
        Phone samsung = sumsangFactory.createPhone();
        samsung.display();
    }
}

