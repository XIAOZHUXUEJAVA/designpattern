package com.zhu.designpattern.factory.simplefactory;

/**
 * @description: OperationSub 减法类
 * @date: 2023/4/7 19:21
 * @author: zdp
 * @version: 1.0
 */
public class OperationSub extends Operation {
    @Override
    public double result() {
        return numA - numB;
    }
}
