package com.kodilla.basic_assertion;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum(){
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testSubstract(){
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int substractResult = calculator.substract(a, b);
        assertEquals(-3, substractResult);
    }
    @Test
    public void testSquared() {
        Calculator calculator = new Calculator();
        {
            int a = -1;
            int squaredResult = calculator.squared(a);
            assertEquals(1, squaredResult);
        }
        {
            int a = 0;
            int squaredResult = calculator.squared(a);
            assertEquals(0, squaredResult);
        }
        {
            int a = 1;
            int squaredResult = calculator.squared(a);
            assertEquals(1, squaredResult);
        }
    }
}
