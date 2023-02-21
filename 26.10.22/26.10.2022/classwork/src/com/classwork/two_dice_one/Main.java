package com.classwork.two_dice_one;

public class Main {

    public static void main(String [] args) {

        int m = 0;

        for (int i = 1; i <= 20; i++) {
            int x = (int)(Math.random() * 6) + 1;
            int y = (int) (Math.random() *6) + 1;
            System.out.println(x + y);
            if(x == y) {
                m++;
            }

        }
        System.out.println(m);
    }
}
