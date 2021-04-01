package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldCalculateAverageIncome() {
        Bank bank = new Bank();
        bank.addFirstCashmachine(0);
        bank.addSecondCashMachine(100);
        double averageIncome = bank.getAverageIncome();
        assertEquals(100,averageIncome,0.01);
    }
    @Test
    public void shouldCalculateAverageOutcome() {
        Bank bank = new Bank();
        bank.addFirstCashmachine(500);
        bank.addSecondCashMachine(-100);
        double averageOutcome = bank.getAverageOutcome();
        assertEquals(-100,averageOutcome,0.01);
    }
    @Test
    public void shouldCalculateTotalSum() {
        Bank bank = new Bank();
        bank.addFirstCashmachine(500);
        bank.addFirstCashmachine(300);
        bank.addSecondCashMachine(-100);
        double getTotalSum = bank.getTotalSum();
        assertEquals(700, getTotalSum, 0.01);
    }
    @Test
    public void shouldCalculateTotalSizeIncome() {
        Bank bank = new Bank();
        bank.addFirstCashmachine(0);
        bank.addFirstCashmachine(300);
        bank.addSecondCashMachine(-100);
        double getSizeIncome = bank.getSizeIncome();
        assertEquals(1,getSizeIncome, 0.01);
    }
    @Test
    public void shouldCalculateTotalSizeOutcome() {
        Bank bank = new Bank();
        bank.addFirstCashmachine(0);
        bank.addFirstCashmachine(300);
        bank.addSecondCashMachine(-100);
        double getSizeOutcome = bank.getSizeOutcome();
        assertEquals(1,getSizeOutcome, 0.01);
    }
}