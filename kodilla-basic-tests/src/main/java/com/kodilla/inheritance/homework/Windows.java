package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {
    public Windows(int release) {
        super(release);
        System.out.println("Old system.");
    }

    @Override
    public void display() {
        System.out.println("Welcome in Windows!");
    }
}