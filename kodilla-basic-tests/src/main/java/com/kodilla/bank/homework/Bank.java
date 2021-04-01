package com.kodilla.bank.homework;

public class Bank {
    private CashMashine first;
    private CashMashine second;

    public Bank(){
        this.first = new CashMashine();
        this.second = new CashMashine();
    }
    public void addFirstCashmachine(int cashMachine) {
        this.first.add(cashMachine);
    }
    public void addSecondCashMachine(int cashMachine) {
        this.second.add(cashMachine);
    }
    public double getAverageIncome() {
        double sum = first.getSumIncome() + second.getSumIncome();
        return sum/ (first.getSizeIncome() + second.getSizeIncome());
    }
    public double getAverageOutcome() {
        double sum = first.getSumOutcome() + second.getSumOutcome();
        return sum/ (first.getSizeOutcome() + second.getSizeOutcome());
    }
    public double getTotalSum() {
        return first.getSum() + second.getSum();
    }
    public double getSizeIncome() {
        return first.getSizeIncome() + second.getSizeIncome();
    }
    public double getSizeOutcome() {
        return first.getSizeOutcome() + second.getSizeOutcome();
    }
}
