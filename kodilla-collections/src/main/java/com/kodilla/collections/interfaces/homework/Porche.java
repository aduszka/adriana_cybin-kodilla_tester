package com.kodilla.collections.interfaces.homework;

public class Porche implements Car {
    private double speed;

    public Porche(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public double increaseSpeed() {
        return speed = speed + 20;
    }

    public double decreaseSpeed() {
        return speed = speed -10;
    }

    @Override
    public String toString() {
        return "Porche{" +
                "speed=" + speed +
                '}';
    }
}
