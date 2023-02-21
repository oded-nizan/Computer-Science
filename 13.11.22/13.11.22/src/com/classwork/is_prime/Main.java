package com.classwork.is_prime;

class Main
{
    public static int prime(int a)
    {
        int s=0;
        while (a>0)
        {
            int k=a%10;
            a=a/10;
            int x=a%10;
            if (x >= k) {
                s = 1;
            }
        }
        return s;
    }
    public static void main(String[] args)
    {
        for (int i=0; i<=1000; i++)
        {
            if (prime(i)==0)
            {
                System.out.println (i);
            }
        }
    }
}
