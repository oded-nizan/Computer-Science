package com.classwork.prime_and_partiall;

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

    public static boolean is_gcd_partial(int[] a, int x){
        int s;
        for (int i : a) {
            for (int k : a) {
                s = k * i;
                if (is_prime(k) && is_prime(i) && s == x) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean is_gcd(int[] a, int x){
        int s = 1;
        for (int j : a){
            s *= j;
            if (!(is_prime(j))){
                return false;
            }
        }
        return s == x;
    }

    public static boolean is_gcd_and_partial(int[] a, int[] b){
        int m = 0, z = 0;
        for (int j : a) {
            if (is_gcd(b, j)) {
                m++;
            }
            if (is_gcd_partial(b, j)) {
                z++;
            }
        }
        if (m+z == a.length && m == 1){
            return true;
        }
        return false;
    }



    public static void main(String[] args) {
        int[] a = new int[]{1, 5, 11, 7, 13, 2};
        int[] b = new int[]{3, 5, 2, 11};
        System.out.println(is_gcd_and_partial(a, b));
    }
}