package com.classwork.lenghts_equal_char;

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

    public static void longest_strike(String y) {
        int m1=0, m2, mfinal=0;
        for (int i = 1; i < y.length();i++) {
            m2 = all_in(y, i);
            mfinal = Math.max(m2, m1);
            m1 = m2;
        }
        System.out.println(mfinal);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String y = reader.next();
        longest_strike(y);
    }
}

