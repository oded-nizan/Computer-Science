package com.classwork.rising_order;

import java.util.*;

public class Main {
    static Scanner reader = new Scanner(System.in);
    public static boolean rising_order(int[] a){
        int x, y;
        for (int i = 0; i < a.length - 1; i++){
            x = a[i];
            y = a[i+1];
            if (!(x < y)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("Enter number of numbers in array: ");
        int mi = reader.nextInt();
        int[] a = new int[mi];

        for (int i = 0; i < a.length; i++){
            System.out.println("Enter number: ");
            a[i] = reader.nextInt();
        }

        System.out.println("IS the array in rising order? " + rising_order(a));


    }
}