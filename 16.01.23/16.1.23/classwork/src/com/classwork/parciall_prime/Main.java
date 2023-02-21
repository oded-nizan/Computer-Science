package com.classwork.parciall_prime;

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

    public static void main(String[] args) {
        int[] a = new int[]{1, 5, 11, 7, 13, 2};
        System.out.println(is_gcd_partial(a, 10010));
        System.out.println("roni"+a+"roni");
    }
}