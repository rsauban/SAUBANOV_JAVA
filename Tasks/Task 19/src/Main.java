import javafx.scene.transform.MatrixType;

import java.util.Scanner;

public class Main {
    public static final int MaxSize = 3;

    public static void initMatrix(int matrix[][]) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }

        }
    }

    public static void inversMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i < j)
                {
                    matrix[i][j]= matrix[i][j]*2;
                } else if (i > j)
                    matrix[i][j]= matrix[i][j]/2;


            }

        }
    }

    public static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

    int matrix[][] = new int[MaxSize][MaxSize];
      initMatrix(matrix);
      inversMatrix(matrix);
      printMatrix(matrix);

    }
}
