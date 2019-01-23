package com.company;

import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        int summ = 0;
        int max_i = 10;
        // Сумму всех чисел  от 1 до 10
        for (int i = 0; i <= max_i; i++) {
            summ += i;
        }
        System.out.println(summ);

        Scanner scanner = new Scanner(System.in);
        int number;
        int l = 0;
        // вычитаем и суммы от 1 до 9 чесел всего 9 штук
        while (l < max_i-1)
        {
            number = scanner.nextInt();
            summ = summ - number;
            System.out.println("l= " + l + "; summ = " + summ);

            l++;
        }
        System.out.println(summ);
    }

    }


