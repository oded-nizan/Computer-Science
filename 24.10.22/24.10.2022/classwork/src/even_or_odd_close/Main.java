package even_or_odd_close;


public class Main {

    public static void main(String[] args) {

        int y, a, x;
        boolean irs;

        for(int i = 1000; i <= 2000; i++) {

            irs = false;
            a = i;

            while (a > 0) {
                y = a % 10;
                a /= 10;
                x = a % 10;
                if (y % 2 == x % 2) {
                    a = 0;
                    System.out.println("YES " + i);
                    irs = true;
                }
                a /= 10;
            }
            if (!irs) {
                System.out.println("NO " + i);
            }
        }
    }
}