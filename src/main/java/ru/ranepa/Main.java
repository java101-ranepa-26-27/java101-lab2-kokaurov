package ru.ranepa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter student's name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int grade = 0;
        List<Integer> grades = new ArrayList<>();
        while (grade != 0){
            System.out.println("Enter student's grade or zero: ");
            grade = input.nextInt();
            grades.add(grade);
        Student student = new Student();
        student.printReport();
        }






    }
}
