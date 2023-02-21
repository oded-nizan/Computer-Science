package com.classwork.board;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    static Scanner reader = new Scanner(System.in);

    public static void vote(int[] a)
    {
        int x;
        for (int i = 1; i <= 300; i++)
        {
            System.out.println("Enter 1-10: ");
            x = reader.nextInt();
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

    public static void board(int[] a){
        input_zero(a);
        vote(a);
        print_array(a);

        int x;
        for (int i = 1; i <= 5; i++){
            x = largest_location(a);
            System.out.println(x);
            a[x] = -1;
        }
    }


    public static void main(String [] args)
    {
        int[] a = new int[10];
        board(a);


    }
}