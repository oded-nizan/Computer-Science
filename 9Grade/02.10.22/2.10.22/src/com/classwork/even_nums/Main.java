package com.classwork.even_nums;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        boolean e;
        int a, x, n, ec = 0;
        
        for(int i = 1; i <= 4; i++) {
            
            a = reader.nextInt();
            n = a;
            e = true;
            
            while(a > 0) {
                x = a % 10;
                
                if(x % 2 != 0) {
                    e = false;
                    a = 0;
                }
                a /= 10;
            }
            if(e) {
                System.out.println(n);
                ec++;
            }
        }
        System.out.println(ec);

    }
}
