package com.classwork.prime;

public class Main {

    public static boolean is_prime(int x){
        x = Math.abs(x);
        for (int i = 2; i < x; i++){
            if (x%i == 0){
                return false;
            }
        }
        for (int i = 2; i < x; i++){
            if (x%i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean is_gcd(int[] a, int x){
        int s = 1;
        for (int j : a){
            s *= j;
            if (!(is_prime(j))){
                return false;
            }
        }
        if (s != x) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 5, 11, 7, 13, 2};
        System.out.println(is_gcd(a, 10010));
    }
}