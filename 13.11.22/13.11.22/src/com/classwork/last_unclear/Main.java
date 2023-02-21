package com.classwork.last_unclear;

class Main
{
    public static int last(int a)
    {
        int s=0;
        for (int i=2; i<a; i++)
        {
            if(a%i==0)
            {
                s++;
            }
        }
        return s;
    }
    public static void main(String[] args)
    {
        for (int i=10; i<=100; i++)
        {
            if (last(i)==0)
            {
                System.out.println (i);
            }
        }
    }
}
