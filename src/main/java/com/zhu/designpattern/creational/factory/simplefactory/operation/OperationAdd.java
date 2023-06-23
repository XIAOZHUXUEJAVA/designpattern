package com.zhu.designpattern.creational.factory.simplefactory.operation;

/**
 * @description: OperationAdd 加法类
 * @date: 2023/4/7 19:19
 * @author: zdp
 * @version: 1.0
 */
public class OperationAdd extends Operation {

    @Override
    public double result() {
        return numA + numB;
    }
}
