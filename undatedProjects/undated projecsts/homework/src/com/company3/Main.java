package com.company3;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = 0, a, b, x, id;
        for (int i = 1; i<=10;i++){
            System.out.println("Enter information: ");
            id = scanner.nextInt();
            a = scanner.nextInt();
            b = scanner.nextInt();
            x = a - b;
            s += x;
            System.out.println(id + " you have " + x + " left over");

        }
        System.out.println("the total left over of all is " + s);

    }
}

