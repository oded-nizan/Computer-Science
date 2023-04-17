public class Classroom
{
    private String name;
    private Student[] arrStu;
    private int stuNum;

    public Classroom(String name, int size)
    {
        this.setName(name);
        this.initArrStu(size);
        this.stuNum = 0;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Student[] getArrStu()
    {
        return this.arrStu;
    }

    public void setArrStu(Student[] arrStu)
    {
        this.arrStu = arrStu;
    }

    public void initArrStu(int size)
    {
        this.arrStu = new Student[size];
    }

    public void arrStuAdd(String name, int grade1, int grade2)
    {
        Student add = new Student(name, grade1, grade2);
        arrStu[stuNum] = add;
        stuNum ++;
    }

    public String toString()
    {
        StringBuilder toString = new StringBuilder("The name of this class is : " + this.getName() + "\n");
        for (int i = 0; i < stuNum; i ++)
        {
            toString.append(this.getArrStu()[i].toString());
        }
        return toString.toString();
    }
}