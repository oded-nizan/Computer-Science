package com.classwork.double_all_in;

import java.util.*;

public class Main {

    static Scanner reader = new Scanner(System.in);

    public static boolean is_in(int[] a, int b){
        for (int j : a) {
            if (j == b) {
                return true;
            }
        }
        return false;
    }
    public static boolean all_in(int[] a, int[] b){
        for (int i = 0; i < b.length; i++){
            if (!(is_in(b ,a[i]))){
                return false;
            }
        }
        return true;
    }

    public static boolean double_all_in(int[] a, int[] b){

        return all_in(a, b) && all_in(b, a);
    }

    public static void input(int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.println("Enter number: ");
            a[i] = reader.nextInt();
        }
    }

    public static void main(String [] args){

        System.out.println("Enter number of numbers in array: ");
        int mi = reader.nextInt();
        int[] a = new int[mi];
        System.out.println("Enter new number of numbers in array: ");
        int mi2 = reader.nextInt();
        int [] b = new int[mi2];
        input(a);
        input(b);

        System.out.println(double_all_in(a, b));
    }
}
