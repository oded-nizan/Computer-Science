package compony.d;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int id, a, b, s = 0, ps = 0, x = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Enter info: ");
            id = reader.nextInt();
            a = reader.nextInt();
            b = reader.nextInt();

            ps = a*10 + b*5;
            s += ps;

            System.out.println(id + ", Earned " + ps);
            if (ps < 500) {
                System.out.println("Sucker");
                x ++;
            }
        }
        System.out.println("All together you earned: " + s + "and the num of suckers is: " + x);
    }
}
