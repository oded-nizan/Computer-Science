package com.classwork.same_egde_no_mid;

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

    public static int left_digit(int num){
        int left_digit = -1;
        while (num > 0){
            left_digit = num % 10;
            num /= 10;
        }
        return left_digit;
    }
    public static void same_edge_no_mid() {
        for (int i = 1000; i <= 9999; i++){
            int x = i % 10;
            if (x == left_digit(i) && in_num(i, x) == 2){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        same_edge_no_mid();
    }
}
