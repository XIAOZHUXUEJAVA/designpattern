package com.zhu.designpattern.strategy;

import com.zhu.designpattern.behavioral.strategy.shop.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

/**
 * @description: ShopTest
 * @date: 2023/4/8 15:32
 * @author: zdp
 * @version: 1.0
 */
public class ShopTest {

    @Test
    void testCartTotal() {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item(1234L, 12345L, "鼠标", 10, new BigDecimal("2.50"));
        Item item2 = new Item(1235L, 12346L, "键盘", 10, new BigDecimal("1.50"));
        Item item3 = new Item(1236L, 12347L, "耳机", 10, new BigDecimal("1.00"));

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);

        System.out.println(cart.calculateTotal());

    }

    @Test
    void testPayPalStrategy() {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item(1234L, 12345L, "鼠标", 10, new BigDecimal("2.50"));
        Item item2 = new Item(1235L, 12346L, "键盘", 10, new BigDecimal("1.50"));
        Item item3 = new Item(1236L, 12347L, "耳机", 10, new BigDecimal("1.00"));

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        cart.getCartItemsStatus();
        PayPalStrategy paypal = new PayPalStrategy("4960");

        PayStrategyContext context = new PayStrategyContext();
        context.setPaymentStrategy(paypal);

        cart.setPayStrategyContext(context);
        cart.pay();
        cart.getCartItemsStatus();
    }
    @Test
    void testCreditCardStrategy() {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item(1234L, 12345L, "鼠标", 10, new BigDecimal("2.50"));
        Item item2 = new Item(1235L, 12346L, "键盘", 10, new BigDecimal("1.50"));
        Item item3 = new Item(1236L, 12347L, "耳机", 10, new BigDecimal("1.00"));

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        cart.getCartItemsStatus();
        CreditCardStrategy creditCard = new CreditCardStrategy("xiaozhu", "中国农业很行");


        cart.getCartItemsStatus();
    }

    @Test
    void testCreditCardDiscountStrategy() {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item(1234L, 12345L, "鼠标", 10, new BigDecimal("2.50"));
        Item item2 = new Item(1235L, 12346L, "键盘", 10, new BigDecimal("1.50"));
        Item item3 = new Item(1236L, 12347L, "耳机", 10, new BigDecimal("1.00"));

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);

        cart.getCartItemsStatus();

        CreditCardStrategy creditCard = new DiscountCreditCardStrategy("xiaozhu", "中国农业很行", 0.8F);

        cart.getCartItemsStatus();
    }
}
