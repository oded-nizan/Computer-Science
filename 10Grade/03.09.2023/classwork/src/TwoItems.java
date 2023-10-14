public class TwoItems
{
    private int numA;
    private int numB;

    public TwoItems(int numA,int numB)
    {
        this.numA=numA;
        this.numB=numB;
    }
    public int getNumA()
    {
        return this.numA;
    }
    public int getNumB()
    {
        return this.numB;
    }
    public void setNumA(int numA )
    {
        this.numA = numA;
    }
    public void setNumB(int numB )
    {
        this.numB = numB;
    }
    public String toString()
    {
        return this.numA+" "+this.numB;
    }
}