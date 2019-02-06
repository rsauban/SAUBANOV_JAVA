package com.company;

public class Main {
    public static int minimum(int array[]) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }

        }

        return min;
    }

    public static int maximum(int array[]) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {

            if (max < array[i]) {
                max = array[i];

            }
        }

        return max;
    }

    public static void main(String[] args) {
        // write your code here
        int array[] = {3, -4, 5, 6, 2, 1};
        System.out.println("min = " + minimum(array) + " max = " + maximum(array));


    }
}