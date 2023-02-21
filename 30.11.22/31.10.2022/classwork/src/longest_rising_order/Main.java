package longest_rising_order;

public class Main {

    public static void main(String[] args) {

        int m = 1, s = 0;
        int y = 8;
        for (int i = 1; i <= 10; i ++){
            int x = (int) (Math.random()*6) + 1;
            System.out.println(x);
            if (x > y) {
                s++;
                if (m < s) {
                    m = s;
                }
            }
            else{
                s = 0;
            }
            y = x;


        }
        System.out.println("The longest rising order series has: " + (m+1) + " rising numbers in a row");

    }
}

