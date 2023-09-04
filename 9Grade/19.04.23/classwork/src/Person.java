public class Person
{
    private int id;
    private MyDate birthDate;

    public Person(int id, int year, int month, int day)
    {
        MyDate x = new MyDate(year, month, day);
        this.setId(id);
        this.setBirthDate(x);
    }

    public int getYear()
    {
        return this.birthDate.getYear();
    }

    public int getMonth()
    {
        return this.birthDate.getMonth();
    }

    public int getDay()
    {
        return this.birthDate.getDay();
    }

    public Person(int id, MyDate birthDate)
    {
        this.setId(id);
        this.setBirthDate(birthDate);
    }

    public int getId()
    {
        return this.id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public MyDate getBirthDate()
    {
        return this.birthDate;
    }

   public void setBirthDate(MyDate birthDate)
   {
       this.birthDate = birthDate;
   }

   public int compare(Person p1)
   {
       return this.getBirthDate().Compare(p1.getBirthDate());
   }

    public String toString()
    {
        String toString = "The name of this person is : " + this.id + "\n";
        toString = toString + "The birth date of this person is : " + this.birthDate.toString();
        return toString;
    }
}
