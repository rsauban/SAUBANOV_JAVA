package com.company;

import java.util.Scanner;

public class MainPrimeAnalyze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int candidate = scanner.nextInt();

        if (candidate == 1) {
            System.out.println("Not prime");
            return;
        }
        if (candidate == 2 || candidate == 3) {
            System.out.println("Is prime");
            return;
        }

        int divider = 2;

        while (divider * divider <= candidate) {
            System.out.println("For divider = " + divider);
            if (candidate % divider == 0) {
                System.out.println("Not prime");
                return;
            }
            System.out.println("Bad divider");
            divider++;
        }

    }
}
