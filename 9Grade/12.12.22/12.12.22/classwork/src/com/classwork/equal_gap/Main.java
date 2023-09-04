package com.classwork.equal_gap;

import java.util.*;

public class Main {
    static Scanner reader = new Scanner(System.in);
    public static boolean equal_gap(int[] a){
        int x = a[0], y = a[1], z = y-x;
        for (int i = 1; i < a.length - 1; i++){
            x = a[i];
            y = a[i+1];
            if (x + z != y){
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

        System.out.println("IS the array a math series? " + equal_gap(a));


    }
}