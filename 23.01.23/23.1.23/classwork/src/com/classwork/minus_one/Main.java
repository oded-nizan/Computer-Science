package com.classwork.minus_one;

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

    public static void minus_one(int[][] a){
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length - 1; j++) {
                if (a[i][j] < a[i][j+1]){
                    a[i][j] = -1;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] a = new int[4][5];
        input2D_random(a);
        print2Darray(a);
        minus_one(a);
        print2Darray(a);
    }
}