package com.classwork.hw2;

import java.util.*;
class Main
{
    public static int sqrt (int a, int b, int d)
    {
        int c=a;
        int s=a;
        for (int i=1; i<=d; i++)
        {
            c=c+b;
            s=s+c;
        }
        return s;
    }


    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter int");
        int a=reader.nextInt();
        System.out.println("Enter int");
        int b=reader.nextInt();
        System.out.println("Enter int");
        int d=reader.nextInt();
        System.out.println(sqrt(a, b, d));
    }
}
