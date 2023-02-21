package com.company2;

public class Main {

    public static void main (String [] args) {

        int a = 0;
        int b = 1;
        int c;
        System.out.println(a);
        System.out.println(b);


        for(int i = 2; i <= 10;i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c ;


        }
    }
}
