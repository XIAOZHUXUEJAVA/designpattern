package com.zhu.designpattern.factory.simplefactoryplus;

import java.math.BigDecimal;

/**
 * @description: OperationDiv
 * @date: 2023/4/8 10:20
 * @author: zdp
 * @version: 1.0
 */
public class OperationWithBigDecimalDiv extends OperationWithBigDecimal {
    @Override
    public BigDecimal result() {

        if (getNumB().equals(BigDecimal.ZERO)) {
            throw new IllegalArgumentException("divided by 0");
        }
        return getNumA().divide(getNumB()).setScale(4, BigDecimal.ROUND_HALF_UP);
    }
}
