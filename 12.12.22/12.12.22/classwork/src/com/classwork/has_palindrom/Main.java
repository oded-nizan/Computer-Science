package com.classwork.has_palindrom;

import java.util.*;

public class Main {

    static Scanner reader = new Scanner(System.in);

    public static boolean palindrom(int[] a){
        int x = 0, y = a.length - 1;
        while (x>y){
            //noinspection ConstantConditions
            if (a[x] != a[y]){
                return false;
            }
            x++;
            y--;
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

        System.out.println(palindrom(a));
    }
}
