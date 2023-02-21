package com.classwork.left_digit;

import java.util.Scanner;

public class Main {

    static Scanner reader = new Scanner(System.in);

    public static int left_digit(int a){
        int x = a % 10;
        while (a > 0){
            a /= 10;
            x = a % 10;
        }
        return x;
    }

    public static int right_digit(int a){
        return a % 10;
    }

    public static boolean symmetry(int[] a){
        int x, y;
        for (int i = 0; i < a.length - 1; i++){
            x = left_digit(a[i]);
            y = right_digit(a[i+1]);
            if (x != y){
                return false;
            }
        }
        return true;
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

        System.out.println(symmetry(a));
    }
}

