package com.company;

public class Main {

    public static void main(String[] args) {
	// Локальный максимум
        int max = 0;
         int array[] = {2, 5, 1, -3, 0, 8, 3};
         for (int i = 0; i < array.length-2; i ++) {
             if (array[i] < array[i+1] && array[i+1] > array[i+2]) max++;
         }
        System.out.println("Count local maximums = " + max);



    }
}
