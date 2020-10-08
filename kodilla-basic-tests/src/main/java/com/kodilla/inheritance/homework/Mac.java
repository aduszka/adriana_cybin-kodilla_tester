package com.kodilla.inheritance.homework;

public class Mac extends OperatingSystem {
    public Mac(int release) {
        super(release);
        System.out.println("New system.");
    }

    @Override
    public void display() {
        System.out.println("Welcome in Future!");
    }
}
