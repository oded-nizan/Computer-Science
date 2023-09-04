package com.classwork.all_chars;

import java.util.*;

public class Main {

    public static void all_chars(String x) {
        for (int i = 0; i < x.length();i++) {
            System.out.println(x.charAt(i));
        }
    }

    public static void main(String [] args){
        Scanner reader = new Scanner(System.in);
        String x = reader.next();
        all_chars(x);
    }
}
