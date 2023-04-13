package com.zhu.designpattern.factory.methodfactory;

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