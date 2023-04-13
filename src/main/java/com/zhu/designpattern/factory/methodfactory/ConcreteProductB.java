package com.zhu.designpattern.factory.methodfactory;

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
