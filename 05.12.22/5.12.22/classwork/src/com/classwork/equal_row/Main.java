package com.classwork.equal_row;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter number or -99 to exit");
        int a = reader.nextInt(), m = 0, f = a;

        while (a != -99){
            System.out.println("Enter number or -99 to exit");
            a = reader.nextInt();
            if (a != f){
                m++;
            }
            f = a;

        }

        System.out.println("There were " + m + " series");


    }
}