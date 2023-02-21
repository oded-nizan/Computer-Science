package com.classwork.more_evens;

import java.util.*;
class Main {
    public static int even_digits(int w) {
        int s=0;
        while(w>0){
            int x=w%10;
            if(x%2==0){
                s++;
            }
            w/=10;
        }
        return s;
    }

    public static void main(String [] args){

        Scanner benmosh=new Scanner(System.in);

        for(int i=1; i<=10;i++){
            System.out.println("Enter numbers: ");
            int a=benmosh.nextInt();
            System.out.println("Enter numbers: ");
            int b=benmosh.nextInt();
            int sa=even_digits(a);
            int sb=even_digits(b);
            if(sa>sb){
                System.out.println("the number with more even digits is: "+a+" and it has "+sa+" even digits");
            }
            else if(sa==sb){
                System.out.println("the numbers have the same amount of even digits: "+sa+" even digits");
            }

            else{
                System.out.println("the number with more even digits is: "+b+" and it has "+sb+" even digits");
            }
        }
    }
}