package com.classwork.days_between;

public class Main {

    public static int days_between(int[] w, int x, int y, int a, int b){
        int s = 0;
        s += w[y-1] - x;
        for (int i = y; i < b-1; i++){
            s += w[i];
        }
        s += a;
        return s;
    }

    public static void main(String[] args) {
        int[] a = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println(days_between(a, 5, 3, 7, 12));
    }
}
