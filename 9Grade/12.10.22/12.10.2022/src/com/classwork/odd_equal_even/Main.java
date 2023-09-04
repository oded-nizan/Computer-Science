package com.classwork.odd_equal_even;

public class Main {

    public static void main(String[] args) {
        int ec, oc, x, a;

        for (int i = 1000; i <= 9000; i++)
        {
            oc = 0;
            ec = 0;
            a = i;

            while (a>0)
            {
                x = a % 10;

                if (x%2 == 0)
                {
                    ec++;
                }
                else
                {
                    oc++;
                }

                a /= 10;
            }

            if (oc == ec)
            {
                System.out.println(i);
            }
        }
    }
}
