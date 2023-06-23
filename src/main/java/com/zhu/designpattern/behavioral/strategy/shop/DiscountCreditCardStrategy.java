package com.zhu.designpattern.behavioral.strategy.shop;

import java.math.BigDecimal;

/**
 * @description: DiscountCashStrategy
 * @date: 2023/4/9 20:22
 * @author: zdp
 * @version: 1.0
 */
public class DiscountCreditCardStrategy extends CreditCardStrategy {

    private Float discount;

    public DiscountCreditCardStrategy(String name, String cardName, Float discount) {
        super(name, cardName);
        this.discount = discount;

    }

    @Override
    public void pay(BigDecimal money) {
        System.out.println(getName()+ ": paid " + money.multiply(BigDecimal.valueOf(discount)).setScale(2, BigDecimal.ROUND_HALF_DOWN) + " with credit card " + getCardName() + " using discount " + discount);
    }


}
