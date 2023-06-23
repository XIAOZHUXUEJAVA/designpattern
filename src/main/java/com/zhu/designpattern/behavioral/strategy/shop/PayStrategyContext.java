package com.zhu.designpattern.behavioral.strategy.shop;

import java.math.BigDecimal;

/**
 * @description: StrategyContext
 * @date: 2023/4/9 21:55
 * @author: zdp
 * @version: 1.0
 */
public class PayStrategyContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void executePayStrategy(BigDecimal money) {
        paymentStrategy.pay(money);
    }
}
