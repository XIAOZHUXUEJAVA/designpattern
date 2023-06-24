package com.zhu.designpattern.creational.factory.abstractfactory;

/**
 * @description: AbstractFactory 抽象工厂
 * @date: 2023/6/24 15:43
 * @author: zdp
 * @version: 1.0
 */
public interface AbstractFactory {
    ProductA createProductA();
    ProductB createProductB();
}
