package com.classwork.same_digits;

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
        while(x>0) {
            int a = x % 10;
            //noinspection SuspiciousNameCombination
            boolean k = digit_in_num(y, a) > 0;
            if (!k) {
                return false;
            }
            x /= 10;

        }
        return true;
    }

    public static void main(String [] args) {

        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();
        int y = reader.nextInt();

        boolean a = equalDigits(x, y);
        @SuppressWarnings("SuspiciousNameCombination") boolean b = equalDigits(y, x);
        System.out.println(a && b);
    }
}


