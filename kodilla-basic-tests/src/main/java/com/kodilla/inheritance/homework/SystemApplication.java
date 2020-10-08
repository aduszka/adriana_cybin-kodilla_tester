package com.kodilla.inheritance.homework;

public class SystemApplication {

    public static void main(String[] args) {
        Windows oldsystem = new Windows(1994);
        oldsystem.turnOnSystem();
        oldsystem.display();

        Mac newDisplay = new Mac(2000);
        newDisplay.display();
        newDisplay.turnOffSystem();

    }
}
