package com.zhu.designpattern.creational.factory.abstractfactory.demo;

/**
 * @description: ConcreteProductA2 具体产品A2
 * @date: 2023/6/24 15:39
 * @author: zdp
 * @version: 1.0
 */
public class ConcreteProductA2 implements ProductA {

    @Override
    public void use() {
        System.out.println("使用具体产品A2");
    }
}
