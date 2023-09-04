package com.classwork.full_sqrt;

public class Main {

    public static void main(String[] args) {

        double y;
        int z = 0;

        for(int i = 1; i <= 1000; i++){
            y = Math.sqrt(i);
            if((int)y == y) {
                System.out.println("A full sqrt number is " + y);
            }
            else {
                z++;
            }
        }
        System.out.println("The number of unfull sqrt numbers is: " + z);


    }
}