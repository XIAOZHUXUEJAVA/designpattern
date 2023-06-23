package com.zhu.designpattern.structral.adapter;

/**
 * @description: Adapter
 * @date: 2023/4/17 19:20
 * @author: zdp
 * @version: 1.0
 */
public class Adapter extends Target {
    private Adaptee adaptee = new Adaptee();


    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
