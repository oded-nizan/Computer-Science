package com.classwork.ObjectOrientedPrograming.Student;

import java.util.*;

public class Main {

    static Scanner reader = new Scanner(System.in);

    public static void main(String [] args){

        Student s1 = new Student("Roy", 100, 100);
        Student s2 = new Student("Oded", 0, 0);

        System.out.println(s1);
        System.out.println(s2);

        int s1_avg = s1.averageGrade();
        int s2_avg = s2.averageGrade();

        System.out.println(s1_avg);
        System.out.println(s2_avg);

        System.out.println("Enter new grade: ");
        int g1 = reader.nextInt();
        s1.set_grA(g1);
        System.out.println(s1);

        System.out.println("Enter new grade: ");
        int g2 = reader.nextInt();
        s1.set_grB(g2);
        System.out.println(s1);

        System.out.println("Enter new name: ");
        String name1 = reader.next();
        s1.set_name(name1);
        System.out.println(s1);

        System.out.println(s2.get_grA());
        System.out.println(s2.get_grB());
        System.out.println(s2.get_name());

        System.out.println("Enter bonus: ");
        int x = reader.nextInt();
        s2.bonus_grA(x);
        System.out.println("Enter bonus: ");
        int y = reader.nextInt();
        s2.bonus_grB(y);

        System.out.println(s2.passing());
        System.out.println(s2.higher_grade());
    }
}
