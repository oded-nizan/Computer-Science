package com.classwork.all_digits_different;

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

    public static boolean no_reapiting(int x){
        for (int i = 0; i <= 9; i++){
            if (digit_in_num(x, i) > 1) {
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        System.out.println(no_reapiting(a));


    }
}