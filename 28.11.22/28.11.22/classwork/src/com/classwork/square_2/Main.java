package com.classwork.square_2;

//import java.util.*;

public class Main {

    public static double square(int x){
        double l=0, r=x, m=-1, y;
        while ((r-l) > 0.00001){
            m = (l+r)/2;
            y = (m*m) - x;
            if (y > 0){
                r = m;
            }
            else if (y < 0) {
                l = m;
            }
            else {
                return m;
            }
        }

        return m;
    }

    public static void main(String[] args) {

        /*
        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();
        */

        System.out.println(square(2));
    }
}
