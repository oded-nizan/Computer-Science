public class Main
{

    public static int factorial(int n)
    {
        if (n == 0)
        {
            return 1;
        }
        else
        {
            return n * factorial(n-1);
        }
    }

    public static int sum(int n)
    {
        if (n == 0)
        {
            return 0;
        }
        else
        {
            return n + sum(n-1);
        }
    }

    public static int multiply(int n, int m)
    {
        if (n == 0)
        {
            return 0;
        }
        else
        {
            return m + multiply(n-1, m);
        }
    }

    public static int sumBetween(int n, int m)
    {
        if (n > m)
        {
            return 0;
        }
        else
        {
            return n + sumBetween(n + 1, m);
        }
    }

    public static int sumDigits(int n)
    {
        if (n == 0)
        {
            return 0;
        }
        else
        {
            return n % 10 + sumDigits(n / 10);
        }
    }

    public static int numDigits(int n)
    {
        if (n == 0)
        {
            return 0;
        }
        else
        {
            return 1 + numDigits(n / 10);
        }
    }

    public static int numInNumber(int n, int m)
    {
        if (n == 0 || m == 0)
        {
            return 0;
        }
        else if (n == m)
        {
            return 1;
        }
        else
        {
            return 1 + numInNumber(n, m-n);
        }
    }

    public static int power(int n, int m)
    {
        if (m == 0)
        {
            return 1;
        }
        else if (m == 1)
        {
            return n;
        }
        else
        {
            return n * power(n, m-1);
        }
    }

    public static void main(String[] args)
    {
        System.out.println(power(2, 6));
    }
}
