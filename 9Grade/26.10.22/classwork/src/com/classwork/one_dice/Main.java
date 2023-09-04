package com.classwork.one_dice;

public class Main {

    public static void main(String [] args) {

        int m = 0;

        for (int i = 1; i <= 20; i++) {
            int x = (int)(Math.random() * 6) + 1;
            System.out.println(x);
            if(x%2 == 0) {
                m++;
            }
        }
        System.out.println(m);
    }
}
