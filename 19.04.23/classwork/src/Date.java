public class Date
{
    private int day;
    private int month;
    private int year;

    private final int[] RegularYearMonth = {-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private final int[] LeapYearMonth = {-1, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date(int year, int month, int day)
    {
        this.setYear(year);
        this.setMonth(month);
        this.setDay(day);
    }

    public int getYear()
    {
        return this.year;
    }

    public void setYear(int year)
    {
        if (year >= 1800)
        {
            this.year = year;
        }
    }

    public int getMonth()
    {
        return this.month;
    }

    public void setMonth(int month)
    {
        if (month >= 1 && month <= 12)
        {
            this.month = month;
        }
    }

    public int getDay()
    {
        return this.day;
    }

    public void setDay(int day)
    {
        if (this.isLeap())
        {
            if (day >= 1 && day <= this.LeapYearMonth[this.month])
            {
                this.day = day;
            }
        }

        else
        {
            if (day >= 1 && day <= this.RegularYearMonth[this.month])
            {
                this.day = day;
            }
        }
    }

    public boolean legalDate()
    {
        if (this.year >= 1800 && this.month >= 1 && this.month <= 12)
        {
            if (this.isLeap())
            {
                if (this.day >= 1 && this.day <= this.LeapYearMonth[this.month])
                {
                    return true;
                }
                return false;
            }
            else
            {
                if (this.day >= 1 && this.day <= this.RegularYearMonth[this.month])
                {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isLeap()
    {
        if (this.year % 4 == 0 && this.year % 100 != 0 || this.year % 400 == 0)
        {
            return true;
        }
        return false;
    }

    public String toString()
    {
        String toString = "The year of the date is : " + this.year + "\n";
        toString = toString +  "The month of the date is : " + this.month + "\n";
        toString = toString +  "The day of the date is : " + this.day + "\n";
        if (this.isLeap())
        {
            toString = toString + "This year is a leap year" + "\n";
        }
        else
        {
            toString = toString + "This year is not a leap year" + "\n";
        }
        return toString;
    }
}
