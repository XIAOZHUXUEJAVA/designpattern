package com.zhu.designpattern.creational.factory.methodfactory.phone;

public class HuaWeiFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        return new HuaWei();
    }
}
