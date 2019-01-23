package com.company;

import java.util.Scanner;

public class MainSimpleSequence {

    public static void  main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int evenNumbersCount = 0;
        int oddNumbersCount = 0;
        int currentNumber = scanner.nextInt();

        while (currentNumber != -1) {
            if (currentNumber % 2 == 0) {
                evenNumbersCount++;
            } else {
                oddNumbersCount++;
            }
            currentNumber = scanner.nextInt();


        }
        System.out.println("Odd number Count = " + oddNumbersCount);
        System.out.println("Even number Count = " + evenNumbersCount);

    }
}
