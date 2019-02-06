package com.company;

public class MainProc {

    public static int localMax (int [] array) {
        int max = 0;
        for (int i = 0; i < array.length-2; i ++) {
            if (array[i] < array[i+1] && array[i+1] > array[i+2]) max++;
        }
        return max;

    }



    public static void main(String[] args) {
	// Локальный максимум
        int array[] = {2, 5, 1, -3, 0, 8, 3};
        System.out.println("Count local maximums = " + localMax(array));



    }
}
