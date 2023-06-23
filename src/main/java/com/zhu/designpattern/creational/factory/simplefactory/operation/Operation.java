package com.zhu.designpattern.creational.factory.simplefactory.operation;

/**
 * @description: Operator 操作抽象类
 * @date: 2023/4/7 19:16
 * @author: zdp
 * @version: 1.0
 */
public abstract class Operation {
    public double numA;
    public double numB;

    /*
     * @Title: result
     * @Description: 抽象结果方法
     * @Author: zdp
     * @DateTime: 2023/4/7 19:18
     * @param
     * @return double 操作的结果
     * @throws
     */
    public abstract double result();
}
