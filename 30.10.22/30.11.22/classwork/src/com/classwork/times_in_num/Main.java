package com.classwork.times_in_num;

import java.util.*;

public class Main {

    public static int in_num(int x, int digit){
        int m = 0, y;
        while (x > 0) {
            y = x % 10;
            x /= 10;
            if (digit == y) {
                m++;
            }
        }
        return m;
    }

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int x = reader.nextInt();
        int digit = reader.nextInt();

        System.out.println(in_num(x, digit));
    }
}
