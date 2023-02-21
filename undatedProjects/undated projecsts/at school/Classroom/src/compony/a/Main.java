package compony.a;

import java.util.*;

public class Main {

    public static void main(String [] args) {

        Scanner reader = new Scanner(System.in);

        int id, m, av, s = 0, x = 0;

        for(int i = 1; i <= 10; i++){
            System.out.println("Enter your id: ");
            id = reader.nextInt();

            System.out.println("Enter math score : ");
            m = reader.nextInt();

            if(m > 55){
                s += m;
                x += 1;
            }
            else {
                System.out.printf("%d, %d, FAIL", id, m);
            }
        }

        if(x == 0) {
            System.out.println("all failed");
        }
        else {
            av = s / x;
            System.out.printf("Average math score is %d", av);
        }
    }
}