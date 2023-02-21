package compony.b;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        int x, s = 0;
        for (int i = 1; i <= 8; i++) {
            System.out.println("Enter num: ");
            x = input.nextInt();
            s += x;
            if ((x % 2) == 0) {
                System.out.println("Even, " + x);
            }
        }
        System.out.println(s);
    }
}
