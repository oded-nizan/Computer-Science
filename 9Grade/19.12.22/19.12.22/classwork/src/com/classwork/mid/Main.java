package com.classwork.mid;

import java.util.*;
import com.classwork.order.Main;


public class Main1 {

    static Scanner reader = new Scanner(System.in);

    public static int mid(int[] a){
        Main.order(a);
        return a[(a.length + 1) / 2];
    }

    public static void input(int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.println("Enter number: ");
            a[i] = reader.nextInt();
        }
    }

    public static void main(String [] args){

        System.out.println("Enter number of numbers in array(should be odd): ");
        int mi = reader.nextInt();
        int[] a = new int[mi];
        input(a);

        System.out.println(mid(a));

    }
}
