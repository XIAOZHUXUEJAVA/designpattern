package com.zhu.designpattern.creational.factory.abstractfactory.demo;

import com.zhu.designpattern.creational.factory.abstractfactory.demo.ProductA;
import com.zhu.designpattern.creational.factory.abstractfactory.demo.ProductB;

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
