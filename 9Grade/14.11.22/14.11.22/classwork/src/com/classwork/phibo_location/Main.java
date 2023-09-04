package com.classwork.power;

import java.util.*;

class Main {

    public static int phiboLocation(int x) {
        int a = 0, b = 1, c = 0;

        for(int i = 1; i < x; i++){
            c = a+b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String [] args) {

        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();

        System.out.println(phiboLocation(x));

    }
}
