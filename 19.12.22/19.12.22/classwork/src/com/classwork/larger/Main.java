package com.classwork.larger;

import java.util.*;

public class Main {

    static Scanner reader = new Scanner(System.in);

    public static void is_there_larger(int[] a){
        for (int i = 0; i < a.length; i++){
            for (int j = i; j < a.length; j++){
                if (a[i] < a[j]){
                    System.out.println("The number " + a[i] + " is not larger then all of the following numbers in the array");
                }
                else {
                    System.out.println("The number " + a[i] + " is larger then all of the following numbers in the array");
                }
            }
        }
    }

    public static void input(int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.println("Enter number: ");
            a[i] = reader.nextInt();
        }
    }

    public static void main(String [] args){

        System.out.println("Enter number of numbers in array: ");
        int mi = reader.nextInt();
        int[] a = new int[mi];
        input(a);

        is_there_larger(a);


    }
}
