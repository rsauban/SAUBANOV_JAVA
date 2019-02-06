import java.util.Scanner;

public class MainFunc {
    public static int search(char strSearch[], char strSource[] ) {

        int searchIndex = -1;
        int j = 0;

        for (int i = 0; i < strSource.length; i++) {
            // берём первый элемент strSearch  ищем
            //вхождние его в текущей строке до первого вхождения подстроки
            if (strSearch[j] == strSource[i] && searchIndex == -1) {
                searchIndex = i;
                for (int k = 0; j + 1 + k < strSearch.length && searchIndex + 1 + k < strSource.length; k++)
                    if (strSearch[j + 1 + k] == strSource[searchIndex + 1 + k]) {
                        searchIndex = i;

                    } else searchIndex = -1;


            }

        }


    return searchIndex;

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char strSource[] = scanner.nextLine().toCharArray();
        char strSearch[] = scanner.nextLine().toCharArray();
        System.out.println(search(strSearch, strSource));


    }





}
