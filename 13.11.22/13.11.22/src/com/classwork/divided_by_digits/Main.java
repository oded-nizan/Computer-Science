package com.classwork.divided_by_digits;

class Main {
    public static int num_num(int w) {
        int s=1;
        int o=w%10;
        w/=10;
        while(w>0){
            int x=w%10;
            if(x==o){
                s++;
            }
            w/=10;
        }
        return s;
    }

    public static void main(String [] args){

        int m=0;
        for(int i=100; i<=1000;i++){

            int si=num_num(i);
            if(si>1){
                m++;
                System.out.println(i+"-"+si+" "+m);
            }
        }
    }
}