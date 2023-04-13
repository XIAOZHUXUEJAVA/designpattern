package com.zhu.designpattern.factory.methodfactory;

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
