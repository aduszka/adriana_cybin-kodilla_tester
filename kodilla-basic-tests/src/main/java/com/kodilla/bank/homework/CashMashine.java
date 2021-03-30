package com.kodilla.bank.homework;

public class CashMashine {

    private int[] income;
    private int[] outcome;
    private int size;

    public CashMashine() {
        this.size = 0;
        this.income= new int[0];
        this.outcome = new int[0];
    }

    public void add(int value) {
        if (value>0) {
            this.size++;
            int[] newTab = new int[this.size];
            System.arraycopy(income, 0, newTab, 0, income.length);
            newTab[this.size - 1] = value;
            this.income = newTab;
        }
        if (value<0) {
            this.size++;
            int[] newTab = new int[this.size];
            System.arraycopy(outcome, 0, newTab, 0, outcome.length);
            newTab[this.size - 1] = value;
            this.outcome = newTab;
        }
    }
    public int[] getIncome() {
        return income;
    }
    public int[] getOutcome() {
        return outcome;
    }
    public int getSizeIncome() {
        size = income.length;
        if (income.length == 0) {
            return 0;
        }
        return size;
    }
    public int getSizeOutcome() {
        size = outcome.length;
        if (outcome.length == 0) {
            return 0;
        }
        return size;
    }
    public int getSumIncome() {
        int sum = 0;
        {
            for (int i = 0; i < this.income.length; i++) {
                sum = sum + this.income[i];
            }
            return sum;
        }
    }
    public int getSumOutcome() {
        int sum = 0;
        {
            for (int i = 0; i < this.outcome.length; i++) {
                sum = sum + this.outcome[i];
            }
            return sum;
        }
    }
}

