package com.classwork.score_avg;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter garde or -99 to exit");
        int a = reader.nextInt(), m = 0, s = 0, f;

        while (a != -99){
            s += a;
            m++;
            System.out.println("Enter garde or -99 to exit");
            a = reader.nextInt();
        }

        if (m > 0){
            f = s/m;
            System.out.println("The average was: " + f);
        }
        else {
            System.out.println("There were no grades inputted");
        }


    }
}