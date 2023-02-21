package com.classwork.equals_sum_following;

import java.util.*;

public class Main {

    static Scanner reader = new Scanner(System.in);

    public static void input(int[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            System.out.println("Enter num: ");
            int x = reader.nextInt();
            a[i] = x;
        }
    }

    public static void equal_sum_following(int[] a)
    {
        int sum = 0, x = 1;
        for (int i = 0; i < a.length;i++)
        {
            while (sum < a[i] && i+x <  a.length)
            {
                sum += a[i+x];
                x++;
                if (a[i] == sum)
                {
                    System.out.println(a[i]);
                }
            }
            x = 1;
            sum = 0;
        }
    }


    public static void main(String[] args)
    {
        int mi = reader.nextInt();
        int[] a = new int[mi];
        input(a);
        equal_sum_following(a);
    }
}
