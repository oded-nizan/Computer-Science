package com.classwork.strikes_rising_order;

import java.util.Scanner;

public class Main
{

    static Scanner reader = new Scanner(System.in);

    public static void input(int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.println("Enter num: ");
            int x = reader.nextInt();
            a[i] = x;
        }
    }

    public static void strike_rising(int[] a){
        boolean m = true;
        int z = 0, i = 1;
        while (i < a.length){
            while (a[i] != 0) {
                if (a[i] <= a[i-1]){
                    m = false;
                }
                i++;
            }
            if (m){
                z++;
            }
            m = true;
            i++;
        }
        System.out.println(z);
    }




    public static void main(String[] args)
    {
        int mi = reader.nextInt();
        int[] a = new int[mi];
        input(a);
        strike_rising(a);
    }
}
