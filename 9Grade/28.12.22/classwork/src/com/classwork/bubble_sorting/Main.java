package com.classwork.bubble_sorting;

import java.util.Scanner;

public class Main
{

    static Scanner reader = new Scanner(System.in);

    public static void bubble_sorting(int[] a)
    {
        for (int i = 0; i < a.length - 1; i++)
        {
            for (int k = 0; k < a.length - 1 - i; k++)
            {
                if (a[k] > a[k + 1])
                {
                    int z = a[k];
                    a[k] = a[k + 1];
                    a[k + 1] = z;
                }
            }
        }
    }

    public static void input(int[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            System.out.println("Enter number: ");
            a[i] = reader.nextInt();
        }
    }

    public static void print_array(int[] a)
    {
        for (int j : a) {
            System.out.println(j);
        }
    }

    public static void main(String [] args)
    {

        System.out.println("Enter number of numbers in array: ");
        int mi = reader.nextInt();
        int[] a = new int[mi];
        input(a);

        bubble_sorting(a);
        print_array(a);
    }
}