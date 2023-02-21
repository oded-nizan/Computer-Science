package com.classwork.longest;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter number or -99 to exit");
        int a = reader.nextInt(), m = 1, f = a, m1 = 0, z;

        while (a != -99){
            System.out.println("Enter number or -99 to exit");
            a = reader.nextInt();
            if (a == f){
                m++;
            }
            else {
                if (m > m1) {
                    m1 = m;
                    z = f;
                }
                m = 1;
            }
            f = a;

        }
        System.out.println(m1 + " was the length of the longest and " + f);



    }
}