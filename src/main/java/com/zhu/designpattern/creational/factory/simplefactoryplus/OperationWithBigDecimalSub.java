package com.zhu.designpattern.creational.factory.simplefactoryplus;

import java.math.BigDecimal;

/**
 * @description: OperationSub
 * @date: 2023/4/7 21:22
 * @author: zdp
 * @version: 1.0
 */
public class OperationWithBigDecimalSub extends OperationWithBigDecimal {
    @Override
    public BigDecimal result() {
        return this.getNumA().subtract(this.getNumB()).setScale(4, BigDecimal.ROUND_HALF_UP);
    }

    public static void main(String[] args) {
        OperationWithBigDecimal operation = new OperationWithBigDecimalSub();
        operation.setNumA(new BigDecimal("1.4"));
        operation.setNumB(new BigDecimal("1.2"));
        BigDecimal result = operation.result();
        BigDecimal expected = new BigDecimal("0.2000");
        int cmp = result.compareTo(expected);
        System.out.println(cmp);
        System.out.println(result);
    }

}

