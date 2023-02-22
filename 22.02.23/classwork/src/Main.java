public class Main
{


    public static void printHouseArray(House[] arrH)
    {
        for (int i = 0; i < arrH.length; i++)
        {
            System.out.println(arrH[i].toString());
        }
    }

    public static int housesInArea(House[] arrH, int areaCode)
    {
        int m = 0;
        for (int i = 0; i < arrH.length; i++)
        {
            if (arrH[i].getAreaCode() == areaCode)
            {
                m++;
            }
        }
        return m;
    }

    public static double squareFootageAverage(House[] arrH, int areaCode)
    {
        int sum = 0;
        int avg;
        int m = housesInArea(arrH, areaCode);
        for (int i = 0; i < arrH.length; i++)
        {
            if (arrH[i].getAreaCode() == areaCode)
            {
                sum += arrH[i].getHouseSquareFootage();
            }
        }
        avg = sum / m;
        return avg;
    }

    public static int highestSquareFootageAverage (House[] arrH)
    {
        int max = 0;
        int a;
        for (int i = 0; i < arrH.length; i++)
        {
            a = (int)squareFootageAverage(arrH, i);
            max = Math.max(a, max);
        }
        return max;
    }

    public static void main(String[] args)
    {

        House h1 = new House("Roy", 5, 900, 3);

        System.out.println(h1.getLandlordName());
        System.out.println(h1.getAreaCode());
        System.out.println(h1.getHouseSquareFootage());
        System.out.println(h1.getTenants());

        h1.setLandlordName("Roe");
        h1.setAreaCode(2);
        h1.setHouseSquareFootage(10000);
        h1.setTenants(5);

        System.out.println("Your property tax is  "  + h1.propertyTax());
        System.out.println("Your house's density is : " + h1.density());

        House[] arrH = new House[4];
        arrH[0] = new House("Roy1", 1, 70, 2);
        arrH[1] = new House("Roy2", 2, 80, 3);
        arrH[2] = new House("Roy3", 3, 90, 4);
        arrH[3] = new House("Roy4", 4, 100, 5);

        printHouseArray(arrH);

        System.out.println(squareFootageAverage(arrH, 1));

        System.out.println(highestSquareFootageAverage(arrH));
    }
}