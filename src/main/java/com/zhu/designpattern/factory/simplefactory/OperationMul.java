package com.zhu.designpattern.factory.simplefactory;

/**
 * @description: OperationMul 乘法类
 * @date: 2023/4/7 19:23
 * @author: zdp
 * @version: 1.0
 */
public class OperationMul extends Operation {
    @Override
    public double result() {
        return numA * numB;
    }
}
