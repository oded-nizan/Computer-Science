package com.classwork.reverse_order;

import java.util.*;

public class Main {
    static Scanner reader = new Scanner(System.in);

    public static void print_array(int[] a){
        for (int j : a) {
            System.out.println(j);
        }
    }

    public static void reverse_array(int[] a, int[] b){
        for (int i = 0; i < a.length; i++){
            b[a.length-1-i] = a[i];
        }
        print_array(b);
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
        input(a);



        reverse_array(a, b);


    }
}
