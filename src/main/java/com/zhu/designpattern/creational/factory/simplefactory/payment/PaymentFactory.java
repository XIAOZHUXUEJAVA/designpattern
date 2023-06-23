package com.zhu.designpattern.creational.factory.simplefactory.payment;

/**
 * @description: PaymentFactory
 * @date: 2023/6/23 21:46
 * @author: zdp
 * @version: 1.0
 */
public class PaymentFactory {
    public static Payment createPayment(PaymentType paymentType) {
        switch (paymentType) {
            case ALI_PAY:
                return new Alipay();
            case WECHAT_PAY:
                return new WeChatPay();
            case CREDIT_CARD_PAY:
                return new CreditCardPay();
            default:
                throw new IllegalArgumentException("Invalid payment type: " + paymentType);
        }
    }
}
