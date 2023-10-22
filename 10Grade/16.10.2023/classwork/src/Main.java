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
        if (n < m)
        {
            return 0;
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
        else
        {
            return n * power(n, m-1);
        }
    }

    public static int numOfDigits(int n)
    {
        if (n == 0)
        {
            return 0;
        }
        else
        {
            return 1 + numOfDigits(n / 10);
        }
    }

    public static int numOfEvenDigits(int n)
    {
        if (n == 0)
        {
            return 0;
        }
        else if (n % 2 == 0)
        {
            return 1 + numOfEvenDigits(n / 10);
        }
        else
        {
            return numOfEvenDigits(n / 10);
        }
    }

    public static int sumOfEvenDigits(int n)
    {
        if (n == 0)
        {
            return 0;
        }
        else if (n % 2 == 0)
        {
            return n%10 +sumOfEvenDigits(n / 10);
        }
        else
        {
            return sumOfEvenDigits(n / 10);
        }
    }

    public static int lastDigit(int n)
    {
        if (n == 0)
        {
            return 0;
        }
        else if (n < 10)
        {
            return n;
        }
        else
        {
            return lastDigit(n / 10);
        }
    }

    public static int sumOfEvenNoOddDigits(int n)
    {
        if (n == 0)
        {
            return 0;
        }
        else if (n % 2 == 0)
        {
            return n%10 + sumOfEvenNoOddDigits(n / 10);
        }
        else
        {
            return sumOfEvenNoOddDigits(n / 10) - n%10;
        }
    }

    public static int digitInNumber(int n, int m)
    {
        if (n%10 == m)
        {
            return 1;
        }
        else if (n == 0)
        {
            return 0;
        }
        else
        {
            return digitInNumber(n/10, m);
        }
    }

    public static boolean digitInNumberb(int n, int m)
    {
        if (n == 0)
        {
            return false;
        }
        else
        {
            return n%10==m || digitInNumberb(n/10, m);
        }
    }

    public static boolean allDigitsEven(int n)
    {
        if (n == 0)
        {
            return true;
        }
        else if (n % 2 == 0)
        {
            return allDigitsEven(n / 10);
        }
        else
        {
            return false;
        }
    }

    public static boolean atleastOneDigitEven(int n)
    {
        if (n == 0)
        {
            return false;
        }
        else if (n % 2 == 0)
        {
            return true;
        }
        else
        {
            return atleastOneDigitEven(n / 10);
        }
    }

    public static boolean isPrime(int n, int i)
    {
        if (i == n)
        {
            return true;
        }
        else if (n%i == 0)
        {
            return false;
        }
        else
        {
            return isPrime(n, i+1);
        }
    }

    public static boolean isPrime(int n)
    {
        return isPrime(n, 2);
    }



    public static void main(String[] args)
    {
        System.out.println(isPrime(100));
    }
}
