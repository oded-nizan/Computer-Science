
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

    public static boolean allDigitsEqual(int n)
    {
        if (n < 10)
        {
            return true;
        }
        else
        {
            int x = n % 10;
            int y = (n/10) % 10;
            if (x != y)
            {
                return false;
            }
            else
            {
                return allDigitsEqual(n/10);
            }
        }
    }

    public static boolean isDescendingOrder(int n)
    {
        if (n < 10)
        {
            return true;
        }
        else
        {
            int x = n % 10;
            int y = (n/10) % 10;
            if (x >= y)
            {
                return false;
            }
            else
            {
                return isDescendingOrder(n/10);
            }
        }
    }

    public static int numDividers(int n, int i)
    {
        if (i == n)
        {
            return 0;
        }
        else if (n%i == 0)
        {
            return 1 + numDividers(n, i+1);
        }
        else
        {
            return numDividers(n, i+1);
        }
    }

    public static int numDividers(int n)
    {
        return numDividers(n, 2);
    }

    public static int largestDigit(int n)
    {
        if (n < 10)
        {
            return n;
        }
        else
        {
            return Math.max(n%10, largestDigit(n/10));
        }
    }

    public static int numDigitInNumber(int n, int m)
    {
        if (n%10 == m)
        {
            return 1 + numDigitInNumber(n/10, m);
        }
        else if (n == 0)
        {
            return 0;
        }
        else
        {
            return numDigitInNumber(n/10, m);
        }
    }

    public static int indexDigitInNumber(int n, int m, int p)
    {
        if (n == 0)
        {
            return -1;
        }
        else if (n%10 == m)
        {
            return p;
        }
        else
        {
            return  indexDigitInNumber(n/10, m, p+1);
        }
    }
    public static int indexDigitInNumber(int n, int m)
    {
        return indexDigitInNumber(n, m, 1);
    }

    public static boolean leftDigitEqualRight(int n, int m)
    {
        if (n/10 == m)
        {
            return true;
        }
        else if (n == 0)
        {
            return false;
        }
        else
        {
            return leftDigitEqualRight(n/10, m);
        }
    }

    public static boolean leftDigitEqualRight(int n)
    {
        return leftDigitEqualRight(n, n%10);
    }

    public static int sumDividers(int n, int i)
    {
        if (i == n)
        {
            return 0;
        }
        else if (n%i == 0)
        {
            return i + sumDividers(n, i+1);
        }
        else
        {
            return sumDividers(n, i+1);
        }
    }

    public static int sumDividers(int n)
    {
        return sumDividers(n, 1);
    }


    public static void printArray(int[] arr, int i)
    {
        if( i < arr.length)
        {
            System.out.println(arr[i]);
            printArray(arr, i+1);
        }
    }
    public static void printArray(int[] arr)
    {
        printArray(arr, 0);
    }

    public static int sumArray(int[] arr, int i)
    {
        if( i < arr.length - 1)
        {
            return arr[i] + sumArray(arr, i+1);
        }
        else
        {
            return arr[i];
        }
    }
    public static int sumArray(int[] arr)
    {
        return sumArray(arr, 0);
    }

    public static double maAv1(int num, int k)
    {
        double sum;
        if (k == 1)
            return num;
        sum = maAv1(num / 10, k-1) * (k-1);
        return ((num % 10) + sum) / k;
    }

    public static double maAv2(int num, int s, int n)
    {
        if(num==0)
            return s/n;
        else
            return maAv2(num/10,s+num%10,n+1);
    }


    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(sumArray(arr));
    }
}
