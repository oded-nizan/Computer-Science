@SuppressWarnings({"Convert2Diamond", "unused", "ForLoopReplaceableByForEach"})
public class Main {
    public static void Input(Stack<Integer> s,int[] arr)
    {
        for(int i = 0; i < arr.length; i ++)
        {
            s.push(arr[i]);
        }
    }

    public static void Output(Stack<Integer> s)
    {

        Stack<Integer> tempS = new Stack<Integer>();

        while(!s.isEmpty())
        {
            int x = s.pop();
            System.out.println(x);
            tempS.push(x);
        }

        while(!tempS.isEmpty())
        {
            s.push(tempS.pop());
        }
    }

    public static int getMax(Stack<Integer> s)
    {
        int l = s.pop();
        Stack<Integer> tempS = new Stack<Integer>();
        tempS.push(l);

        while(!s.isEmpty())
        {
            int x = s.pop();
            l = Math.max(l, x);
            tempS.push(x);
        }

        while(!tempS.isEmpty())
        {
            s.push(tempS.pop());
        }
        return l;
    }

    public static Stack<Integer> getStack(Stack<Integer> s)
    {
        Stack<Integer> tempS1 = new Stack<Integer>();
        Stack<Integer> tempS2 = new Stack<Integer>();

        while (!s.isEmpty())
        {
            tempS1.push(s.pop());
        }
        while (!tempS1.isEmpty())
        {
            int x = tempS1.pop();
            tempS2.push(x);
            s.push(x);
        }

        return tempS2;
    }

    public static void removeNumAll(Stack <Integer> s, int x)
    {
        Stack <Integer> temp = new Stack<Integer>();
        while (!s.isEmpty())
        {
            int a = s.pop();
            if (a != x)
            {
                temp.push(a);
            }
        }
        while (!temp.isEmpty())
        {
            s.push(temp.pop());
        }
    }

    public static void removeNumOnce(Stack <Integer> s, int x)
    {
        boolean ok = true;
        Stack <Integer> temp = new Stack<Integer>();
        while (!s.isEmpty())
        {
            int a = s.pop();
            if (a != x || !ok)
            {
                temp.push(a);
            }
            else
            {
                ok = false;
            }
        }
        while (!temp.isEmpty())
        {
            s.push(temp.pop());
        }
    }

    public static void sortStack(Stack<Integer> s)
    {
        Stack <Integer> temp = new Stack<Integer>();
        while (!s.isEmpty())
        {
            int max = getMax(s);
            temp.push(max);
            removeNumOnce(s, max);
        }
        while (!temp.isEmpty())
        {
            s.push(temp.pop());
        }
    }

    public static boolean sumInStack(Stack<Integer> s, int x)
    {
        int a, b;
        Stack<Integer> temp1 = getStack(s);
        while (!temp1.isEmpty())
        {
            a = temp1.pop();
            Stack<Integer> temp2 = getStack(s);
            removeNumOnce(temp2, a);
            while (!temp2.isEmpty())
            {
                b = temp2.pop();
                if (a+b == x)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static int lastNum(Stack<Integer> s)
    {
        int x;
        Stack<Integer> temp = new Stack<Integer>();
        while(!s.isEmpty())
        {
            temp.push(s.pop());
        }
        x = temp.pop();
        while (!temp.isEmpty())
        {
            s.push(temp.pop());
        }
        return x;
    }

    public static Stack<Integer> sumOpposites(Stack<Integer> s)
    {
        int a,b;
        Stack<Integer> temp = new Stack<>();
        while (!s.isEmpty())
        {
            a = s.pop();
            b = lastNum(s);
            temp.push(a+b);
        }
        return temp;
    }

    public static boolean canYouSum(Stack<Integer> s, int x)
    {
        Stack<Integer> temp = getStack(s);
        int sum = 0;
        int a;

        while (!temp.isEmpty())
        {
            a = temp.pop();
            sum += a;

            if (x == sum)
            {
                return true;
            }
        }
        return false;
    }

    public static boolean isThereSum(Stack<Integer> s)
    {
        int x;
        while (!s.isEmpty())
        {
            x = s.pop();

            if (canYouSum(s, x))
            {
                return true;
            }
        }
        return false;
    }

    public static boolean sumBeforeNum(Stack<Integer> s)
    {
        Stack<Integer> temp1 = getStack(s);
        Stack<Integer> temp2 = getStack(s);
        int sum = 0;
        int a, x;
        temp2.pop();

        while (!temp1.isEmpty())
        {
            a = temp1.pop();
            sum += a;
            x = temp2.pop();
            if (sum == x)
            {
                return true;
            }
        }
        return false;
    }



    public static void main(String[] args)
    {
        Stack<Integer> s1 = new Stack<Integer> ();
        int[] arr = new int[]{1, 13, 58, 17, 2, 15, 34};
        Input(s1, arr);
        Output(s1);
        System.out.println("---------------------");
        System.out.println(isThereSum(s1));
    }
}