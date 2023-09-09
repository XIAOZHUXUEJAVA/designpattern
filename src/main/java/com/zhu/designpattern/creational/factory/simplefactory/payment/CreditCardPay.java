package com.zhu.designpattern.creational.factory.simplefactory.payment;

/**
 * @description: CreditCardPay
 * @date: 2023/6/23 21:42
 * @author: zdp
 * @version: 1.0
 */
public class CreditCardPay implements Payment {
    @Override
    public void pay() {
        System.out.println("Pay with creditCard");
    }
}
