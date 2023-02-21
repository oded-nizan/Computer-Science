package com.classwork.common_ground;

import java.util.*;

public class Main {

    public static int common(int x, int y){
        while(x != y){
            if (y > x)
                y -= x;
            else if (x > y)
                x -= y;
        }
        return y;
    }

    public static void main(String [] args) {

        Scanner reader = new Scanner(System.in);

        int x = reader.nextInt();
        int y = reader.nextInt();

        System.out.println(common(x, y));
    }
}
