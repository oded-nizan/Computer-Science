package com.classwork.equal_chars;

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

    public static boolean all_in(String y, String x){
        for (int i = 0;i < x.length();i++) {
            if (!(char_is_in(x, y.charAt(i)))) {
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String y = reader.next();
        String x = reader.next();
        System.out.println(all_in(y, x));

    }
}
