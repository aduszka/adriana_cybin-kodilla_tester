package com.kodilla.collections.interfaces.homework;

public class BMW implements Car{
    private double speed;

    public BMW(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public double increaseSpeed() {
        return speed = speed + 25;
    }

    public double decreaseSpeed() {
        return speed = speed - 5;
    }
}
