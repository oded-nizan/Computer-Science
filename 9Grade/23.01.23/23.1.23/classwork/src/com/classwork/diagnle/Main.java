package com.classwork.diagnle;

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

    public static void diagnle(int[][] a){
        for (int i = 0; i < a.length; i ++){
            System.out.println(a[i][i]);
        }
    }

    public static void diagnle_2(int[][] a){
        for (int i = a.length - 1; i >= 0; i --){
            System.out.println(a[i][i]);
        }
    }


    public static void main(String[] args) {
        int[][] a = new int[5][5];
        input2D_random(a);
        print2Darray(a);
        System.out.println();
        diagnle(a);
        System.out.println();
        diagnle_2(a);
    }
}
