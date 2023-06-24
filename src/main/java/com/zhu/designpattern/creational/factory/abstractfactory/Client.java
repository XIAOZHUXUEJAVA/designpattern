package com.zhu.designpattern.creational.factory.abstractfactory;

/**
 * @description: Client 客户端
 * @date: 2023/6/24 15:46
 * @author: zdp
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        ProductA productA1 = factory1.createProductA();
        ProductB productB1 = factory1.createProductB();
        productA1.use();
        productB1.consume();

        System.out.println();

        AbstractFactory factory2 = new ConcreteFactory1();
        ProductA productA2 = factory2.createProductA();
        ProductB productB2 = factory2.createProductB();
        productA2.use();
        productB2.consume();

    }
}
