package com.zhu.designpattern.creational.factory.abstractfactory.demo;

/**
 * @description: ConcreteProductA1 具体产品A1
 * @date: 2023/6/24 15:38
 * @author: zdp
 * @version: 1.0
 */
public class ConcreteProductA1 implements ProductA{
    @Override
    public void use() {
        System.out.println("使用具体产品A1");
    }
}
