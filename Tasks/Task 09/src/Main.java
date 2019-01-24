import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char arrayChar [] = scanner.nextLine().toCharArray();
        int numberInt = 0;
        for (int i = 0; i < arrayChar.length; i++){
            // число = цифра1 * (10 в степени позиция цифры) +  цифра2 *  ...
            numberInt = (int) ((arrayChar[i] - '0')*pow(10, arrayChar.length-i-1) + numberInt);
                 }
       System.out.println("int x == " + numberInt);


    }


}
