@SuppressWarnings({"Convert2Diamond", "unused"})
public class Main {


    public static Queue<Integer> getCopyQ(Queue<Integer> q)
    {
        Queue<Integer> temp1 = new Queue<Integer>();
        Queue<Integer> temp2 = new Queue<Integer>();
        int x;

        while (!q.isEmpty())
        {
            x = q.remove();
            temp1.insert(x);
            temp2.insert(x);
        }

        while (!temp2.isEmpty())
        {
            x = temp2.remove();
            q.insert(x);
        }
        return temp1;
    }


    public static boolean isInQ(Queue<Integer> q, int x)
    {
        Queue<Integer> temp1 = getCopyQ(q);
        int y;
        while (!temp1.isEmpty())
        {
            y = temp1.remove();
            if (x == y)
                return true;
        }
        return false;
    }


    public static void removeFirstApp(Queue<Integer> q, int y)
    {
        Queue<Integer> temp1 = new Queue<Integer>();
        int x;
        boolean ok = true;
        while (!q.isEmpty() && ok)
        {
            x = q.remove();
            if (x != y)
            {
                temp1.insert(x);
            }
            else
            {
                ok = false;
            }
        }
        while (!q.isEmpty())
        {
            temp1.insert(q.remove());
        }
        while (!temp1.isEmpty())
        {
            q.insert(temp1.remove());
        }
    }


    public static Queue<Integer> sortQ(Queue<Integer> q)
    {
        Queue<Integer> temp = new Queue<Integer>();
        Queue<Integer> temp1 = getCopyQ(q);
        int x;

        while (!temp1.isEmpty())
        {
            x = removeMinQ(temp1);
            temp.insert(x);
        }
        return temp;
    }


    public static boolean sequence(Queue<Integer> q)
    {
        Queue<Integer> temp1 = getCopyQ(q);
        Queue<Integer> temp2;
        int x, sum = 0;

        while (!temp1.isEmpty())
        {
            x = temp1.remove();
            temp2 = getCopyQ(temp1);
            sum = 0;
            while (!temp2.isEmpty() && sum <= x)
            {
                sum += temp2.remove();
                if (sum == x)
                {
                    return true;
                }
            }
        }
        return false;
    }


    public static Queue<Integer> buildQ(int[] a) {
        Queue<Integer> q = new Queue<Integer>();
        for (int i = 0; i < a.length; i++)
            q.insert(a[i]);
        return q;
    }


    public static void printQ(Queue<Integer> q) {
        System.out.println("the q");
        Queue<Integer> temp = getCopyQ(q);
        while (!temp.isEmpty()) {
            int x = temp.remove();
            System.out.print(x + " ");
        }
        System.out.println();
    }


    public static int lenQ(Queue<Integer> q)
    {
        Queue<Integer> temp = getCopyQ(q);
        int sum = 0;

        while (!temp.isEmpty())
        {
            temp.remove();
            sum ++;
        }
        return sum;
    }


    public static int minQ(Queue<Integer> q)
    {
        Queue<Integer> temp = getCopyQ(q);
        int x, min = temp.remove();

        while (!temp.isEmpty())
        {
            x = temp.remove();
            min = Math.min(x, min);
        }
        return min;
    }


    public static int maxQ(Queue<Integer> q)
    {
        Queue<Integer> temp = getCopyQ(q);
        int x, max = temp.remove();

        while (!temp.isEmpty())
        {
            x = temp.remove();
            max = Math.max(x, max);
        }
        return max;
    }


    public static int removeMinQ(Queue<Integer> q)
    {
        Queue<Integer> qe = new Queue<Integer>();
        int m = q.remove();
        while (!q.isEmpty())
        {
            int x = q.remove();
            if (x < m)
            {
                qe.insert(m);
                m = x;
            }
            else
            {
                qe.insert(x);
            }
        }
        while (!qe.isEmpty())
        {
            q.insert(qe.remove());
        }
        return m;
    }


    public static void addNumQ(Queue<Integer> q, int x)
    {
        Queue<Integer> temp = new Queue<Integer>();
        temp.insert(x);
        while (!q.isEmpty())
        {
            temp.insert(q.remove());
        }
        while (!temp.isEmpty())
        {
            q.insert(temp.remove());
        }
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr = {7, 20, 8, 12};
        Queue<Integer> q1 = buildQ(arr);
        printQ(q1);
        System.out.println(sequence(q1));
    }
}