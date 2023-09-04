package com.classwork.longest_palindrom_lenght;

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

    public static int longest_palindrom_len(int[] a){
        int m = 0;
        for (int i = 0; i< a.length; i++){
            m = Math.max(palindrom_center_len(a, i), m);
        }
        return m;
    }

    public static void main(String[] args)
    {
        int mi = reader.nextInt();
        int[] a = new int[mi];
        input(a);
        int m = longest_palindrom_len(a);
        System.out.println("the len of the longest palindrom in this array is: " + m);
    }
}
