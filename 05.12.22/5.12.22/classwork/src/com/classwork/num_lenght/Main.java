package com.classwork.num_lenght;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter number or -99 to exit");
        int a = reader.nextInt(), m = 1, f = a;

        while (a != -99){
            System.out.println("Enter number or -99 to exit");
            a = reader.nextInt();
            if (a == f){
                m++;
            }
            else {
                System.out.println("The number was "+ f+ " and the length was " + m);
                m = 1;
            }
            f = a;

        }



    }
}