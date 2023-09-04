package com.classwork.same_but_colums1;

public class Main {
    public static void input2D_random(int[][] a){
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++) {
                int x = (int)(Math.random() * 9 + 1);
                a[i][j] = x;
            }
        }
    }

    public static void print2Darray(int[][] a){
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void sum_colum2Darray(int[][] a){
        int m = 0;
        for (int i = 0; i < a[0].length; i++){
            for (int j = 0; j < a.length; j++) {
                m += a[j][i];
            }
            System.out.println(m);
            m = 0;
        }
    }

    public static int largest_colum_sum_2D(int[][] a){
        int m = 0, max = 0, z = 0;
        for (int i = 0; i < a[0].length; i++){
            for (int j = 0; j < a.length; j++) {
                m += a[j][i];
                if (m > max){
                    z = j;
                }
                max = Math.max(max, m);
            }
            m = 0;
        }
        return z;
    }



    public static void main(String[] args) {
        int[][] a = new int[4][5];
        input2D_random(a);
        print2Darray(a);
        sum_colum2Darray(a);
        System.out.println(largest_colum_sum_2D(a));
    }
}