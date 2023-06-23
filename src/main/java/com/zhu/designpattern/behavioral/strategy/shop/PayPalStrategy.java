package com.zhu.designpattern.behavioral.strategy.shop;

import java.math.BigDecimal;

/**
 * @description: PayPalStrategy
 * @date: 2023/4/8 14:50
 * @author: zdp
 * @version: 1.0
 */
public class PayPalStrategy implements PaymentStrategy {
    private String phoneNumber;

    public PayPalStrategy(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public void pay(BigDecimal money) {
        System.out.println(phoneNumber + ": paid " + money + " with PayPal");
    }
}
