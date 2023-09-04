public class MyDate
{
    private int day;
    private int month;
    private int year;

    private final int[] RegularYearMonth = {-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private final int[] LeapYearMonth = {-1, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public MyDate(int year, int month, int day)
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
                return this.day >= 1 && this.day <= this.LeapYearMonth[this.month];
            }
            else
            {
                return this.day >= 1 && this.day <= this.RegularYearMonth[this.month];
            }
        }
        return false;
    }

    public boolean isLeap()
    {
        return this.year % 4 == 0 && this.year % 100 != 0 || this.year % 400 == 0;
    }

    private boolean isLeapInput(int year)
    {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public int dif()
    {
        int days = 0;
        for (int i = 1800; i < this.year; i ++)
        {
            if (isLeapInput(i))
            {
                days = days + 366;
            }
            else
            {
                days = days + 365;
            }
        }

        for (int i = 1; i < this.month; i ++)
        {
            if (isLeap())
            {
                days = days + this.LeapYearMonth[i];
            }
            else
            {
                days = days + this.RegularYearMonth[i];
            }
        }
        days = days + this.day - 1;
        return days;
    }

    public int diffDates(MyDate d2)
    {
        int d1Days;
        int d2Days;
        d1Days = this.dif();
        d2Days = d2.dif();
        return Math.abs(d1Days - d2Days);
    }

    public int Compare(MyDate d2)
    {
        int d1Days;
        int d2Days;
        d1Days = this.dif();
        d2Days = d2.dif();
        return Integer.compare(d1Days, d2Days);
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
