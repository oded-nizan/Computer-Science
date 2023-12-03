public class Class
{
    private String teacherName;
    private int classNumber;
    private Node<Student> lstS;

    public Class(String teacherName, int classNumber)
    {
        this.teacherName = teacherName;
        this .classNumber = classNumber;
        this.lstS = new Node<Student>(null);
    }

    public String getTeacherName()
    {
        return this.teacherName;
    }

    public int getClassNumber()
    {
        return this.classNumber;
    }

    public Node<Student> getStudents()
    {
        return this.lstS;
    }

    public void setTeacherName(String teacherName)
    {
        this.teacherName = teacherName;
    }

    public void setClassNumber(int classNumber)
    {
        this.classNumber = classNumber;
    }

    public void setStudents(Node<Student> lstS)
    {
        this.lstS = lstS;
    }

    public void addStudent(Student student)
    {
        this.lstS = new Node<Student>(student, lstS);
    }

    public String bestStudentName()
    {
        double max = 0;
        String result = "";
        double temp;
        Node<Student> p = this.lstS;
        while (p != null)
        {
            temp = p.getValue().getAverage();
            if (temp > max)
            {
                max = temp;
                result = p.getValue().getName();
            }
        }
        return result;
    }

    public String toString()
    {
        StringBuilder s = new StringBuilder("Name of the teacher is : " + this.teacherName + "\n");
        s.append("Number of students is : ").append(this.classNumber).append("\n");
        Node<Student> p = this.lstS;
        while (p != null)
        {
            s.append(p.getValue().toString());
            p = p.getNext();
        }
        return s.toString();
    }
}
