package com.zhu.designpattern.creational.factory.methodfactory.demo;

/**
 * @description: ConcreteFactoryA
 * @date: 2023/4/13 10:40
 * @author: zdp
 * @version: 1.0
 */
public class ConcreteFactoryA extends Factory {

    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
