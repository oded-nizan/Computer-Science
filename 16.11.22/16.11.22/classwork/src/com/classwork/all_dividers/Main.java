package com.classwork.all_dividers;

import java.util.*;

public class Main {

    public static void dividers(int x) {
        for (int i = 2; i < x; i++) {
            if (x%i == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String [] args) {

        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();
        dividers(x);
    }


}
