package com.classwork.prime_base;

import java.util.*;

public class Main{
    public static boolean num_num(int w) {
        boolean s = true;
        for (int i = 2; i < w; i++) {
            if (w % i == 0) {
                s = false;
                break;
            }
        }
        return s;
    }

    public static int prime(int x) {
        for (int i = 2; i <= x; i++) {
            if (num_num(i) && x % i == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter ur number: ");
        int a = reader.nextInt();
        while (a > 1) {
            int x = (prime(a));
            a /= x;
            System.out.println(x);
        }
    }
}

