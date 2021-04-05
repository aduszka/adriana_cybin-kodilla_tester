package com.kodilla.collections.interfaces.homework;

public class Audi implements Car {
    private double speed;

    public Audi(double speed) {
        this.speed = speed;
    }
    public double getSpeed() {
        return speed;
    }

    public double increaseSpeed() {
        return speed = speed +20;
    }

    public double decreaseSpeed() {
        return speed = speed - 10;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "speed=" + speed +
                '}';
    }
}
