package com.classwork.digits_in_num

import java.util.*;

class Main {

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

    public static void main(String [] args) {
        Scanner reader = new Scanner(System.in);

        int x = reader.nextInt();
        int y = reader.nextInt();
        System.out.println(digit_in_num(x, y));
    }
}

