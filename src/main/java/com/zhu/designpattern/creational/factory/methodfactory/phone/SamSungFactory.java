package com.zhu.designpattern.creational.factory.methodfactory.phone;

public class SamSungFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        return new Samsung();
    }
}
