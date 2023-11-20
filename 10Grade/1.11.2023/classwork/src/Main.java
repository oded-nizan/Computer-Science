@SuppressWarnings({ "Convert2Diamond", "unused" })
public class Main {

    public static Node<Integer> buildList(int[] a) {
        Node<Integer> l = new Node<Integer>(a[0]);
        Node<Integer> p = l;
        for (int i = 1; i < a.length; i++) {
            Node<Integer> x = new Node<Integer>(a[i]);
            p.setNext(x);
            p = p.getNext();
        }
        return l;
    }

    public static void printList(Node<Integer> list) {
        System.out.println("list is :");
        Node<Integer> p = list;
        while (p != null) {
            int x = p.getValue();
            System.out.print(x + " ");
            p = p.getNext();
        }
        System.out.println();
    }

    public static int sumList(Node<Integer> list) {
        int sum = 0;
        Node<Integer> p = list;
        while (p != null) {
            sum = sum + p.getValue();
            p = p.getNext();
        }
        return sum;
    }

    public static int numOddInList(Node<Integer> list) {
        int y, x = 0;
        Node<Integer> p = list;
        while (p != null) {
            y = p.getValue();
            if (y % 2 == 0) {
                x++;
            }
            p = p.getNext();
        }
        return x;
    }

    public static boolean numInList(Node<Integer> list, int num) {
        int y;
        Node<Integer> p = list;
        while (p != null) {
            y = p.getValue();
            if (y == num) {
                return true;
            }
            p = p.getNext();
        }
        return false;
    }

    public static Node<Integer> deleteNum(Node<Integer> list, int num) {
        Node<Integer> first = new Node<Integer>(null, list);
        Node<Integer> p = first;
        while (p.getNext() != null) {
            if (p.getNext().getValue() == num) {
                p.setNext(p.getNext().getNext());
            } else {
                p = p.getNext();
            }
        }
        return first.getNext();
    }

    public static Node<Integer> cleanList(Node<Integer> list) {
        Node<Integer> p = list;
        while (p != null) {
            int x = p.getValue();
            p.setNext(deleteNum(p.getNext(), x));
            p = p.getNext();
        }
        return list;
    }

    public static void printLargeNums(Node<Integer> list) {
        int max, x;
        boolean ok = true;
        Node<Integer> p = list;
        Node<Integer> p2;
        while (p != null) {
            max = p.getValue();
            p2 = p.getNext();
            while (p2 != null && ok) {
                x = p2.getValue();
                if (x > max) {
                    ok = false;
                }
                p2 = p2.getNext();
            }
            if (ok) {
                System.out.println(max);
            } else {
                ok = true;
            }
            p = p.getNext();
        }
    }

    public static Node<Integer> fibonaci() {
        Node<Integer> l = new Node<>(0);
        Node<Integer> p = l;
        int x = 0, y = 1, z;
        for (int i = 0; i < 20; i++) {
            p.setNext(new Node<Integer>(x));
            p = p.getNext();
            z = x + y;
            x = y;
            y = z;
        }
        return l.getNext();
    }

    public static boolean risingSeries(Node<Integer> list) {
        Node<Integer> p = list;
        int x;
        if (p.getNext() != null) {
            x = p.getValue() - p.getNext().getValue();
        } else {
            return false;
        }
        while (p.getNext() != null) {
            if (p.getValue() - p.getNext().getValue() != x) {
                return false;
            }
            p = p.getNext();
        }
        return true;
    }

    public static boolean listInListOrder(Node<Integer> listA, Node<Integer> listB) {
        Node<Integer> p1 = listA;
        Node<Integer> p2 = listB;
        while (p1 != null && p2 != null) {
            if (p1.getValue() != p2.getValue()) {
                return false;
            }
            p1 = p1.getNext();
            p2 = p2.getNext();
        }
        if (p2 != null) {
            return false;
        }
        return true;
    }

    public static boolean listInList(Node<Integer> listA, Node<Integer> listB) {
        Node<Integer> p1 = listA;
        while (p1 != null) {
            if (listInListOrder(p1, listB)) {
                return true;
            }
            p1 = p1.getNext();
        }
        return false;
    }

    public static Node<Integer> getPrevious(Node<Integer> list, Node<Integer> p) {
        Node<Integer> p1 = list;
        while (p1.getNext() != p) {
            p1 = p1.getNext();
        }
        return p1;
    }

    public static boolean palindrome(Node<Integer> list) {
        Node<Integer> p1 = list;
        Node<Integer> p2 = getPrevious(list, null);
        while (p1 != p2 && p1.getNext() != p2) {
            if (p1.getValue() != p2.getValue()) {
                return false;
            }
            p1 = p1.getNext();
            p2 = getPrevious(list, p2);
        }
        return true;
    }

    public static int NumSum(Node<Integer> lst) {
        Node<Integer> p = lst;
        if (p == null) {
            return 0;
        }
        return p.getValue() + NumSum(p.getNext());
    }

    public static int EvenNum(Node<Integer> lst) {
        Node<Integer> p = lst;
        if (p == null) {
            return 0;
        } else if (p.getValue() % 2 == 0) {
            return 1 + EvenNum(p.getNext());
        }
        return EvenNum(p.getNext());
    }

    public static Node<Integer> FlipList(Node<Integer> lst) {
        Node<Integer> p = lst;
        Node<Integer> h = new Node<Integer>(p.getValue());
        p = p.getNext();
        while (p != null) {
            h = new Node<Integer>(p.getValue(), h);
            p = p.getNext();
        }
        return h;
    }

    public static Node<Integer> cyclicMove(Node<Integer> lst) {
        Node<Integer> last = getPrevious(lst, null);
        Node<Integer> result = new Node<Integer>(last.getValue());
        result = result.getNext();
        Node<Integer> p = lst;
        while (p.getNext() != null) {
            result.setNext(new Node<>(p.getValue()));
            p = p.getNext();
            result = result.getNext();
        }
        return result;
    }

    public static int listLength(Node<Integer> lst) {
        int num = 0;
        Node<Integer> p = lst;
        while (p != null) {
            num++;
            p = p.getNext();
        }
        return num;
    }

    public static boolean equalLists(Node<Integer> lstA, Node<Integer> lstB) {
        Node<Integer> p = lstA;
        Node<Integer> p1 = lstB;
        while (p != null) {
            if (p.getValue() != p1.getValue()) {
                return false;
            }
            p = p.getNext();
            p1 = p1.getNext();
        }
        return true;
    }

    public static boolean equalCyclicLists(Node<Integer> lstA, Node<Integer> lstB) {
        Node<Integer> p = lstA;
        Node<Integer> p1 = lstB;
        int num = listLength(p);
        for (int i = 0; i < num; i++) {
            boolean equal = equalLists(p1, p);
            System.out.println(equal);
            System.out.println("l: " + p);
            System.out.println("l2: " + p1);
            if (equal) {
                return true;
            }
            p1 = cyclicMove(p1);
        }
        return false;
    }

    public static Node<Integer> buildNum(int num) {
        Node<Integer> build = new Node<Integer>(null);
        while (num > 10) {
            int x = num % 10;
            build.setValue(x);
            build = build.getNext();
            num /= 10;
        }
        build.setValue(num);
        build = build.getNext();
        build.setValue(-9);
        return build;
    }

    public static Node<Integer> buildDigits(Node<Integer> l1) {
        Node<Integer> p1 = l1;
        Node<Integer> l2 = new Node<Integer>(-1);
        Node<Integer> p2 = l2;
        while (p1 != null) {
            int a = p1.getValue();
            while (a > 0) {
                int x = a % 10;
                p2.setNext(new Node<Integer>(x));
                p2 = p2.getNext();
                a = a / 10;
            }
            p2.setNext(new Node<Integer>(-9));
            p2 = p2.getNext();
            p1 = p1.getNext();
        }
        return l2.getNext();
    }

    public static void outOfBounds(Node<TwoItems> lst)
    {
        Node<TwoItems> p;
        boolean ok;
        TwoItems x;
        for (int i = 1; i =< 100; i ++) 
        {
            p = lst;
            ok = true;
            while (p != null) 
            {
                x = p.getValue();
                if (i >= x.getNumA() && i <= x.getNumB()) 
                {
                    ok = false;
                }
            }
            if (ok) 
            {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 10, 20, 41, 30 };
        Node<Integer> l = buildList(a);
        Node<Integer> l2 = cyclicMove(l);
        System.out.println(equalCyclicLists(l, l2));
    }
}
