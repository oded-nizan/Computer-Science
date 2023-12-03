public class Student
{
    private String id;
    private String name;
    private Node<Grade> lstG;

    public Student(String id, String name)
    {
        this.id = id;
        this.name = name;
        this.lstG = null;
    }

    public Student(String id, String name, int codeSub, int grade)
    {
        this.id = id;
        this.name = name;
        Grade g = new Grade(codeSub, grade);
        this.lstG = new Node<Grade>(g);
    }

    public String getId()
    {
        return this.id;
    }

    public String getName()
    {
        return this.name;
    }

    public Node<Grade> getLstG()
    {
        return this.lstG;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setLstG(Node<Grade> lstG)
    {
        this.lstG = lstG;
    }

    public void addGrade(int codeSub, int grade)
    {
        Grade g = new Grade(codeSub, grade);
        this.lstG = new Node<Grade>(g, this.lstG);
    }

    public double getAverage()
    {
        int sum = 0, num = 0;
        Node<Grade> p = this.lstG;
        while (p!= null)
        {
            sum = sum + p.getValue().getGrade();
            num ++;
            p = p.getNext();
        }
        return (double) (sum / num);
    }

    public boolean isCodeSub(int codeSub)
    {
        Node<Grade> p = this.lstG;
        while (p!= null)
        {
            if (p.getValue().getCodeSub() == codeSub)
            {
                return true;
            }
            p = p.getNext();
        }
        return false;
    }

    public int gradeInSub(int codeSub)
    {
        Node<Grade> p = this.lstG;
        while (p!= null)
        {
            if (p.getValue().getCodeSub() == codeSub)
            {
                return p.getValue().getGrade();
            }
            p = p.getNext();
        }
        return -1;
    }

    public void removeSub(int codeSub)
    {
        Node<Grade> first = new Node<Grade>(null, this.lstG);
        Node<Grade> p = first;
        while (p.getNext() != null)
        {
            if (p.getNext().getValue().getCodeSub() == codeSub)
            {
                p.setNext(p.getNext().getNext());
            }
            else
            {
                p = p.getNext();
            }
        }
        this.lstG = first.getNext();
    }

    public boolean notFailing()
    {
        Node<Grade> p = this.lstG;
        while (p != null)
        {
            if (p.getValue().getGrade() < 55)
            {
                return false;
            }
            p = p.getNext();
        }
        return true;
    }

    public void bonusCodeSub(int codeSub, int bonus)
    {
        Node<Grade> p = this.lstG;
        boolean found = false;
        while (p != null && !found)
        {
            if (p.getValue().getCodeSub() == codeSub)
            {
                p.getValue().bonus(bonus);
            }
            p = p.getNext();
        }
    }

    public int highestGrade()
    {
        int max = 0;
        int result = -1;
        int temp;
        Node<Grade> p = this.lstG;
        while (p != null)
        {
            temp = p.getValue().getGrade();
            if (temp > max)
            {
                max = temp;
                result = p.getValue().getCodeSub();
            }
        }
        return result;
    }

    public String toString()
    {
        StringBuilder s = new StringBuilder("Student id is : " + this.id + "\n");
        s.append("Student name is : ").append(this.name).append("\n");
        Node<Grade> p = this.lstG;
        while (p != null)
        {
            s.append(p.getValue().toString()).append("\n");
            p = p.getNext();
        }
        return s.toString();
    }
}
