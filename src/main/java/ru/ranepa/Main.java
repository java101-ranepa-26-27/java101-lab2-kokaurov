package ru.ranepa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter student's name: ");
        String name = input.nextLine();

        int grade = 3;
        List<Integer> grades = new ArrayList<>();

        while (grade != 0) {
            System.out.println("Enter student's grade or zero to finish: ");
            grade = input.nextInt();
            if(grade == 0) {
                break;
            }
            if( grade < 2 || grade > 5 ){
                System.out.println("Not correct grade");
                System.out.println("Available grades from 2 to 5, try again.");
                continue;
            }
            grades.add(grade);
        }
        System.out.println("Student performance report: ");
        Student student = new Student(name,grades);
        student.printReport();

    }
}
