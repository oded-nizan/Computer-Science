package four_rising_order;

public class Main {

    public static void main(String[] args) {

        int m = 0, s = 0, z = 0;
        int y = 8;
        while (m < 4){
            int x = (int) (Math.random()*6) + 1;
            System.out.println(x);
            z++;
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
        System.out.println("The amount of rolls it took to get four rising order series is: " + z);

    }
}

