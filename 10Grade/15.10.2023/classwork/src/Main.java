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

    public static int minQorder(Queue<Integer> q)
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


    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr = {10, 20, 4, 30, 2, 21, 8};
        Queue<Integer> q1 = buildQ(arr);
        printQ(q1);
        System.out.println(minQorder(q1));
    }
}