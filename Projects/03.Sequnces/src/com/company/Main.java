package com.company;

import java.util.Scanner;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int currentDigit;

        // флаг для распечатки
        boolean flag = true;

        while (number != -1) {

            int digitsSum = 0;
            int multipliDigit = 1;

            // Разбиваем число ситаем сумму его wbah
            while (number != 0) {
                currentDigit = number % 10;

                // Перемножаем  входные цифры
                multipliDigit = multipliDigit * currentDigit;
                number = number / 10;
                digitsSum = digitsSum + currentDigit;
            }


            // Проверяем его на прос

            int candidate = digitsSum;


            if (candidate == 1) {

                flag = false;
                //return;
            } else {

                if (candidate == 2 || candidate == 3) {

                } else {

                    int divider = 2;

                    while (divider * divider <= candidate){


                        if (candidate % divider == 0) flag = false;
                        divider++;
                    }

                }


            }
            if (flag)
                System.out.println("multipliDigit = " + multipliDigit);
             else  out.println("Not prime");


            flag =true;
            number = scanner.nextInt();

        }

    }
}