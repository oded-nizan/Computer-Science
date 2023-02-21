package compony.j;

import java.util.*;

public class Main {

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        int x, s = 0;
        boolean t = true;
        System.out.println("Enter a num");
        int a = input.nextInt();
        s = a % 10;

        while (a > 0) {
            x = a % 10;

            if(x == s) {
                a /= 10;
            }
            else {
                t = false;
                a = 0;
            }
        }
        if (t) {
            System.out.println("all the digits are the same");
        }
        else {
            System.out.println("All the digits are not the same");
        }
    }
}
