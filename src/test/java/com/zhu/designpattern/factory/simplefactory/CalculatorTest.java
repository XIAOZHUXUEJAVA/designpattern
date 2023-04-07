package com.zhu.designpattern.factory.simplefactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @description: Calculator
 * @date: 2023/4/7 19:35
 * @author: zdp
 * @version: 1.0
 */
public class CalculatorTest {
    Operation operation;
    char operator;

    @Test
    void testOperationAdd() {
        operator = '+';
        operation = OperationFactory.createOperation(operator);
        operation.numA = 2.4;
        operation.numB = 1.2;
        assertEquals(3.6, operation.result());
    }

    @Test
    void testOperationSub() {
        operator = '-';
        operation = OperationFactory.createOperation(operator);
        operation.numA = 2.4;
        operation.numB = 1.2;
        assertEquals(1.2, operation.result());
    }


}
