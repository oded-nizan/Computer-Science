package com.classwork.is_in_times;

import java.util.*;

public class Main {

    public static int char_is_in(String x, char y) {
        int z = 0;
        for (int i = 0; i < x.length(); i++){
            if (y == x.charAt(i)) {
                z++;
            }
        }
        return z;
    }


    public static void main(String [] args){
        Scanner reader = new Scanner(System.in);
        String x = reader.next();
        char y = reader.next().charAt(0);
        System.out.println(char_is_in(x, y));
    }
}


