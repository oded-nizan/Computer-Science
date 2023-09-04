package com.classwork.num_in_array;

import java.util.*;

public class Main {
    static Scanner reader = new Scanner(System.in);

    public static boolean num_in_array(int[] a, int b){
        for (int j : a) {
            if (j == b) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println("Enter number of numbers in array: ");
        int mi = reader.nextInt();
        int[] a = new int[mi];
        int b = reader.nextInt();

        for (int i = 0; i < a.length; i++){
            System.out.println("Enter number: ");
            a[i] = reader.nextInt();
        }

        System.out.println("Is the inputted number in the array? " + num_in_array(a, b));


    }
}
