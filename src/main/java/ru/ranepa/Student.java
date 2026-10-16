package ru.ranepa;

import java.util.List;

public class Student {
    public String name;
    public List<Integer> grades;

    public double average(){
        double sum = 0;
        for (int i: grades) {
            sum += grades.get(i);
        }
        return sum / grades.size();
    };

    public void printReport(){
        System.out.println("Имя студента" + name);

        System.out.println("Оценки студента" + grades);

        double av = average();
        if (av >= 4.5) {
            System.out.println("Отлично");
        } else if (av >= 3.5) {
            System.out.println("Хорошист");
        } else if (av >= 2.5) {
            System.out.println("Троечник");
        } else {
            System.out.println("Двоечник");
        }
    };
}

