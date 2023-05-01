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

    public static int oldestPersonPlace(Person[] personArr)
    {
        int oldestIndex = 0;
        for (int i = 0; i < personArr.length  ; i ++)
        {
            if (personArr[i].compare(personArr[oldestIndex]) == -1)
            {
                oldestIndex = i;
            }
        }
        return oldestIndex;
    }

    public static int youngestPersonPlace(Person[] personArr)
    {
        int youngestIndex = 0;
        for (int i = 0; i < personArr.length  ; i ++)
        {
            if (personArr[i].compare(personArr[youngestIndex]) == 1)
            {
                youngestIndex = i;
            }
        }
        return youngestIndex;
    }

    public static int oldestPersonPlaceByIndex(Person[] personArr, int p1, int p2)
    {
        int oldestIndex = 0;
        for (int i = p1; i < p2  ; i ++)
        {
            if (personArr[i].compare(personArr[oldestIndex]) == -1)
            {
                oldestIndex = i;
            }
        }
        return oldestIndex;
    }

    public static int youngestPersonPlaceByIndex(Person[] personArr, int p1, int p2)
    {
        int youngestIndex = 0;
        for (int i = p1; i < p2  ; i ++)
        {
            if (personArr[i].compare(personArr[youngestIndex]) == 1)
            {
                youngestIndex = i;
            }
        }
        return youngestIndex;
    }

    public static int placeInRange(Person[] personArr, int p1, int p2, int k)
    {
        int index = -1;
        if (k == 1)
        {
            index = youngestPersonPlaceByIndex(personArr, p1, p2);
        }
        else if (k == 2)
        {
            index = oldestPersonPlaceByIndex(personArr, p1, p2);
        }
        return index;
    }

    public static String oldestPersonName(Person[] personArr)
    {
        int oldestIndex = 0;
        for (int i = 0; i < personArr.length  ; i ++)
        {
            if (personArr[i].compare(personArr[oldestIndex]) == -1)
            {
                oldestIndex = i;
            }
        }
        return personArr[oldestIndex].getName();
    }

    public static void Swap(Person[] personArr, int p1, int p2)
    {
        Person PH = personArr[p1];
        personArr[p1] = personArr[p2];
        personArr[p2] = PH;
    }
    public static void main(String[] args)
    {
        MyDate d1 = new MyDate(2008, 9, 1);
        Person p1 = new Person("Roy", d1);
        Person p2 = new Person("Oded", 2008, 3, 27);
        Person p3 = new Person("Yoav", 2008, 2, 15);
        Person p4 = new Person("Yuval", 2008, 10, 20);
        Person p5 = new Person("Ilay", 2008, 2, 11);
        Person p6 = new Person("Yos", 1986, 5, 5);
        Person p7 = new Person("Dos", 2095, 7, 20);
        Person p8 = new Person("Ros", 1789, 2, 12);

        Person[] people = new Person[]{p1, p2, p3, p4, p5, p6, p7, p8};
        System.out.println(placeInRange(people, 2, 6, 1));
    }
}