package com.zhu.designpattern.creational.factory.simplefactory.operation;

/**
 * @description: OperationDiv
 * @date: 2023/4/7 19:23
 * @author: zdp
 * @version: 1.0
 */
public class OperationDiv extends Operation {
    @Override
    public double result() {
        if (0 == numB) {
            throw new ArithmeticException("The divisor is zero");
        }
        return numA / numB;
    }
}
