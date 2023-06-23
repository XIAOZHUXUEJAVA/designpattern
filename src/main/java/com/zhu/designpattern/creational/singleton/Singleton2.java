package com.zhu.designpattern.creational.singleton;

/**
 * @description: 懒汉式
 * @date: 2023/5/23 14:11
 * @author: zdp
 * @version: 1.0
 */
public class Singleton2 {
    public static void main(String[] args) {
        Order order1 = Order.getInstance();
        Order order2 = Order.getInstance();
        System.out.println(order1 == order2);
    }
}

class Order {
    private Order() {

    }
    private static Order instance = null;

    public static Order getInstance() {
        if (instance == null) {
            instance = new Order();
        }
        return instance;
    }
}
