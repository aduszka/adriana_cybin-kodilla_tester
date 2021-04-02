package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.BMW;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Porche;

public class CarUtils {
    public static void displayCarInfo(Car car) {
        System.out.println("Car name " + getCarName(car));
        System.out.println("Car increase speed " + car.increaseSpeed());
        System.out.println("Car decrease speed " + car.decreaseSpeed());
        System.out.println("\n");
    }
    private static String getCarName(Car car) {
        if (car instanceof Audi)
            return "Audi";
        else if (car instanceof BMW)
            return "BMW";
        else if (car instanceof Porche)
            return "Porche";
        else
            return "Unknown car name";
    }
}
