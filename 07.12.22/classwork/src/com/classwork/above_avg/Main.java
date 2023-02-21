package com.classwork.above_avg;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int[] a = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter num: ");
            int x = reader.nextInt();
            a[i] = x;
        }
        int s = 0;

        for (int i = 0; i < 10; i++){
            s += a[i];
        }
        double f = s / 10.0;

        for (int i = 0; i < 10; i++) {
            if (a[i] > f) {
                System.out.println(a[i] + " is above average");
            }
        }

        int z = a[0];
        int zi = 0;
        for (int i = 0; i < 10; i++){
            if (a[i] > z) {
                z = a[i];
                zi = i;
            }

        }
        System.out.println("The largest number was: " + z + " and the index was: " + zi);


    }
}