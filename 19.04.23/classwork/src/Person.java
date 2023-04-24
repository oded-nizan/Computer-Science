public class Person
{
    private String name;
    private Date birthDate;

    public Person(String name, int year, int month, int day)
    {
        Date x = new Date(year, month, day);
        this.setName(name);
        this.setBirthDate(x);
    }

    public Person(String name, Date birthDate)
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

    public Date getBirthDate()
    {
        return this.birthDate;
    }

   public void setBirthDate(Date birthDate)
   {
       this.birthDate = birthDate;
   }

    public String toString()
    {
        String toString = "The name of this person is : " + this.name + "\n";
        toString = toString + "The birth date of this person is : " + this.birthDate.toString();
        return toString;
    }
}
