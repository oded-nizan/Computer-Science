package compony.f;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int a, s = 0;
        System.out.println("Enter num: ");
        a = input.nextInt();
        for (int i = 1; i < a; i++) {
            if (a%i == 0) {
                s += i;
            }
        }
        if (s == a) {
            System.out.println("The num is perfect");
        }
        else {
            System.out.println("The num is not perfect");
        }
    }
}
