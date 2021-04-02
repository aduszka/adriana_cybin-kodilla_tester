package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.BMW;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Porche;

import java.util.Random;

public class CarApplication {

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(14) + 1];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.displayCarInfo(car);
    }

    private static Car drawCar() {
        Random random = new Random();
        int drawnCarKind = random.nextInt(3);
        double a = random.nextDouble() * 10 + 1;
        double b = random.nextDouble() * 10 + 1;
        double c = random.nextDouble() * 10 + 1;
        if (drawnCarKind == 0)
            return new Audi(a);
        else if (drawnCarKind == 1)
            return new BMW(b);
        else
            return new Porche(c);
    }
}

