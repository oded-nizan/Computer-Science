package compony.c;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.println("Enter num: ");
        a = input.nextInt();
        for (int i = 2; i < a; i++) {
            if (a%i == 0) {
                System.out.println(i);
            }
        }
    }
}
