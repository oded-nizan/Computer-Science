package com.classwork.midlle_number;

import java.util.Scanner;

public class Main
{

    static Scanner reader = new Scanner(System.in);

    public static boolean num_in_array(int[] a, int b){
        for (int j : a) {
            if (j == b) {
                return true;
            }
        }
        return false;
    }

    public static void input(int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.println("Enter num: ");
            int x = reader.nextInt();
            a[i] = x;
        }
    }


    public static int [] all_left_small(int[] a){
        boolean k = true;
        int x = 0;
        int[] b = new int[a.length];
        for (int i = 1; i < a.length -1; i++)
        {
            for (int j = 0; j < i; j++ ){
                if (a[j] > a[i]){
                    j = i;
                    k = false;
                }
            }
            if (k){
                b[x] = a[i];
                x ++;
            }
        }
        return b;
    }

    public static int [] all_right_larger(int[] a){
        boolean k = true;
        int x = 0;
        int[] b = new int[a.length];
        for (int i = 1; i < a.length -1; i++)
        {
            for (int j = i; j < a.length; j++ ){
                if (a[j] < a[i]){
                    j = i;
                    k = false;
                }
            }
            if (k){
                b[x] = a[i];
                x ++;
            }
        }
        return b;
    }

    public static void middle_num(int [] a){
        int [] b = all_left_small(a);
        int [] c = all_right_larger(a);

        for (int j : a) {
            if (num_in_array(b, j) && num_in_array(c, j)) {
                System.out.println(j);
            }
        }
    }



    public static void main(String[] args)
    {
        int mi = reader.nextInt();
        int[] a = new int[mi];
        input(a);
        middle_num(a);
    }
}
