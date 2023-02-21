package com.classwork.not_in;

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

    public static int times_in_array(int[] a, int b){
        int m = 0;
        for (int j : a) {
            if (times_in(j, b) > 0) {
                m++;
            }
        }
        return m;
    }

    public static void digit_not_in(int[] a){
        for (int i = 0; i < 10; i++){
            if (times_in_array(a, i) < 1){
                System.out.println(i);
            }
        }
    }

    public static void input(int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.println("Enter number: ");
            a[i] = reader.nextInt();
        }
    }

    public static void main(String [] args){

        System.out.println("Enter number of numbers in array: ");
        int mi = reader.nextInt();
        int[] a = new int[mi];
        input(a);


        digit_not_in(a);
    }
}
