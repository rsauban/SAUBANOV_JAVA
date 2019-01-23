public class Main {
    public static void main(String[] args) {
        // Сортировка выбором
        int array[] = {9, 5, 3, 4, 7, 2, 8, 1, 6};
        int min, min_i = 0;

        for (int j = 0; j < array.length; j++) {
              // минимальным становится крайний левый
              min = array[j];

            for (int i = j+1; i < array.length; i++) {
                if (min > array[i]) {
                    min = array[i];
                    min_i = i;
                }

            }
            // обмен минимального
                min = array[j];
                array[j] = array[min_i];
                array[min_i] = min;

        }
        for (int j = 0; j < array.length; j++) System.out.println(array[j]);

    }
}