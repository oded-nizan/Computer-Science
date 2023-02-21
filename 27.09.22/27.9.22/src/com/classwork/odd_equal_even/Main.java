package com.classwork.odd_equal_even;

import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner reader= new Scanner (System.in);

        int n, x=0, d, a;
        System.out.println("Enter a number:");
        n=reader.nextInt();
        a = n;

        while(n > 0) {

            d = n % 10;

            if(d >= x) {
                x = d;
            }

            n /= 10;
        }

        System.out.printf("%d Is the largest digit in %d", x, a);
    }
}
