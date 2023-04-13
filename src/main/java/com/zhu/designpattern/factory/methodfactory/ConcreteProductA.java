package com.zhu.designpattern.factory.methodfactory;

/**
 * @description: ConcreteProductA
 * @date: 2023/4/13 10:37
 * @author: zdp
 * @version: 1.0
 */
public class ConcreteProductA implements Product {
    @Override
    public void operation() {
        System.out.println("ConcreteProductA's operation");
    }
}
