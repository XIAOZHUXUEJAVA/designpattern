package com.zhu.designpattern.creational.factory.abstractfactory.demo;

/**
 * @description: ConcreteProductB2 具体产品B2
 * @date: 2023/6/24 15:42
 * @author: zdp
 * @version: 1.0
 */
public class ConcreteProductB2 implements ProductB {
    @Override
    public void consume() {
        System.out.println("消费了具体产品B2");
    }
}
