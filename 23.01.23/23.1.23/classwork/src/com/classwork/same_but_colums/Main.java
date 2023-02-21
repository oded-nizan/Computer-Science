package com.classwork.same_but_colums;

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

    public static void minus_1(int[][] a){
        for (int i = 0; i < a[0].length - 1; i++){
            for (int j = 0; j < a.length; j++) {
                if (a[j][i] < a[j][i+1]){
                    a[j][i] = -1;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] a = new int[2][2];
        input2D_random(a);
        print2Darray(a);
        minus_1(a);
        print2Darray(a);
    }
}
