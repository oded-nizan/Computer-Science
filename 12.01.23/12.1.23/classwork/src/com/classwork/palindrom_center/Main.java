package com.classwork.palindrom_center;

import java.util.*;

public class Main {

    static Scanner reader = new Scanner(System.in);

    public static void input(int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.println("Enter num: ");
            int x = reader.nextInt();
            a[i] = x;
        }
    }

    public static int palindrom_center_len(int[] a, int x){
        int m = 1, z = 1;
        while(x-z >= 0 && x+z <= a.length && a[x-z] == a[x+z]){
            m += 2;
            z++;
        }
        return m;
    }

    public static void main(String[] args)
    {
        int mi = reader.nextInt();
        int[] a = new int[mi];
        input(a);
        System.out.println("Enter a number");
        int x = reader.nextInt();
        System.out.println(palindrom_center_len(a, x));
    }
}