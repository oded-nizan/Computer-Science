package com.classwork.all_even;

import java.util.*;
public class Main {

    static Scanner reader = new Scanner(System.in);

    public static boolean all_even(int[] a){
        for (int j : a) {
            if (j % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String [] args) {
        int[] a = new int[3];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter num: ");
            int x = reader.nextInt();
            a[i] = x;
        }

        System.out.println(all_even(a));
    }
}

