package com.classwork.above_avg5;

import java.util.*;

public class Main{
    static Scanner reader = new Scanner(System.in);
    public static void input(int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.println("Enter num: ");
            int x = reader.nextInt();
            a[i] = x;
        }
    }

    public static double average(int[] a){
       int s = 0;
        for (int j : a) {
            s += j;
        }
        //noinspection IntegerDivisionInFloatingPointContext
        return s / a.length;
    }

    public static void above_avg(int[] a, double f){
        for (int j : a) {
            if (j > f) {
                System.out.println(j + " is above average");
            }
        }
    }

    public static void largest(int[] a){
        int z = a[0];
        int zi = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] > z) {
                z = a[i];
                zi = i;
            }

        }
        System.out.println("The largest number was: " + z + " and the index was: " + zi);
    }

    public static void main(String[] args) {

        System.out.println("Enter length: ");
        int mi = reader.nextInt();
        int[] a = new int[mi];
        input(a);

        double avg = average(a);
        above_avg(a, avg);

        largest(a);

    }
}
