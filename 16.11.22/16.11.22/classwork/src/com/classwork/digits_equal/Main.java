package com.classwork.digits_equal;

import java.util.*;

public class Main {

    public static int digit_in_num(int x, int y) {
        int m = 0, a;
        while (x>0) {
            a = x%10;
            if (y == a){
                m++;
            }
            x /= 10;
        }
        return m;
    }


    public static boolean equalDigits(int x, int y) {
        for (int i = 0; i <= 9; i++) {
            int a = digit_in_num(x, i);
            @SuppressWarnings("SuspiciousNameCombination") int b = digit_in_num(y, i);
            if (a > 0 && b > 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String [] args) {

        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();
        int y = reader.nextInt();

        System.out.println(equalDigits(x, y));
    }
}
