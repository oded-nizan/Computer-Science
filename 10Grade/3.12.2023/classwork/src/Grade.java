public class Grade
{
    private int codeSub;
    private int grade;

    public Grade(int codeSub, int grade)
    {
        this.codeSub = codeSub;
        this.grade = grade;
    }

    public int getCodeSub()
    {
        return codeSub;
    }

    public int getGrade()
    {
        return grade;
    }

    public void setCodeSub(int codeSub)
    {
        this.codeSub = codeSub;
    }

    public void setGrade(int grade)
    {
        this.grade = grade;
    }

    public void bonus(int bonus)
    {
        int grade = (int) (this.grade * bonus/100 + this.grade);
        if (grade > 100)
        {
            this.grade = 100;
        }
        else
        {
            this.grade = grade;
        }
    }

    public String toString()
    {
        String x = "The code sub is " + codeSub + " and the grade is " + grade + ".";
        return x;
    }
}
