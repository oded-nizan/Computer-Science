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

    public static void main(String[] args)
    {
        System.out.println(multiply(4, 5));
    }
}
