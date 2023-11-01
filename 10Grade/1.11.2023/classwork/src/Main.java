public class Main
{

    public static Node<Integer> buildList(int [] a)
    {
        Node<Integer> l = new Node<Integer>(a[0]);
        Node<Integer>p = l;
        for(int i = 1; i < a.length; i++)
        {
            Node<Integer> x=new Node<Integer>(a[i]);
            p.setNext(x);
            p=p.getNext();
        }
        return l;
    }

    public static void printList(Node<Integer> list)
    {
        System.out.println("list is :");
        Node<Integer>p = list;
        while (p != null)
        {
            int x = p.getValue();
            System.out.print(x + " ");
            p = p.getNext();
        }
        System.out.println();
    }

    public static int sumList(Node<Integer> list)
    {
        int sum = 0;
        Node<Integer> p = list;
        while(p != null)
        {
            sum = sum + p.getValue();
            p = p.getNext();
        }
        return sum;
    }

    public static int numOddInList(Node<Integer> list)
    {
        int y, x = 0;
        Node<Integer> p = list;
        while(p != null)
        {
            y = p.getValue();
            if (y%2 == 0)
            {
                x++;
            }
            p = p.getNext();
        }
        return x;
    }

    public static boolean numInList(Node<Integer> list, int num)
    {
        int y;
        Node<Integer> p = list;
        while(p != null)
        {
            y = p.getValue();
            if (y == num)
            {
                return true;
            }
            p = p.getNext();
        }
        return false;
    }

    public static Node<Integer> deleteNum(Node<Integer> list, int num)
    {
        Node<Integer> first = new Node<Integer>(null, list);
        Node<Integer> p = first;
        while(p.getNext()!= null)
        {
            if(p.getNext().getValue() == num)
            {
                p.setNext(p.getNext().getNext());
            }
            else
            {
                p = p.getNext();
            }
        }
        return first.getNext();
    }

    public static Node<Integer> cleanList(Node<Integer> list)
    {
        Node<Integer> p = new Node<Integer>(null, list);
        Node<Integer> p2 = p;
        int num;
        while(p2.getNext() != null)
        {
            num = p2.getNext().getValue();
            p2 = p2.getNext();
            p2 = deleteNum(p2.getNext(), num);
        }
        return p.getNext();
    }

    public static void printLargeNums(Node<Integer> list)
    {
        int max, x;
        boolean ok = true;
        Node<Integer> p = list;
        Node<Integer> p2;
        while(p != null)
        {
            max = p.getValue();
            p2 = p.getNext();
            while(p2 != null && ok)
            {
                x = p2.getValue();
                if(x > max)
                {
                    ok = false;
                }
                p2 = p2.getNext();
            }
            if(ok)
            {
                System.out.println(max);
            }
            else
            {
                ok = true;
            }
            p = p.getNext();
        }
    }

    public static void main(String[] args)
    {
        int [] a = {10, 20, 41, 30 , 50, 41, 50, 60, 10};
        Node<Integer> l = buildList( a);
        printList(l);
        Node<Integer> l2 = cleanList(l);
        printList(l2);
    }
}
