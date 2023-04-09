package com.zhu.designpattern.factory.simplefactoryplus;

/*
 * 工厂模式解决了对象创建的问题，不同的操作创建不同的对象
 *
 */
public class OperationFactoryWithBigDecimal {

    public static OperationWithBigDecimal createOperation(char operator) {
        OperationWithBigDecimal operation = null;
        switch (operator) {
            case '+':
                operation = new OperationWithBigDecimalAdd();
                break;
            case '-':
                operation = new OperationWithBigDecimalSub();
                break;
            case '*':
                operation = new OperationWithBigDecimalMul();
                break;
            case '/':
                operation = new OperationWithBigDecimalDiv();
                break;
            default:
                throw new IllegalArgumentException("unsupported operation");
        }
        return operation;
    }
}
