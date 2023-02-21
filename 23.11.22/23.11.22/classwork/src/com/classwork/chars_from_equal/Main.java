package com.classwork.chars_from_equal;

import java.util.*;

public class Main {
    public static int all_in(String y, int x){
        x --;
        int m = 1;
        while(x<y.length() - 1 && y.charAt(x) == y.charAt(x+1)){
            m++;
            x++;
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String y = reader.next();
        int x = reader.nextInt();
        System.out.println(all_in(y, x));

    }
}
