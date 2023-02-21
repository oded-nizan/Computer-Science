package com.classwork.left_digit;

import java.util.*;
public class Main {

    public static int left_digit(int num){
        int left_digit = -1;
        while (num > 0){
            left_digit = num % 10;
            num /= 10;
        }
        return left_digit;
    }

    public static void main(String [] args){
        Scanner reader = new Scanner(System.in);

        int num = reader.nextInt();

        System.out.println(left_digit(num));
    }
}
