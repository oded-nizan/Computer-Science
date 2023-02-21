package com.classwork.two_siries;

import java.util.*;

public class Main {

    public static void bigger_series(int st1, int st2, int in1, int in2){
        int  m = 0;
        while(st1 >= st2){
            st1 += in1;
            st2 += in2;
            m++;
            System.out.println(st1 + " " + st2);
        }
        System.out.println(m);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int st1 = reader.nextInt();
        int in1 = reader.nextInt();
        int st2 = reader.nextInt();
        int in2 = reader.nextInt();
        bigger_series(st1, st2, in1, in2);
    }
}