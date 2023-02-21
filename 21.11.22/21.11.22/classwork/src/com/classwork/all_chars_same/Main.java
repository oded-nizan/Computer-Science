package com.classwork.all_chars_same;

import java.util.*;

public class Main {

    public static boolean all_chars_same(String x) {
        char y = x.charAt(0);
        for (int i = 1; i < x.length();i++) {
            if (y != x.charAt(i)){
                return false;
            }
        }
        return true;
    }


    public static void main(String [] args){
        Scanner reader = new Scanner(System.in);
        String x = reader.next();
        System.out.println(all_chars_same(x));
    }
}


