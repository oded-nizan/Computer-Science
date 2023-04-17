public class Student
{
    private String name;
    private int grade1;
    private int grade2;

    public Student(String name, int grade1, int grade2)
    {
        this.setName(name);
        this.setGrade1(grade1);
        this.setGrade2(grade2);
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getGrade1()
    {
        return this.grade1;
    }

    public void setGrade1(int grade1)
    {
        this.grade1 = grade1;
    }

    public int getGrade2()
    {
        return this.grade2;
    }

    public void setGrade2(int grade2)
    {
        this.grade2 = grade2;
    }

    public int getAvg()
    {
        int sum = this.getGrade1() + this.getGrade2();
        int avg = sum / 2;
        return avg;
    }

    public String toString()
    {
        String toString = "The name of the student is : " + this.getName() + "\n";
        toString = toString + "The first grade of this student is : " + this.getGrade1() + "\n";
        toString = toString + "The second grade of this student is : " + this.getGrade2() + "\n";
        return toString;
    }
}