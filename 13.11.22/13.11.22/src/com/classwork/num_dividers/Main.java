package com.classwork.num_dividers;

class Main {
    public static int num_num(int w) {
        int s = 0;
        for (int i = 2; i < w; i++) {
            if (w % i == 0) {
                s++;
            }
        }
        return s;
    }

    public static void main(String [] args)
        {
        for(int i = 10; i<= 100; i++){
            int si=num_num(i);
            if(si==0){
                System.out.println(i);
            }
        }
    }
}

