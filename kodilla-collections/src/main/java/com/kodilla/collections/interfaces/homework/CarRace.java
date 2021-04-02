package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Porche porche = new Porche(0);
        doRace(porche);

        Audi audi = new Audi(0);
        doRace(audi);

        BMW bMW = new BMW(0);
        doRace(bMW);
    }
    private static void doRace(Car car) {
        System.out.println(car.increaseSpeed());
        System.out.println(car.increaseSpeed());
        System.out.println(car.increaseSpeed());
        System.out.println(car.decreaseSpeed());
        System.out.println(car.decreaseSpeed());
        System.out.println(car.getSpeed() + "\n");
    }
}
