package com.classwork.power;

import java.util.*;

class Main {

    public static int power(int a, int b) {
        int power = a;
        for (int i = 1; i <= b; i++) {
            power *= a;
        }
        return power;
    }

    public static void main(String [] args) {

        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();
        int y = reader.nextInt();
        System.out.println(power(x, y));

    }
}
