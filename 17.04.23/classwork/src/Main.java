import java.util.Scanner;

public class Main
{

    static final Scanner scanner = new Scanner(System.in);

    public static String[] inputNames()
    {
        System.out.println("Enter number of names: ");
        int i = scanner.nextInt();
        String[] arrNames = new String[i];
        for (int j = 0; j <= i; j++)
        {
            System.out.println("Enter student name: ");
            String name = scanner.nextLine();
            arrNames[j] = name;
        }
        return arrNames;
    }

    public static int[] inputGrades()
    {
        System.out.println("Enter number of Grades(double names: ");
        int i = scanner.nextInt();
        int[] arrGrades = new int[i];
        for (int j = 0; j <= i; j++)
        {
            System.out.println("Enter student grade: ");
            int grade = scanner.nextInt();
            arrGrades[j] = grade;
        }
        return arrGrades;
    }

    public static void fillClassroom(Classroom c, String[] arrNames, int[] arrGrades)
    {
        for (int i = 0; i < arrNames.length; i ++)
        {
            c.arrStuAdd(arrNames[i], arrGrades[i*2], arrGrades[i*2 + 1]);
        }
    }

    public static void main(String[] args)
    {
        String[] arrNames = {"yos", "Dos", "Mos"};
        int[] arrGrades = {12, 23, 34, 45, 56, 67};
        Classroom c1 = new Classroom("T4", 10);
        fillClassroom(c1, arrNames, arrGrades);
        System.out.println(c1.toString());

        System.out.println(c1.bestStudent());
        c1.remove("yos");
        System.out.println(c1.toString());
    }
}