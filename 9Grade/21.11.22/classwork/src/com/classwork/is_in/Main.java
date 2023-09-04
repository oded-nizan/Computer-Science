package com.classwork.is_in;

import java.util.*;

public class Main {

    public static boolean char_is_in(String x, char y) {
        for (int i = 0; i < x.length(); i++){
            if (y == x.charAt(i)) {
                return true;
            }
        }
        return false;
    }


    public static void main(String [] args){
        Scanner reader = new Scanner(System.in);
        String x = reader.next();
        char y = reader.next().charAt(0);
        System.out.println(char_is_in(x, y));
    }
}


