package com.classwork.board_altered;

import java.util.Arrays;

public class Main
{

    public static void random_vote(int[] a)
    {
        int x;
        for (int i = 1; i <= 300; i++)
        {
            x = (int)(Math.random() * 10 + 1);
            switch (x) {
                case 1 -> a[0]++;
                case 2 -> a[1]++;
                case 3 -> a[2]++;
                case 4 -> a[3]++;
                case 5 -> a[4]++;
                case 6 -> a[5]++;
                case 7 -> a[6]++;
                case 8 -> a[7]++;
                case 9 -> a[8]++;
                case 10 -> a[9]++;
                default -> System.out.println("Your vote doesn't count. You voted a wrong vote");
            }
        }
    }



    public static void input_zero(int[] a)
    {
        Arrays.fill(a, 0);
    }


    public static void print_array(int[] a)
    {
        for (int j : a) {
            System.out.println(j);
        }
    }

    public static int largest_location(int[] a)
    {
        int x = 0;
        //noinspection LoopStatementThatDoesntLoop
        while(true)
        {
            for (int i = 0; i < a.length - 1; i++)
            {
                if (a[i] > a[x])
                {
                    x = i;
                }
            }
            break;
        }
        return x;
    }


    public static void main(String [] args)
    {
        int[] a = new int[10];
        input_zero(a);
        random_vote(a);
        print_array(a);
        System.out.println(largest_location(a));

    }
}