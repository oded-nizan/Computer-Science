package com.classwork.merge;

import java.util.Scanner;

public class Main
{
    static Scanner reader = new Scanner(System.in);

    public static void print_array(int[] a)
    {
        for (int j : a) {
            System.out.println(j);
        }
    }


    public static void input(int[] a)
    {
        System.out.println("Make sure you input the arrays sorted");
        for (int i = 0; i < a.length; i++)
        {
            System.out.println("Enter number: ");
            a[i] = reader.nextInt();
        }
    }

    public static void merge(int[] a, int[] b, int[] c){
        int ia = 0, ib = 0, ic = 0;
        while(ia < a.length && ib < b.length)
        {

            if (a[ia] > b[ib]){
                c[ic] = b[ib];
                ib++;
            }
            else
            {
                c[ic] = a[ia];
                ia++;
            }
            ic++;

            if (ia == a.length){
                while (ic < c.length){
                    c[ic] = b[ib];
                    ib ++;
                    ic++;
                }
            }
            else if (ib == b.length){
                while (ic < c.length){
                    c[ic] = a[ia];
                    ia ++;
                    ic++;
                }
            }

        }
        print_array(c);
    }


    public static void main(String [] args)
    {
        System.out.println("Enter number of variables in the array: ");
        int mia = reader.nextInt();
        int[] a= new int[mia];
        input(a);
        System.out.println("Enter number of variables in the array: ");
        int mib = reader.nextInt();
        int[] b= new int[mib];
        input(b);

        int[] c= new int[mia + mib];

        merge(a, b, c);

    }
}