package com.zhu.designpattern.creational.factory.methodfactory.demo;

/**
 * @description: ConcreteFactoryB
 * @date: 2023/4/13 10:41
 * @author: zdp
 * @version: 1.0
 */
public class ConcreteFactoryB extends Factory {

    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}