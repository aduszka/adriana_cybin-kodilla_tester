package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "BMW{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BMW bmw = (BMW) o;
        return Double.compare(bmw.speed, speed) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}

