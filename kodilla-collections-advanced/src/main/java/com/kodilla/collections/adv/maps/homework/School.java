package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    //arraylist
    private List<Integer> students = new ArrayList<>();

    public School(int ... students) {
        for (int school : students)
            this.students.add(school);
    }

    public int getSum() {
        int sum = 0;
        for (int school : students)
            sum += school;
        return sum;
    }

    @Override
    public String toString() {
        return "Students: " + students;
    }
}
