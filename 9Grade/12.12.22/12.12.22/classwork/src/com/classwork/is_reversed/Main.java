package com.classwork.is_reversed;

import java.util.*;

public class Main {
    static Scanner reader = new Scanner(System.in);

<<<<<<< HEAD
    public static int[] reverse_array(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = Math.max(a[i], b[i]);
        }
        return b;
    }


    public static boolean is_reversed(int[] a, int[] b){
        int[] c = reverse_array(a);
        return b == c;
    }

=======
    public static boolean is_reversed(int[] a, int[] b){
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++){
            c[a.length-1-i] = a[i];
        }

        for (int i = 0; i < a.length; i++){
            if (b[i] != c[i]){
                return false;
            }
        }
        return true;
    }


>>>>>>> 96bb06651aea9ae252a25ac667cca194b3bc6a8a
    public static void input(int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.println("Enter number: ");
            a[i] = reader.nextInt();
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter number of numbers in array: ");
        int mi = reader.nextInt();
        int[] a = new int[mi];
        int[] b = new int[mi];
        input(a);
        input(b);



        System.out.println(is_reversed(a, b));


    }
<<<<<<< HEAD
}

=======
}
>>>>>>> 96bb06651aea9ae252a25ac667cca194b3bc6a8a
