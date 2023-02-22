public class Sniper {

    private int id;
    private int code;
    private int shootsFired;
    private int shootsOnTarget;

    public Sniper(int id, int code, int shootsFired, int shootsOnTarget)
    {
        this.id = id;
        this.code = code;
        this.shootsFired = shootsFired;
        this.shootsOnTarget = shootsOnTarget;
    }

    public int getId()
    {
        return this.id;
    }

    public int getCode()
    {
        return this.code;
    }

    public int getShootsFired()
    {
        return this.shootsFired;
    }

    public int getShootsOnTarget()
    {
        return this.shootsOnTarget;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setCode(int code)
    {
        this.code = code;
    }

    public void  setShootsFired(int shootsFired)
    {
        this.shootsFired = shootsFired;
    }

    public void setShootsOnTarget(int shootsOnTarget)
    {
        this.shootsOnTarget = shootsOnTarget;
    }

    public int percentHit()
    {
        return this.shootsOnTarget * 100 / shootsFired;
    }


    public String toString()
    {
        String toString = "The sniper's id is : " + this.id + "\n";
        toString = toString + "The sniper's code is : " + this.code + "\n";
        toString = toString + "The amount of shots the Sniper fired is : " + shootsFired + "\n";
        toString = toString + "The amount of shots the Sniper hit is : " + shootsOnTarget + "\n";
        return toString;
    }
}
