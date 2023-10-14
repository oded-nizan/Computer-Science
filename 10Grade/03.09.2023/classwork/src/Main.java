
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


    public static int firstTimesInRow(Stack<Integer> s, int a)
    {
        int num = 0, x;
        while (!s.isEmpty())
        {
            x = s.pop();
            if (x == a)
            {
                num ++;
            }
            else
            {
                s.push(x);
                return num;
            }
        }
        return num;
    }

    public static boolean strikes(Stack<Integer> s)
    {
        int a, b;
        a = firstTimesInRow(s, s.pop());
        while (!s.isEmpty())
        {
            b = firstTimesInRow(s, s.pop());
            if (b >= a)
            {
                return false;
            }
            a = b;


    public static void inputSt(Stack<TwoItems> st)
    {
        TwoItems x;
        x = new TwoItems(10, 15);
        st.push(x);
        x = new TwoItems(70, 73);
        st.push(x);
        x = new TwoItems(12, 30);
        st.push(x);
        x = new TwoItems(80, 95);
        st.push(x);
    }

    public static void OutputSt(Stack<TwoItems> st)
    {
        Stack<TwoItems> tempSt =new Stack<TwoItems>();

        while(!st.isEmpty())
        {
            TwoItems x = st.pop();
            tempSt.push(x);
            System.out.println(x.toString());
        }
        while (!tempSt.isEmpty())
        {
            st.push(tempSt.pop());
        }
    }

    public static Stack<TwoItems> getStackT(Stack<TwoItems> st)
    {
        Stack<TwoItems> tempSt1 = new Stack<TwoItems>();
        Stack<TwoItems> tempSt2 = new Stack<TwoItems>();
        TwoItems x;

        while (!st.isEmpty())
        {
            tempSt1.push(st.pop());
        }
        while (!tempSt1.isEmpty())
        {
            x = tempSt1.pop();
            tempSt2.push(x);
            st.push(x);
        }

        return tempSt2;
    }

    public static boolean notInRange(Stack<TwoItems> st, int x)
    {
        Stack<TwoItems> tempSt = getStackT(st);
        TwoItems s;
        while (!tempSt.isEmpty())
        {
            s = tempSt.pop();
            if (s.getNumA() <= x && x <= s.getNumB())
            {
                return false;
            }
        }
        return true;
    }



    public static Stack<Integer> fusion(Stack<Integer> s1, Stack<Integer> s2)
    {
        Stack<Integer> result = new Stack<Integer>();
        int a = 0, b = 0, sum = 0;
        while (!s1.isEmpty())
        {
            a += s1.pop();
            b = s2.pop();
            sum = a + b;
            if (sum < 10)
            {
                result.push(sum);
                a = 0;
            }
            else
            {
                sum -= 10;
                a = 1;
                result.push(sum);
            }

        }
        if (s2.isEmpty())
        {
            return result;
        }
        else
        {
            while (!s2.isEmpty())
            {
                a += s2.pop();
                sum = a;
                if (sum < 10)
                {
                    result.push(sum);
                    a = 0;
                }
                else
                {
                    sum -= 10;
                    result.push(sum);
                    a = 1;
                }
                result.push(s2.pop());
            }
        }
        return result;
    }


    public static void InputC(Stack<Character> s, char[] arr)
    {
        for(int i = 0; i < arr.length; i ++)
        {
            s.push(arr[i]);
        }
    }


    public static void OutputC(Stack<Character> s)
    {

        Stack<Character> tempS = new Stack<Character>();

        while(!s.isEmpty())
        {
            char x = s.pop();
            System.out.println(x);
            tempS.push(x);
        }

        while(!tempS.isEmpty())
        {
            s.push(tempS.pop());
        }
    }

    public static Stack<Character> largestChar(Stack<Character> s)
    {
        Stack<Character> s1 = new Stack<Character>();
        char n, max = s.pop();
        while (!s.isEmpty())
        {
            n = s.pop();
            while (n != '#' && !s.isEmpty())
            {
                if (n > max)
                {
                    max = n;
                }
                n = s.pop();
            }
            s1.push(max);
             max = 'a';
        }
        return s1;


    public static void printOutOfRange(Stack<TwoItems> st)
    {
        for (int i = 1; i < 101; i ++)
        {
            if (notInRange(st, i))
            {
                System.out.println(i);
            }
        }
    }


    public static Stack<TwoItems> strangeRanges(Stack<TwoItems> st)
    {
        Stack<TwoItems> sto = new Stack<TwoItems> ();
        boolean first = true;
        TwoItems x;
        int a = 0;
        for (int i = 1; i < 101; i ++)
        {
            if (notInRange(st, i))
            {
                if (first)
                {
                    a = i;
                    first = false;
                }
            }
            else
            {
                first = true;
                if (a >= 1)
                {
                    x = new TwoItems(a, i-1);
                    sto.push(x);
                    a = 0;
                }
            }
        }
        if (!first)
        {
            x = new TwoItems(a, 100);
            sto.push(x);
        }
        return sto;
    }


    public static void main(String[] args)
    {
        Stack<Character> s1 = new Stack<Character>();
        char[] arr = new char[]{'a', 't', '#', 'r', 'z', 'b', 'e', '#', 'm'};
        InputC(s1, arr);
        OutputC(s1);
        System.out.println("------------------");
        Stack<Character> s2 = largestChar(s1);
        OutputC(s2);
    }
}