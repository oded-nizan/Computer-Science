package compony.g;

import java.util.*;

public class Main {

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        int x, s = 0;
        System.out.println("Enter a num");
        int a = input.nextInt();

        while (a > 0) {
            x = a % 10;
            if (x%2==0) {
                System.out.println(x);
                s++;
            }
            a /= 10;
        }
        System.out.println("THe num of even digits is: " + s);
    }
}
