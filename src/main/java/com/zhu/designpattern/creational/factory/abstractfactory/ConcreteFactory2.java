package com.zhu.designpattern.creational.factory.abstractfactory;

/**
 * @description: ConcreteFactory2 具体工厂2
 * @date: 2023/6/24 15:45
 * @author: zdp
 * @version: 1.0
 */
public class ConcreteFactory2 implements AbstractFactory {

    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}
