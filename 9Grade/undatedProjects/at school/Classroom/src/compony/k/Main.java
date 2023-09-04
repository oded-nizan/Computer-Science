package compony.k;

import java.util.*;

public class Main {

    public static void main (String [] args) {
        Scanner reader = new Scanner(System.in);

        int x, m, s = 0;
        for (int i = 1; i <= 4; i ++) {
            System.out.println("Enter num: ");
            int a = reader.nextInt();
            m = 0;

            while (a > 0) {
                x = a % 10;
                m += x;
                a /= 10;
            }
            System.out.println(m);
            s += m;
        }
        System.out.println(s);
    }
}
