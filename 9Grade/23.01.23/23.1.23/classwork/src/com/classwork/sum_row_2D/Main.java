package com.classwork.sum_row_2D;

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

    public static void sum_row2Darray(int[][] a){
        int m = 0;
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++) {
                m += a[i][j];
            }
            System.out.println(m);
            m = 0;
        }
    }

    public static int largest_row_sum_2D(int[][] a){
        int m = 0, max = 0, z = 0;
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++) {
                m += a[i][j];
                if (m > max){
                    z = i;
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
        sum_row2Darray(a);
        System.out.println(largest_row_sum_2D(a));
    }
}
