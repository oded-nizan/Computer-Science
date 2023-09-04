package com.classwork.fusion_array;

import java.util.*;

public class Main {
    static Scanner reader = new Scanner(System.in);

    public static void print_array(int[] a){
        for (int j : a) {
            System.out.println(j);
        }
    }

    public static void fusion_array(int[] a, int[] b, int[] c){
        for (int i = 0; i < a.length; i++){
            c[i] = Math.max(a[i], b[i]);
        }
        print_array(c);
    }


    public static void input(int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.println("Enter number: ");
            a[i] = reader.nextInt();
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter number of numbers in array: ");
        int mi = reader.nextInt();
        int[] a = new int[mi];
        int[] b = new int[mi];
        int[] c = new int[mi];
        input(a);
        input(b);



        fusion_array(a, b, c);


    }
}