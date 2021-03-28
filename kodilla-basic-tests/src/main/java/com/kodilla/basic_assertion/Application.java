package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        int sumResult = calculator.sum(a, b);
        {
            boolean correct = ResultChecker.assertEquals(13, sumResult);
            if (correct) {
                System.out.println("Metoda sum działa poprawnie.");
            } else {
                System.out.println("Metoda sum nie działa poprawnie.");
            }
        }

        int substractResult = calculator.substract(a, b);
        {
            boolean correct = ResultChecker.assertEquals(-3, substractResult);
            if (correct) {
                System.out.println("Metoda sub działa poprawnie.");
            } else {
                System.out.println("Metoda sub nie działa poprawnie.");
            }
        }
        int squaredResult = calculator.squared(a);
        {
            boolean correct = ResultChecker.assertEquals(25, squaredResult);
            if (correct) {
                System.out.println("Metoda sqrd działa poprawnie.");
            } else {
                System.out.println("Metoda sqrd nie działa poprawnie.");
            }
        }
    }
}
