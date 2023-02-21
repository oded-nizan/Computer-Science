package com.classwork.digit_twice;

public class Main {

    public static void main (String [] args) {

        int a , x, y, t;

        for (int i = 1000; i <= 9000; i++) {

            t = 0;
            a = i;
            y = a % 10;
            a /= 10;

            while (a>0) {
                x = a % 10;

                if (x == y) {
                    t++;
                }
                a /= 10;
            }
            if (t==1) {
                System.out.println(i);
            }
        }
    }
}

