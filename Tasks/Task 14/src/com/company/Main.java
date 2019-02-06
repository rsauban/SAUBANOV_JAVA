package com.company;

import java.util.Scanner;

public class Main {

    public static double f(double x) {
        return x * x;
    }

    public static double integralByRectangles(double a, double b, int n) {
    // шаг
        double h = (b - a)/n;
        double result = 0;
        for (int i = 0; i < n; i++){
            result += f(a + h * (i + 0.5));


        }

       return  result * h;


    }

   public static double integralBySimpson(double a, double b, int n) {

       double h = (b - a)/n;
       double result = 0;
       for (int i = 1; i <= n; i+=2) {
       result += f(a + (i-1) * h) + 4 * f(a+i*h) + f(a+(i+1)*h);


       }

       return  result * h / 3;



   }



   public static double integralByTrapeze(double a, double b, int n) {
       double h = (b - a)/n;
       double result = 0;
       for (int i = 0; i < n ; i+=1) {
           result += (f(a + i * h) + f(a + (i + 1) * h))/2 * h;


       }

       return  result;








   }







    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        int n = scanner.nextInt();
        System.out.println(integralByRectangles(a, b, n));
        System.out.println(integralBySimpson(a, b, n));
        System.out.println(integralByTrapeze(a, b, n));
    }
}
