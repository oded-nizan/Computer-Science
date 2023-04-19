public class Main
{
    public static void main(String[] args)
    {
        Date d1 = new Date(2023, 4, 19);
        Date d2 = new Date(1985, 11, 19);
        if (d1.legalDate())
        {
            System.out.println(d1.toString());
        }
        if (d2.legalDate())
        {
            System.out.println(d2.toString());
        }
        System.out.println("Days since the start of the year 1800 until this date " + d1.dif());
        System.out.println("Days since the start of the year 1800 until this date " + d2.dif());
        System.out.println(d1.Compare(d2));
        System.out.println("The differance between these two dates is : " + d1.diffDates(d2));
    }
}