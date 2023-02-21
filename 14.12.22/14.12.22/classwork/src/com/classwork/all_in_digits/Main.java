package com.classwork.all_in_digits;

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

    public static int digit_not_in(int[] a){
        int m = 0;
        for (int i = 0; i < 10; i++){
            if (times_in_array(a, i) < 1){
                m++;
            }
        }
        return m;
    }

    public static boolean digit_all_in(int[] a){
        return digit_not_in(a) < 1;
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


        System.out.println(digit_all_in(a));
    }
}