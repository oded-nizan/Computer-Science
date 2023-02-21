package rising_order;

public class Main {

    public static void main(String[] args) {

        int m = 0, s = 0;
        int y = 8;
        for (int i = 1; i <= 100; i ++){
            int x = (int) (Math.random()*6) + 1;
            System.out.println(x);
            if (x > y) {
                s++;
                if (s >= 2) {
                    m++;
                }
            }
            else{
                s = 0;
            }
            y = x;


        }
        System.out.println("The amount of rising order series is: " + m);

    }
}

