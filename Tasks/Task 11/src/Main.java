import java.util.Scanner;
import static java.lang.Math.pow;



public class Main {
    public static void main(String[] args) {
        // Дихотомический поиск
        Scanner scanner = new Scanner(System.in);
        // отсортированный список
        char arraySortingChar[] = scanner.nextLine().toCharArray();
        int arraySortingInt[];
        arraySortingInt = new int[10];

        int numberInt = 0, k = 0;
        String tempString ="";
        boolean flag = false;
        // Удаляем пробелы и др разделители Переводим Char в Int, в водим его в массив

        // считываем всю строку по символьно
        for (int i = 0; i < arraySortingChar.length;  i++){
            // формируем строку из цифр разедитель пробел
            if (arraySortingChar[i] != ' '){
                    tempString = tempString + arraySortingChar[i];
                    flag = true;
                }
             else {

                for (int j = 0; j < tempString.length(); j++){
                    // строку переводим в число = цифра1 * (10 в степени позиция цифры) +  цифра2 *  ...
                    numberInt = (int) ((tempString.charAt(j) - '0')*pow(10, tempString.length()-j-1) + numberInt);
                }
                arraySortingInt[k] = numberInt;

                // новое число вбиваем
                tempString ="";
                numberInt=0;
                k++;
                flag = false;
            }


        }


        // Для последнего числа так последнее число кончается не \n
       if (flag)
            {
                for (int j = 0; j < tempString.length(); j++) {
                    // строку переводим в число = цифра1 * (10 в степени позиция цифры) +  цифра2 *  ...
                    numberInt = (int) ((tempString.charAt(j) - '0') * pow(10, tempString.length() - j - 1) + numberInt);
                }

                arraySortingInt[k] = numberInt;
            }

        for (int i = 0; i < arraySortingInt.length; i++) System.out.println(arraySortingInt[i]);




    }
}
