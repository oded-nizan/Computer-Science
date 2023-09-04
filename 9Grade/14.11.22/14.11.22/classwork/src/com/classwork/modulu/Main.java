package com.classwork.modulu;

import java.util.*;

public class Main {

    public static int modulu(int x, int y) {
        while (x>=y) {
            x -= y;
        }
        return x;
    }

    public static void main(String [] args) {

        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();
        int y = reader.nextInt();
        System.out.println(modulu(x, y));

    }
}
