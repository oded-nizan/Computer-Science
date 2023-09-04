package com.classwork.order;

import java.util.*;

public class Main {

    static Scanner reader = new Scanner(System.in);

    public static void print_array(int[] a)
    {
        for (int j : a) {
            System.out.println(j);
        }
    }
    public static boolean is_there_larger(int[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i; j < a.length; j++)
            {
                if (a[i] > a[j])
                {
                    return false;
                }
            }
        }
        return true;
    }

    @SuppressWarnings("unused")
    public static int max_index(int[] a, int i, int j)
    {
        if (a[i] >= a[j])
        {
            return i;
        }
        else if (a[j] > a[i])
        {
            return j;
        }
        return -1;
    }

    public static int min_index(int[] a, int i, int j)
    {
        if (a[i] >= a[j])
        {
            return j;
        }
        else if (a[j] > a[i])
        {
            return i;
        }
        return -1;
    }

    public static void switch_places(int[] a, int i, int j)
    {
        int x = a[i];
        a[i] = a[j];
        a[j] = x;
    }



    public static void input(int[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            System.out.println("Enter number: ");
            a[i] = reader.nextInt();
        }
    }

    public static void order(int[] a)
    {
        while (!(is_there_larger(a)))
        {
            for (int i = 0; i < a.length; i++)
            {
                for (int j = 0; j < a.length; j++)
                {
                    if (min_index(a, i, j) == j && j > i)
                    {
                        switch_places(a, i, j);
                    }
                }
            }
        }
    }

    public static void main(String [] args){

        System.out.println("Enter number of numbers in array: ");
        int mi = reader.nextInt();
        int[] a = new int[mi];
        input(a);

        order(a);
        print_array(a);


    }
}

