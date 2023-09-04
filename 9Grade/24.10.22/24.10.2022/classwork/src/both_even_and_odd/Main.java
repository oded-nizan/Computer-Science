package both_even_and_odd;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int y, oc = 0, ec = 0;

        System.out.println("Enter num: ");
        int a = reader.nextInt();

        while(a>0 && (ec == 0 || oc == 0)) {
            y = a%10;
            if(y%2 == 0) {
                ec++;
            }
            else {
                oc++;
            }
            a /= 10;
        }
        if(oc>0 && ec>0) {
            System.out.println("The num has both even and odd digits");
        }
        else {
            System.out.println("The num does not have both even and odd digits");
        }

    }
}