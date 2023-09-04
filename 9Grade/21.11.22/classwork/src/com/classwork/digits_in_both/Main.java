package com.classwork.digits_in_both;

import java.util.*;
public class Main
{
    public static int digit_in_both(int a, int b)
    {
        int e=0,t=0;
        int c=a;
        int d=b;
        while(a>0)
        {
            e++;
            a=a/10;
        }
        for(int i=1; i<=e; i++)
        {
            b=d;
            int x=c%10;
            int xx=b%10;
            c=c/10;
            while(b>0)
            {
                if(x==xx)
                    t=t*10+x;
                b=b/10;
                xx=b%10;
            }
        }
        return t;
    }
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter");
        int a=reader.nextInt();
        System.out.println("enter");
        int b=reader.nextInt();
        System.out.println(prime(a,b));

    }
}
