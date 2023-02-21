package com.classwork;

import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, b, n=0, x, y, z;

        System.out.println("Enter your thing:");
        a=input.nextInt();
        System.out.println("Enter your thingy:");
        b=input.nextInt();
        if(a>b){
            y=a;
            z=b;
        }
        else {
            y=b;
            z=a;
        }
        a = z;
        b = y;

        while(b>1){
            x=b/a;
            if(x*a == b){
                b/=a;
                n++;
            }
            else{
                b=0;
            }
        }
        if(b==0)
            System.out.println("NOOOOOO");
        else if(b==1)
            System.out.println("YESSSSSS " +n);
        else
            System.out.println("THERE WERE STUPID BAD NUMBARS GIVEN TO ME");
    }
}