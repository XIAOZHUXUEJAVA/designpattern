package com.zhu.designpattern.creational.factory.simplefactoryplus;


import java.math.BigDecimal;

/**
 * @description: OperationMul
 * @date: 2023/4/8 10:18
 * @author: zdp
 * @version: 1.0
 */
public class OperationWithBigDecimalMul extends OperationWithBigDecimal {
    @Override
    public BigDecimal result() {
        return getNumA().multiply(getNumB()).setScale(4, BigDecimal.ROUND_HALF_UP);
    }

    public static void main(String[] args) {
        OperationWithBigDecimal operation = new OperationWithBigDecimalMul();
        operation.setNumA(new BigDecimal("1.4"));
        operation.setNumB(new BigDecimal("1.2"));
        BigDecimal result = operation.result();
        // BigDecimal.valueOf(1.6800);
        BigDecimal expected = new BigDecimal("1.6800");
        System.out.println("result: " + result);
        System.out.println("expected: " + expected);
        int cmp = result.compareTo(expected);
        if (cmp == 0) {
            System.out.println("The result is as expected");
        } else {
            System.out.println("The result is not as expected");
        }
    }
}
