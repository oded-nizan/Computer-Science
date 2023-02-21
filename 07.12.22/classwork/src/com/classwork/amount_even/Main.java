package com.classwork.amount_even;

import java.util.*;
public class Main {

    static Scanner reader = new Scanner(System.in);

    public static int num_even(int[] a){
        int m = 0;
        for (int j : a) {
            if (j % 2 == 0) {
                m++;
            }
        }
        return m;
    }

    public static void main(String [] args) {
        int[] a = new int[3];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter num: ");
            int x = reader.nextInt();
            a[i] = x;
        }
        System.out.println(num_even(a));
    }
}
