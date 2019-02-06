package com.company;

public class MainProc {

    public static void revers(int array[]) {
        int temp = 0;
        int length = array.length;
        for (int i = 0; i < length/2; i++){
            temp = array[i];
            array[i] = array[length-1-i];
            array[length-1-i] = temp;
        }


    }

    public static void printarray(int [] array) {
        for (int i = 0; i < array.length; i++) System.out.println(array[i]);
    }


    public static void main(String[] args) {
        int array[] = {3, 4, 5, 6, 7};
        revers(array);
        printarray(array);





    }



}
