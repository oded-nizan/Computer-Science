package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int tz, s = 0, a = 0, y, x, h, j;

        for (int i = 1; i <= 20; i++) {

            System.out.println("Enter your information: ");
            tz = input.nextInt();
            h = input.nextInt();
            j = input.nextInt();

            x = j * h * 6;
            s += x;
            System.out.printf("Your id is %d and your weekly salary is %d", tz, x);

            if (x > 10000) {

                System.out.println("Good job!");
                a++;
            }

            System.out.println("The amount of workers with under 10k weekly salary is: " + (20-a));
            y = s / 20;
            System.out.printf("The average weekly salary of workers is: %d", y);

        }

    }

}

