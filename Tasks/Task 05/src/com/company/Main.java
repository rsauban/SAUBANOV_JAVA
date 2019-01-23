package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int array[] = {3, -4, 5, 6, 2, 1};
        int min = array[0], max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }
            System.out.println("min = " + min + " max = " + max);


    }
}