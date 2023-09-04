package three_in_a_row;

public class Main {

    public static void main(String[] args) {

        int m = 0, s = 0;
        int y = (int)(Math.random()*6) + 1;
        System.out.println(y);
        for (int i = 1; i <= 99; i++){
            int x = (int) (Math.random()*6) + 1;
            System.out.println(x);
            if (x==y) {
                s++;
            }
            else{
                s = 0;
            }
            y = x;

            if (s == 2) {
                s --;
                m++;
            }

        }
        System.out.println("The amount of three in a row is: " + m);

    }
}