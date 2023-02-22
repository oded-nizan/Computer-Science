public class House {

    private String landlordName;
    private int areaCode;
    private int houseSquareFootage;
    private int tenants;

    public House(String landlordName, int areaCode, int houseSquareFootage, int tenants)
    {
        this.landlordName = landlordName;
        this.areaCode = areaCode;
        this.houseSquareFootage = houseSquareFootage;
        this.tenants = tenants;
    }

    public String getLandlordName()
    {
        return this.landlordName;
    }

    public int getAreaCode()
    {
        return this.areaCode;
    }

    public int getHouseSquareFootage()
    {
        return this.houseSquareFootage;
    }

    public int getTenants()
    {
        return this.tenants;
    }

    public void setLandlordName(String landlordName)
    {
        this.landlordName = landlordName;
    }

    public void setAreaCode(int areaCode)
    {
        if (areaCode > 0 && areaCode < 6)
        {
            this.areaCode = areaCode;
        }
    }

    public void setHouseSquareFootage(int houseSquareFootage)
    {
        this.houseSquareFootage = houseSquareFootage;
    }

    public void setTenants(int tenants)
    {
        this.tenants = tenants;
    }

    public int propertyTax()
    {
        return this.houseSquareFootage * this.areaCode * 50;
    }

    public double density()
    {
        //noinspection IntegerDivisionInFloatingPointContext
        return this.houseSquareFootage / this.tenants;
    }

    public String toString()
    {
        String toString = "The name of the landlord is : " + this.landlordName + "\n";
        toString = toString +  "The area code is : " + this.areaCode + "\n";
        toString = toString + "The house square footage is : " + this.houseSquareFootage + "\n";
        toString = toString + "The number pf tenants in the house is : " + this.tenants + "\n";
        return toString;
    }
}
