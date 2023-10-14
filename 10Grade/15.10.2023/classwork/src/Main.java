public static void main(String[] args)
        {
        System.out.println("Hello world!");
        int[] arr = {6,13,2,9,27,10};
        Queue<Integer> q1 = buildQ(arr);
        printQ(q1);
        }


public static Queue<Integer> buildQ(int [] a)
        {
        Queue<Integer> q = new Queue<Integer>();
        for(int i=0;i<a.length;i++)
        q.insert(a[i]);
        return q;
        }

public static void printQ(Queue<Integer> q)
        {
        System.out.println("the q");
        while(q.isEmpty()==false)
        {
        int x = q.remove();
        System.out.print(x+" ");
        }
        System.out.println();
        }