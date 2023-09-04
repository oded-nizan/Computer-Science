package com.classwork.greatest_even;

import java.util.*;

public class Main {
    static Scanner reader = new Scanner(System.in);

    public static int largest_even(int[] a){
        int max = -1;
        for (int j : a) {
            if (j > max && j % 2 == 0) {
                max = j;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        System.out.println("Enter number of numbers in array: ");
        int mi = reader.nextInt();
        int[] a = new int[mi];

        for (int i = 0; i < a.length; i++){
            System.out.println("Enter number: ");
            a[i] = reader.nextInt();
        }

        System.out.println("The largest even number is: " + largest_even(a));


    }
}
