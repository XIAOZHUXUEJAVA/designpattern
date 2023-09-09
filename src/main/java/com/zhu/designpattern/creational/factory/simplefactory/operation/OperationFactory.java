package com.zhu.designpattern.creational.factory.simplefactory.operation;


/**
 * @description: OperationFactory
 * @date: 2023/4/7 19:26
 * @author: zdp
 * @version: 1.0
 */
public class OperationFactory {

    public static Operation createOperation(char operator) {
        Operation operation = null;
        switch (operator) {
            case '+':
                operation = new OperationAdd();
                break;
            case '-':
                operation = new OperationSub();
                break;
            case '*':
                operation = new OperationMul();
                break;
            case '/':
                operation = new OperationDiv();
                break;
            default:
                throw new IllegalArgumentException("Invalid operator type: " + operator);
        }
        return operation;
    }
}
