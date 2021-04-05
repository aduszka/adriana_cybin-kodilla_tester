package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.BMW;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Porche;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Audi(0));
        cars.add(new Porche(0));
        BMW bMW = new BMW(0);
        cars.add(bMW);

        cars.remove(0);
        cars.remove(bMW);
        System.out.println("list size: " + (cars.size()));

        for( Car car : cars) {
            CarUtils.displayCarInfo(car);
        }
    }
}
