package com.zhu.designpattern.creational.factory.simplefactory.payment;

/**
 * @description: Alipay
 * @date: 2023/6/23 21:40
 * @author: zdp
 * @version: 1.0
 */
public class Alipay implements Payment {
    @Override
    public void pay() {
        System.out.println("Pay with Alipay");
    }
}
