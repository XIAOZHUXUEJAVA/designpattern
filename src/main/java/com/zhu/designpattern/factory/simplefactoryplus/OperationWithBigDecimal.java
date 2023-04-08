package com.zhu.designpattern.factory.simplefactoryplus;

import java.math.BigDecimal;

/**
 * @description: Operation
 * @date: 2023/4/7 20:51
 * @author: zdp
 * @version: 1.0
 */
public abstract class OperationWithBigDecimal {

    private BigDecimal numA;
    private BigDecimal numB;

    public abstract BigDecimal result();

    public OperationWithBigDecimal() {

    }

    public OperationWithBigDecimal(BigDecimal numA, BigDecimal numB) {
        this.numA = numA;
        this.numB = numB;
    }
    public void setNumA(BigDecimal numA){
        this.numA = numA;
    }
    public BigDecimal getNumA() {
        return this.numA;
    }
    public void setNumB(BigDecimal numB) {
        this.numB = numB;
    }
    public BigDecimal getNumB() {
        return numB;
    }
}
