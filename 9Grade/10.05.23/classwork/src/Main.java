public class Main
{

    public static void separate(String str)
    {
        String  str1 = "", str2 = "";
        for (int i = 0; i < str.length(); i ++)
        {
            if ((int)str.charAt(i) < 97)
            {
                str1 = str1 + str.charAt(i);
            }
            else
            {
                str2 = str2 + str.charAt(i);
            }
        }
        System.out.println(str + "  " + str1 + "  " + str2);
    }

    public static boolean nonCapital(String str)
    {
        for (int i = 0; i < str.length(); i ++)
        {
            if (str.charAt(i) < 97)
            {
                return false;
            }
        }
        return false;
    }

    public static boolean isPalindrom(String str)
    {
        for (int i = 0; i < str.length(); i ++)
        {
            if (str.charAt(i) != str.charAt(str.length()-(i+1)))
            {
                return false;
            }
        }
        return true;
    }

    public static boolean contains(String str1, String str2)
    {
        return str1.contains(str2);
    }

    public static int numContains(String str1, String str2)
    {
        int m = 0;
        while(str1.contains(str2))
        {
            m ++;
            str1 = str1.replaceFirst(str2, "");
        }
        return m;
    }

    public static boolean once(String str)
    {
        char x = str.charAt(0);
        for (int i = 1; i < str.length(); i ++)
        {
            if (str.charAt(i) == x)
            {
                return false;
            }
        }
        return true;
    }

    public static boolean different(String str)
    {
        for (int i = 0; i < str.length(); i ++)
        {
            for (int j = 0; j < str.length(); j ++)
            {
                if (i != j && str.charAt(i) == str.charAt(j))
                {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args)
    {
        separate("AbCdeFgR");
        System.out.println(nonCapital("abdD"));
        System.out.println(isPalindrom("AbcbA"));
        System.out.println(contains("abcdefg", "abc"));
        System.out.println(once("abcea"));
        System.out.println(different("fsdjak"));
        System.out.println(numContains("abcabcabcabc", "abc"));
    }
}