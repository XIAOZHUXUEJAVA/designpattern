package com.zhu.designpattern.strategy;

import java.math.BigDecimal;

/**
 * @description: CreditCardStrategy
 * @date: 2023/4/8 14:40
 * @author: zdp
 * @version: 1.0
 */
public class CreditCardStrategy implements PaymentStrategy {
    private String name;
    private String cardName;

    public CreditCardStrategy(String name, String cardName) {
        this.name = name;
        this.cardName = cardName;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }
    public String getCardName() {
        return this.cardName;
    }
    @Override
    public void pay(BigDecimal money) {
        System.out.println(name + ": paid " + money + " with credit card " + cardName);
    }
}
