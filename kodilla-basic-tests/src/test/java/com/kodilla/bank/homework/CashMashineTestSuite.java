package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMashineTestSuite {

    @Test
    public void shouldHaveZeroLengthIncome() {
        CashMashine cashMashine = new CashMashine();
        int[] values = cashMashine.getIncome();
        assertEquals(0, values.length);
    }
    @Test
    public void shouldAddTwoElementsToIncomeArray(){
        CashMashine cashMashine = new CashMashine();
        cashMashine.add(200);
        cashMashine.add(100);
        int[]values=cashMashine.getIncome();
        assertEquals(2,values.length);
        assertEquals(200, values[0]);
        assertEquals(100,values[1]);
    }
    @Test
    public void shouldAddTwoElementsToOutcomeArray(){
        CashMashine cashMashine = new CashMashine();
        cashMashine.add(-200);
        cashMashine.add(-100);
        int[]values=cashMashine.getOutcome();
        assertEquals(2,values.length);
        assertEquals(-200, values[0]);
        assertEquals(-100,values[1]);
    }
    @Test
    public void shouldReturnIncomeSizeEqualsZeroIsArrayEmpty() {
        CashMashine cashMashine = new CashMashine();
        assertEquals(0, cashMashine.getSizeIncome(), 0.0001);
    }
        @Test
        public void shouldReturnOutcomeSizeEqualsZeroIsArrayEmpty() {
            CashMashine cashMashine = new CashMashine();
            assertEquals(0,cashMashine.getSizeOutcome(),0.0001);
    }
    @Test
    public void shouldSumIncome() {
        CashMashine cashMashine = new CashMashine();
        cashMashine.add(100);
        cashMashine.add(200);
        cashMashine.add(300);
        assertEquals(600,cashMashine.getSumIncome(),0.01);
    }
    @Test
    public void shouldSumOutcome() {
        CashMashine cashMashine = new CashMashine();
        cashMashine.add(-200);
        cashMashine.add(-200);
        cashMashine.add(-300);
        assertEquals(-700,cashMashine.getSumOutcome(),0.01);
    }
    @Test
    public void shouldSumSizeIncome() {
        CashMashine cashMashine = new CashMashine();
        cashMashine.add(100);
        cashMashine.add(200);
        assertEquals(2,cashMashine.getSizeIncome(),0.0001);
    }
    @Test
    public void shouldSumSizeOutcome() {
        CashMashine cashMashine = new CashMashine();
        cashMashine.add(-100);
        assertEquals(1,cashMashine.getSizeOutcome(),0.0001);
    }
}
