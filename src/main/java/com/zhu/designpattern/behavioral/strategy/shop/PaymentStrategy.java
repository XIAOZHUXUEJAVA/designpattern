package com.zhu.designpattern.behavioral.strategy.shop;

import java.math.BigDecimal;

/**
 * @description: PaymentStrategy
 * @date: 2023/4/8 14:39
 * @author: zdp
 * @version: 1.0
 */
public interface PaymentStrategy {
    void pay(BigDecimal money);
}
