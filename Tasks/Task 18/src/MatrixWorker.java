import java.util.Scanner;

public class MatrixWorker {

    public static final int MaxSize = 3;


    public void initMatrix(int matrix[][]) {

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
               matrix[i][j] = scanner.nextInt();
            }

        }


    }

    public void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public int[][] sum(int a[][], int b[][]) {
        int c[][] = new int[MaxSize][MaxSize];
        for (int i = 0; i < MaxSize; i++) {
            for (int j = 0; j < MaxSize; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    public int[][] mult(int a[][], int b[][]) {
        int c[][] = new int[MaxSize][MaxSize];
        for (int i = 0; i < MaxSize; i++) {
            for (int j = 0; j < MaxSize; j++) {
                c[i][j] += a[i][j] * b[j][i];
            }
        }
        return c;
    }
}