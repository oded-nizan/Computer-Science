package com.classwork.all_digits_odd;

public class Main {

    public static boolean allDigitsOdd( int x) {
        while (x>0) {
            int y = x % 10;
            if (y % 2 != 0) {
                return false;
            }
            x/=10;
        }
        return true;
    }

    public static void main(String [] args) {
        for (int i = 100; i <= 999; i++) {
            if (allDigitsOdd(i)) {
                System.out.println(i);
            }
        }
    }
}
