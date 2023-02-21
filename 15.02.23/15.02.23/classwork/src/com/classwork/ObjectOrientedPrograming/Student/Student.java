package com.classwork.ObjectOrientedPrograming.Student;

public class Student
{

    private String name;
    private int grA;
    private int grB;

    public Student(String name, int grA, int grB)
    {
        this.name = name;
        this.grA = grA;
        this.grB = grB;
    }

    public int get_grA()
    {
        return this.grA;
    }

    public int get_grB()
    {
        return this.grB;
    }

    public String get_name()
    {
        return this.name;
    }

    public void set_grA(int a){
        if (a >= 0 && a <= 100){
            this.grA = a;
        }
    }

    public void set_grB(int a){
        if (a >= 0 && a <= 100){
            this.grB = a;
        }
    }

    public void set_name(String a){
        this.name = a;
    }

    public int averageGrade()
    {
        return (this.grA + this.grB) / 2;
    }

    public void bonus_grA(int bonus){
        if (this.grA + bonus >= 100){
            this.grA = 100;
        }
        else {
            this.grA += bonus;
        }
    }

    public void bonus_grB(int bonus){
        if (this.grB + bonus >= 100){
            this.grB = 100;
        }
        else {
            this.grB += bonus;
        }
    }

    public boolean passing(){
        return this.grA >= 55 && this.grB >= 55;
    }

    public int higher_grade(){
        return Math.max(this.grA, this.grB);
    }

    public String toString()
    {
        return this.name + " " + this.grA + " " + this.grB;
    }

}
