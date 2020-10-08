package com.kodilla.inheritance.homework;

public class SystemApplication {

    public static void main(String[] args) {
        OperatingSystem system = new OperatingSystem(1994);
        system.turnOnSystem();
        system.display();

        Display newDisplay = new Display(2000);
        newDisplay.display();
        newDisplay.turnOffSystem();

    }
}
