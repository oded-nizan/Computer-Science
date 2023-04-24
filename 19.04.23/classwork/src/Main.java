import java.util.Scanner;

public class Main
{

    static final Scanner scanner = new Scanner(System.in);

    public static Person[] inputPersonArr(int j)
    {
        Person[] PersonArr = new Person[j];
        for (int i = 0; i < PersonArr.length; i ++)
        {
            System.out.println("Enter Person name : ");
            String name = scanner.nextLine();
            System.out.println("Enter Person birth year : ");
            int year = scanner.nextInt();
            System.out.println("Enter Person birth month : ");
            int month = scanner.nextInt();
            System.out.println("Enter Person birth day : ");
            int day = scanner.nextInt();

            Person x = new Person(name, year, month, day);
            PersonArr[i] = x;
        }
       return PersonArr;
    }

    public static String oldestPerson(Person[] personArr)
    {
        String oldestName;
        int oldestIndex = 0;
        for (int i = 0; i < personArr.length  ; i ++)
        {
            Date x = personArr[oldestIndex].getBirthDate();
            Date y = personArr[i].getBirthDate();
            if (x.Compare(y) == 1)
            {
                oldestIndex = i;
            }
        }
        oldestName = personArr[oldestIndex].getName();
        return oldestName;
    }
    public static void main(String[] args)
    {
        Date d1 = new Date(2008, 9, 1);
        Person p1 = new Person("Roy", d1);
        Person p2 = new Person("Oded", 2008, 3, 27);
        Person p3 = new Person("Yoav", 2008, 2, 15);

        Person[] people = new Person[]{p1, p2, p3};
        System.out.println(oldestPerson(people));
    }
}