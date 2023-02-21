package com.classwork.change_symbol;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter number, 0 to exit: ");
        int a = reader.nextInt(), m = 0, s = 0, f = 0, x;

        while (a != 0){
            s += a;
            x = s * f;
            if (x < 0){
                m++;
            }
            f = s;

            System.out.println("Enter number or 0 to exit: ");
            a = reader.nextInt();
        }

        System.out.println("The number of times the symbol changed was: " + m);


    }
}
