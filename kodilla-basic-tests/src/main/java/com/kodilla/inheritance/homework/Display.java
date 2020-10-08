package com.kodilla.inheritance.homework;

public class Display extends OperatingSystem {
    public Display(int release) {
        super(release);
        System.out.println("New system.");
    }

    @Override
    public void display() {
        System.out.println("Welcome in the Future!");
    }
}
