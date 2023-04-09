package com.zhu.designpattern.strategy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @description: ShoppingCart
 * @date: 2023/4/8 15:17
 * @author: zdp
 * @version: 1.0
 */
public class ShoppingCart {
    private List<Item> items;

    private PayStrategyContext payStrategyContext;

    public void setPayStrategyContext(PayStrategyContext payStrategyContext) {
        this.payStrategyContext = payStrategyContext;
    }

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public List<Item> getItems() {
        return this.items;
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public BigDecimal calculateTotal() {
        return items.stream()
                .map(Item::getTotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public void pay() {
        BigDecimal money = calculateTotal();
        payStrategyContext.executePayStrategy(money);
        this.setCartItemsStatus(StrategyConstant.PAID);
    }

    public void setCartItemsStatus(Integer status) {
        this.items.stream().forEach(item -> item.setIsPaid(status));
    }


    public void getCartItemsStatus() {
        this.items.stream().forEach(item -> System.out.println(item.getIsPaid()));
    }
}
