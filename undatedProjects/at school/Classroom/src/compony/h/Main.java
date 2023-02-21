package compony.h;

import java.util.*;

public class Main {

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        int x, s = 0;
        System.out.println("Enter a num");
        int a = input.nextInt();

        while (a > 0) {
            x = a % 10;

            if (x%2!=0) {
                s=1;
                a=0;
            }
            a /= 10;
        }
        if (s==1) {
            System.out.println("One or more digits are not even");
        }
        else {
            System.out.println("All the digits are even");
        }
    }
}
