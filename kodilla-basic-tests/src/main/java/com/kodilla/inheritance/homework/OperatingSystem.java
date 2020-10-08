package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int release;

    public OperatingSystem(int release) {
        this.release = release;
        System.out.println(release);
    }
    public void display() {
        System.out.println("Hello User!");
        }
    public void turnOnSystem() {
        System.out.println("System is turning on...");
    }
    public void turnOffSystem() {
        System.out.println("System is turning off...");
    }
}