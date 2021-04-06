package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        //metoda przyporządkowująca szkoły do dyrektorów
        //informacje o dyrektorach placówek, nazwie szkoły,
        //którą kierują oraz o łącznej licznie uczniów
        //w każdej szkole
        Map<Principal, School> directory = new HashMap<>();
        Principal aleks = new Principal("Aleks","Peczino","Highschool");
        Principal mark = new Principal("Mark","Sandman","Primary");

        School aleksSchool = new School(50,20,5);
        directory.put(aleks,aleksSchool);
        System.out.println(directory.get(aleks));

        School markSchool = new School(10,20,15);
        directory.put(mark,markSchool);
        System.out.println(directory.get(mark));

        for (Map.Entry<Principal, School> principalEntry : directory.entrySet())
            System.out.println(principalEntry.getKey().getFirstname() + " " + principalEntry.getKey().getLastname() + " " + principalEntry.getKey().getSchoolname() + " " + principalEntry.getValue().getSum());
    }
}
