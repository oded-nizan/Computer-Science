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

    public static int largest(Stack<Integer> s)
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




    public static void main(String[] args)
    {
        Stack<Integer> s1 = new Stack<Integer> ();
        int[] arr = new int[]{1, 13, 58, 1, 17, 2, 15, 1};
        Input(s1, arr);
        Output(s1);
        System.out.println("---------------------");
        removeNumOnce(s1, 1);
        Output(s1);
        System.out.println("---------------------");
        removeNumAll(s1, 1);
        Output(s1);
    }
}