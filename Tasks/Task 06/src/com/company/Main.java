package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int array[] = {3, 4, 5, 6, 7};
        int temp = 0;
        int length = array.length;
        for (int i = 0; i < length/2; i++){
            temp = array[i];
            array[i] = array[length-1-i];
            array[length-1-i] = temp;
        }

        for (int i = 0; i < length; i++) System.out.println(array[i]);


    }
}
