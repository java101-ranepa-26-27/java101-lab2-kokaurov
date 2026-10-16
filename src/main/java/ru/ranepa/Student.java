package ru.ranepa;

import java.util.List;

public class Student {
    public String name;
    public List<Integer> grades;

    public Student(String name,List<Integer>grades ) {
    this.name = name;
    this.grades = grades;
    }

    public double average(){
        double sum = 0;
        for (int i: grades) {
            sum += i;
        }
        return sum / grades.size();
    };

    public void printReport(){
        System.out.println("Student's name " + name);

        System.out.println("Student's grades " + grades);

        double av = average();

        System.out.println("The student's average grade is " + av);

        if (av >= 4.5) {
            System.out.println("excellent student");
        } else if (av >= 3.5) {
            System.out.println("good student");
        } else if (av >= 2.5) {
            System.out.println("average student");
        } else {
            System.out.println("poor student");
        }
    };
}

