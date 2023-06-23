package com.zhu.designpattern.creational.factory.simplefactory.payment;

/**
 * @description: Main
 * @date: 2023/6/23 21:49
 * @author: zdp
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Payment payment1 = PaymentFactory.createPayment(PaymentType.ALI_PAY);
        payment1.pay();

        Payment payment2 = PaymentFactory.createPayment(PaymentType.WECHAT_PAY);
        payment2.pay();

        Payment payment3 = PaymentFactory.createPayment(PaymentType.CREDIT_CARD_PAY);
        payment3.pay();
    }
}
