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

    public String bestStudent()
    {
        int max = 0;
        int avg;
        String name = "";

        for (int i = 0; i < stuNum; i ++)
        {
            avg = this.arrStu[i].getAvg();
            if (avg > max)
            {
                max = avg;
                name = this.arrStu[i].getName();
            }
        }
        return name;
    }

    public int nameToPlace(String name)
    {
        for (int i = 0; i < stuNum; i ++)
        {
            if (this.arrStu[i].getName() == name)
            {
                return i;
            }
        }
        return -1;
    }

    public void remove(String name)
    {
        int place = nameToPlace(name);
        for (int i = place + 1; i < this.arrStu.length; i ++)
        {
            this.arrStu[i-1] = this.arrStu[i];
        }
        this.stuNum = this.stuNum - 1;
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