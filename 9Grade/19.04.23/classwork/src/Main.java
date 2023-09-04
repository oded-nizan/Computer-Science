import java.util.Random;

public class Main
{
    static final Random random = new Random();

    public static Person[] inputPersonArr(int j)
    {
        int id, day, month, year;
        Person[] PersonArr = new Person[j];
        for (int i = 0; i < PersonArr.length; i ++)
        {
            id =  random.nextInt(900000) + 100000;
            year = random.nextInt(71) + 1950;
            month = random.nextInt(12) + 1;
            day = random.nextInt(28) + 1;
            Person x = new Person(id, year, month, day);
            PersonArr[i] = x;
        }
       return PersonArr;
    }

    public static void printPeople(Person[] personArr)
    {
        for (Person person : personArr) {
            System.out.println(person.toString());
        }
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
        int oldestIndex = p1;
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
        int youngestIndex = p1;
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

    public static void Swap(Person[] personArr, int p1, int p2)
    {
        Person PH = personArr[p1];
        personArr[p1] = personArr[p2];
        personArr[p2] = PH;
    }

    public static void sortPeople(Person[] personArr)
    {
        int p1 = 0, p2 = personArr.length, pmin, pmax;

        while (p1 < p2)
        {
            pmin = youngestPersonPlaceByIndex(personArr, p1, p2);
            pmax = oldestPersonPlaceByIndex(personArr, p1, p2);
            Swap(personArr, p1, pmin);
            Swap(personArr, p2-1, pmax);
            p1++;
            p2--;
        }
    }

    public static int amountThisMonth(Person[] personArr, int k)
    {
        int amount = 0;
        for (int i = 0; i < personArr.length; i ++)
        {
            if (personArr[i].getMonth() == k)
            {
                amount ++;
            }
        }
        return amount;
    }

    public static void amountPerMonth(Person[] personArr)
    {
        int max = 0, current, index = 0;
        for (int i = 1; i < 13; i ++)
        {
            current = amountThisMonth(personArr, i);
            if (current > max)
            {
                max = current;
                index = i;
            }
            System.out.println("for the month " + i + " there are " + current + " people");
        }
        System.out.println("The month with the highest amount of people is : " + index);
    }
    public static void main(String[] args)
    {
        Person[] people = inputPersonArr(1000);
        amountPerMonth(people);
    }
}