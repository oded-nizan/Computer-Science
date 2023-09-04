package com.classwork.sort_rows;

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

    public static int sum_row(int[][] a, int x){
        int m = 0;
        for (int i = 0; i < a[x].length; i++){
            m += a[x][i];
        }
        return m;
    }

    public static void switch_rows(int[][] a, int x, int y){
        int z;
        for (int i = 0; i < a[x].length; i++){
            z = a[x][i];
            a[x][i] = a[y][i];
            a[y][i] = z;
        }
    }

    public static void sort_rows(int[][] a){
        int m = 1, c, b;
        while (m != 0){
            m = 0;
            for (int i = 0; i < a.length - 1; i ++){
                b = sum_row(a, i);
                c = sum_row(a, i+1);
                if (b > c){
                    switch_rows(a, i, i+1);
                    m++;
                }
            }
        }
    }



    public static void main(String[] args) {
        int[][] a = new int[3][3];
        input2D_random(a);
        print2Darray(a);
        System.out.println();
        sort_rows(a);
        print2Darray(a);
    }
}
