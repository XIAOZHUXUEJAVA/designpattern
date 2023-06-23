package com.zhu.designpattern.factory.simplefactoryplus;

import com.zhu.designpattern.creational.factory.simplefactoryplus.OperationFactoryWithBigDecimal;
import com.zhu.designpattern.creational.factory.simplefactoryplus.OperationWithBigDecimal;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorWithBigDecimalTest {
    OperationWithBigDecimal operation;
    char operator;


    @Test
    void testOperationWithBigDecimalAdd() {
        operator = '+';
        operation = OperationFactoryWithBigDecimal.createOperation(operator);
        operation.setNumA(BigDecimal.valueOf(2.4));
        operation.setNumB(BigDecimal.valueOf(1.2));
        BigDecimal expected = new BigDecimal("3.6000");
        int cmp = operation.result().compareTo(expected);
        assertEquals(0, cmp);
    }

    @Test
    void testOperationWithBigDecimalSub() {
        operator = '-';
        operation = OperationFactoryWithBigDecimal.createOperation(operator);
        operation.setNumA(BigDecimal.valueOf(2.4));
        operation.setNumB(BigDecimal.valueOf(1.2));
        BigDecimal expected = new BigDecimal("1.2000");
        int cmp = operation.result().compareTo(expected);
        assertEquals(0, cmp);
    }

    @Test
    void testOperationWithBigDecimalMul() {
        operator = '*';
        operation = OperationFactoryWithBigDecimal.createOperation(operator);
        operation.setNumA(BigDecimal.valueOf(2.4));
        operation.setNumB(BigDecimal.valueOf(1.2));
        BigDecimal expected = new BigDecimal("2.8800");
        int cmp = operation.result().compareTo(expected);
        assertEquals(0, cmp);
    }

    @Test
    void testOperationWithBigDecimalDiv() {
        operator = '/';
        operation = OperationFactoryWithBigDecimal.createOperation(operator);
        operation.setNumA(BigDecimal.valueOf(2.4));
        operation.setNumB(BigDecimal.valueOf(1.2));
        BigDecimal expected = new BigDecimal("2.0000");
        int cmp = operation.result().compareTo(expected);
        assertEquals(0, cmp);
    }
    @Test
    void testOperationWithBigDecimalDivIllegal() {
        operator = '/';
        operation = OperationFactoryWithBigDecimal.createOperation(operator);
        operation.setNumA(BigDecimal.valueOf(2.4));
        operation.setNumB(BigDecimal.valueOf(0));
        BigDecimal expected = new BigDecimal("2.0000");
        int cmp = operation.result().compareTo(expected);
        assertEquals(0, cmp);
    }


}
