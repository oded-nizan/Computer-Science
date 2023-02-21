package com.classwork.digits_appear;

import java.util.Scanner;
import java.util.Arrays;

public class Main
{

    static Scanner reader = new Scanner(System.in);

    public static int max_place(int[] a)
    {
        int k = a[0];
        int z=0;
        for (int i = 0; i < a.length; i++)
        {
            int y = a[i];
            if (y > k)
            {
                k = y;
                z = i;
            }
        }
        return z;
    }

    public static void input_zero(int[] a)
    {
        Arrays.fill(a, 0);
    }

    public static int digit_in_num(int x, int y)
    {
        int m = 0, a;
        while (x>0)
        {
            a = x%10;
            if (y == a)
            {
                m++;
            }
            x /= 10;
        }
        return m;
    }

    public static void num_receiver(int[] a)
    {
        input_zero(a);
        int x = 0;
        a[0] --;
        while(x != -1)
        {
            System.out.println("Enter a number: ");
            x = reader.nextInt();
            for (int i = 0; i < 10; i++)
            {
                a[i] += digit_in_num(x, i);
            }
        }
    }

    public static void amounts_of_digits_in_input(int[] a)
    {
        num_receiver(a);
        int x, y;
        for (int i = 0; i < 10;i ++)
        {
            y = max_place(a);
            x = a[y];
            a[y] = -1;
            System.out.println(y + " : " + x);
        }
    }

    public static void main(String[] args)
    {
        int[] a = new int[10];
        amounts_of_digits_in_input(a);
    }
}