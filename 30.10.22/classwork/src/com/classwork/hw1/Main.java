package com.classwork.hw1;

import java.util.*;
class Main
{
    public static boolean sqrt (int a, int b, int d)
    {
        int c=a;
        int s=a;
        while(d>=a)
        {
            if(a==d)
                return true;
            a=a+b;
        }
        return false;
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