package com.zhu.designpattern.creational.factory.abstractfactory.demo;

/**
 * @description: ConcreteFactory1 具体工厂1
 * @date: 2023/6/24 15:44
 * @author: zdp
 * @version: 1.0
 */
public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}
