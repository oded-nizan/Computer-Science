public class Person
{
    private String name;
    private MyDate birthDate;

    public Person(String name, int year, int month, int day)
    {
        MyDate x = new MyDate(year, month, day);
        this.setName(name);
        this.setBirthDate(x);
    }

    public Person(String name, MyDate birthDate)
    {
        this.setName(name);
        this.setBirthDate(birthDate);
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
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
        String toString = "The name of this person is : " + this.name + "\n";
        toString = toString + "The birth date of this person is : " + this.birthDate.toString();
        return toString;
    }
}
