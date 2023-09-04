package com.classwork;

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

    public boolean excellent()
    {
        if (this.percentHit() > 90)
        {
            return true;
        }
        return false;
    }

    public boolean shotMore(Sniper otherSniper)
    {
        if (this.getShootsFired() > otherSniper.getShootsFired())
        {
            return true;
        }
        return false;
    }

    public int higherAccuracy(Sniper otherSniper)
    {
        if (this.percentHit() > otherSniper.percentHit())
        {
            return 1;
        }
        else if(this.percentHit() == otherSniper.percentHit())
        {
            return 0;
        }
        return -1;
    }


    public String toString()
    {
        String toString = "The sniper's id is : " + this.id + "\n";
        toString = toString + "The sniper's code is : " + this.code + "\n";
        toString = toString + "The amount of shots the com.classwork.Sniper fired is : " + this.shootsFired + "\n";
        toString = toString + "The amount of shots the com.classwork.Sniper hit is : " + this.shootsOnTarget + "\n";
        toString = toString + "The sniper's percent hit is : " + this.percentHit() + "\n";
        return toString;
    }
}
