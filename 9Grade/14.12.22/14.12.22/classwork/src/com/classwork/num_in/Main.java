package com.classwork.num_in;

import java.util.*;
public class Main {

    static Scanner reader = new Scanner(System.in);

    public static int times_in(int a, int b){
        int m = 0;
        while (a>0){
            if (a == b){
                m++;
            }
            a /= 10;
        }
        return m;
    }

    public static void main(String [] args){

        int a = reader.nextInt();
        int b = reader.nextInt();

        System.out.println(times_in(a, b));
    }
}
