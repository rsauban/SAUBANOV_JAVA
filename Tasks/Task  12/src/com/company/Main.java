package com.company;

public class Main {

    static  int n = 11;

    static  int cache[] = new int[n];

    public static int fibo(int n) {

        if (cache[n] == 0) {
            if (n == 1 || n == 2) {
                cache[n] = 1;

            } else {
                cache[n] = fibo(n - 1) + fibo(n - 2);
            }


        }

        return cache[n];
    }

    public static void main(String[] args) {
	// write your code here

        System.out.println(fibo(10));

    }
}

