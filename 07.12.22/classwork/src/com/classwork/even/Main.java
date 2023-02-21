package com.classwork.even;

import java.util.*;
public class Main {

    static Scanner reader = new Scanner(System.in);

    public static void all_even(int[] a){
        for (int j : a) {
            if (j % 2 != 0) {
                System.out.println(j);
            }
        }
    }

    public static void main(String [] args) {
        int[] a = new int[3];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter num: ");
            int x = reader.nextInt();
            a[i] = x;
        }
    }
}
