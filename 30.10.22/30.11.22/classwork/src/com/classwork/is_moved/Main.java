package com.classwork.is_moved;

import java.util.*;

public class Main {

    public static int digits(int x){
        int m = 0;
        while (x > 0) {
            m++;
            x /= 10;
        }
        return m;
    }

    public static int power_ten(int n) {
        int power_ten = 1;
        for (int i = 1; i < n; i ++){
            power_ten *= 10;
        }
        return power_ten;
    }

    public static int move(int a){
        int digits = digits(a);
        int power_ten = power_ten(digits), x = a % 10, result;
        int an = (a - x) / 10;

        result = x * power_ten + an;

        return result;
    }

    public static boolean is_moved(int a, int b){
        int x = digits(a), w = a;
        for (int i = 1; i <= x; i++){
            w = move(w);
            if (w == b){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int a = reader.nextInt();
        int b = reader.nextInt();

        System.out.println(is_moved(a, b));
    }



}
