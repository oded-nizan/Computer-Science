package com.classwork.sum_of_strikes;

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

    public static void sum_of_strikes(int[] a){
        int m = 0;
        for (int j : a) {
            if (j != 0) {
                m += j;
            } else {
                System.out.println(m);
                m = 0;
            }
        }
    }




    public static void main(String[] args)
    {
        int mi = reader.nextInt();
        int[] a = new int[mi];
        input(a);
        sum_of_strikes(a);
    }
}
