package compony.e;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int a, d = 0;
        System.out.println("Enter num: ");
        a = input.nextInt();
        for (int i = 2; i < a; i++) {
            if (a%i == 0) {
                d=1;
                i=a;
            }
        }
        if (d==0) {
            System.out.println("The num is prime");
        }
        else {
            System.out.println("The num is not prime");
        }
    }
}
