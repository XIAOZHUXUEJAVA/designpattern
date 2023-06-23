package com.zhu.designpattern.creational.factory.simplefactoryplus;

import java.math.BigDecimal;

/**
 * @description: OperationAdd
 * @date: 2023/4/7 20:53
 * @author: zdp
 * @version: 1.0
 */
public class OperationWithBigDecimalAdd extends OperationWithBigDecimal {
    @Override
    public BigDecimal result() {
        // 保留四位小数
        // 四舍五入
        return this.getNumA().add(this.getNumB()).setScale(4, BigDecimal.ROUND_HALF_UP);
    }
    public static void main(String[] args) {
        OperationWithBigDecimal operation = new OperationWithBigDecimalAdd();
        operation.setNumA(new BigDecimal("1.20005"));
        operation.setNumB(new BigDecimal("1.4"));
        BigDecimal result = operation.result();
        BigDecimal expected = new BigDecimal("2.6000");
        int cmp = result.compareTo(expected);
        System.out.println(cmp);
        System.out.println(result);
    }
}
