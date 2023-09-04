package com.classwork.avg_speed;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter speed: ");
        int m = 0, s = 0, r, a;
        System.out.println("Enter car number or -69 to exit: ");
        int cn = reader.nextInt();

        while (cn != -99){
            a = reader.nextInt();
            if (a > 90){
                r = 10 * (a - 90);
                System.out.println(cn + " is fined: " + r + " dollars");
                s += r;
            }

            System.out.println("Enter scar number or -99 to exit");
            cn = reader.nextInt();
        }

        System.out.println("All together the drivers payed " + s + " dollars");


    }
}
