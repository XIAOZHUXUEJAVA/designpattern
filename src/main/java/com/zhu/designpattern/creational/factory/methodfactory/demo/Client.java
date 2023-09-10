package com.zhu.designpattern.creational.factory.methodfactory.demo;

/**
 * @description: Client
 * @date: 2023/4/13 10:42
 * @author: zdp
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Factory factoryA = new ConcreteFactoryA();
        Product productA = factoryA.createProduct();
        productA.operation();

        Factory factoryB = new ConcreteFactoryB();
        Product productB = factoryB.createProduct();
        productB.operation();
    }
}
