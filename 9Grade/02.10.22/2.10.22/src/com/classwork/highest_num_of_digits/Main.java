package com.classwork.highest_num_of_digits;

import java.util.*;

public class Main {
    public static void main(String [] args) {
        Scanner reader = new Scanner(System.in);
        
        int a, d, md = 0, ma = 0, n;
        
        for(int i = 1; i <= 4;i++) {
            a = reader.nextInt();
            n = a;
            d = 0;
            
            while(a > 0) {
                d++;
                a /= 10;
            }
            System.out.println(d);
            if(d > md) {
                md = d;
                ma = n;
            }
        }
        System.out.println(ma);
    }
}
