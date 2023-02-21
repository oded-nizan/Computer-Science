package com.classwork.order_evens_odds;

import java.util.*;

public class Main {

    static Scanner reader = new Scanner(System.in);

    public static void switch_places(int[] a, int i, int j)
    {
        int x = a[i];
        a[i] = a[j];
        a[j] = x;
    }

    public static void input(int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.println("Enter num: ");
            int x = reader.nextInt();
            a[i] = x;
        }
    }

    public static void print_array(int[] a){
        for (int j : a) {
            System.out.println(j);
        }
    }

    public static int first_even(int[] a){
        for (int i = 0; i < a.length;i++){
            if (a[i] % 2 == 0){
                return i;
            }
        }
        return -1;
    }

    public static int last_odd(int[] a){
        for (int i = a.length - 1; i >= 0;i--){
            if (a[i] % 2 != 0){
                return i;
            }
        }
        return -1;
    }

    public static void order_even_odd(int[] a){
        int ez = first_even(a), e = last_odd(a);
        if (first_even(a) == -1 || last_odd(a) == -1){
            ez = e;
        }
        while (ez < e){
            switch_places(a, ez, e);
            ez = first_even(a);
            e = last_odd(a);
        }
        print_array(a);
    }


    public static void main(String[] args)
    {
        int mi = reader.nextInt();
        int[] a = new int[mi];
        input(a);
        order_even_odd(a);
    }
}