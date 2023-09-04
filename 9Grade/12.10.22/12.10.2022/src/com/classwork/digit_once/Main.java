package com.classwork.digit_once;

public class Main {

    public static void main (String [] args) {
        int a , x, y;
        boolean eq;

        for (int i = 1000; i <= 9000; i++) {

            eq = true;
            a = i;
            y = a % 10;
            a /= 10;

            while (a>0) {
                x = a % 10;
                a /= 10;

                if (x == y) {
                    a = 0;
                    eq = false;
                }

            }
            if (eq) {
                System.out.println(i);
            }
        }
    }
}
