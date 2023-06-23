package com.zhu.designpattern.creational.factory.simplefactory.payment;

/**
 * @description: WeChatPay
 * @date: 2023/6/23 21:41
 * @author: zdp
 * @version: 1.0
 */
public class WeChatPay implements Payment {
    @Override
    public void pay() {
        System.out.println("使用微信支付");
    }
}
