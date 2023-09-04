package com.classwork.two_dice_three;

public class Main {

    public static void main(String [] args) {

        int m = 0, z = 0;

        while (m < 5) {
            int x = (int)(Math.random() * 6) + 1;
            int y = (int) (Math.random() *6) + 1;
            System.out.println(x + y);
            z++;
            if(x == y) {
                m++;
            }

        }
        System.out.println(z);
    }
}
