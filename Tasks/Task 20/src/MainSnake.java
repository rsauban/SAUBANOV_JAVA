public class MainSnake {
    public static final int MaxSize = 6;
    public static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void snakeMatrix(int matrix[][]){
        int l = 1;
        // Заполняем по периметру
        // верх слева на право
        for (int s = 0; s <MaxSize-2; s++) {
            for (int i = s; i < matrix.length - s; i++) {
                matrix[s][i] = l;
                l++;

            }
            for (int i = s+1; i < matrix.length - s; i++) {
                matrix[i][MaxSize - 1 - s] = l;
                l++;
            }
            for (int i = MaxSize - 2 - s; 0 < i - s; i--) {
                matrix[MaxSize - 1 - s][i] = l;
                l++;
            }
            for (int i = MaxSize - 1 - s; 0 < i - s; i--) {
                matrix[i][s] = l;
                l++;

            }
        }







    }

    public static void main(String[] args) {
    int a[][] = new int[MaxSize][MaxSize];
    snakeMatrix(a);
    printMatrix(a);
    }
}
