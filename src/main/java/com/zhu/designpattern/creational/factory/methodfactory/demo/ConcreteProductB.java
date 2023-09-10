package com.zhu.designpattern.creational.factory.methodfactory.demo;

/**
 * @description: ConcreteProductB
 * @date: 2023/4/13 10:38
 * @author: zdp
 * @version: 1.0
 */
public class ConcreteProductB implements Product {
    @Override
    public void operation() {
        System.out.println("ConcreteProductB's operation");
    }
}
