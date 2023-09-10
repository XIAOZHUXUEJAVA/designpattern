package com.zhu.designpattern.creational.factory.abstractfactory.demo;

/**
 * @description: ConcreteProductB1 具体产品B1
 * @date: 2023/6/24 15:41
 * @author: zdp
 * @version: 1.0
 */
public class ConcreteProductB1 implements ProductB {
    @Override
    public void consume() {
        System.out.println("消费了具体产品B1");
    }
}
