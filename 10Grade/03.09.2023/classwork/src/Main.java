public class Main {
    public static void Input(Stack<Integer> s)
    {
        for(int i = 0; i < 6; i ++)
        {
            int x = (int)(Math.random()*100+1);
            s.push(x);
        }
    }

    public static void Output(Stack<Integer> s)
    {

        Stack<Integer> tempS = new Stack<Integer>();

        while(s.isEmpty() == false)
        {
            int x = s.pop();
            System.out.println(x);
            tempS.push(x);
        }

        while(tempS.isEmpty() == false)
        {
            s.push(tempS.pop());
        }
    }

    public static int largest(Stack<Integer> s)
    {
        int l = s.pop();
        Stack<Integer> tempS = new Stack<Integer>();
        tempS.push(l);

        while(s.isEmpty() == false)
        {
            int x = s.pop();
            l = Math.max(l, x);
            tempS.push(x);
        }

        while(tempS.isEmpty() == false)
        {
            s.push(tempS.pop());
        }
        return l;
    }

    public static Stack<Integer> getStack(Stack<Integer> s)
    {
        Stack<Integer> tempS1 = new Stack<Integer>();
        Stack<Integer> tempS2 = new Stack<Integer>();

        while (s.isEmpty() == false)
        {
            tempS1.push(s.pop())
        }
        while (tempS1.isEmpty() == false)
        {
            int x = tempS1.pop();
            tempS2.push(x);
            s.push(x);
        }

        return tempS2;
    }


    public static void main(String[] args)
    {
        Stack<Integer> s1 = new Stack<Integer> ();
        Input(s1);
        Output(s1);
        System.out.println("---------------------");
        System.out.println(largest(s1));
        System.out.println("---------------------");
        Output(s1);
    }
}