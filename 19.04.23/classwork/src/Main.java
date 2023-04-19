public class Main
{
    public static void main(String[] args)
    {
        Date d1 = new Date(1984, 11, 5);
        if (d1.legalDate())
        {
            System.out.println(d1.toString());
        }
    }
}