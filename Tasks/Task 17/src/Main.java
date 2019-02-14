import java.util.Random;

public class Main {
    public static final int MaxSize = 6;


        public static void main(String[] args) {

            Random random = new Random();

            int matrix[][] = new int[MaxSize][];



            for(int i = 0; i < matrix.length; i++){
                matrix[i] = new int[random.nextInt(10) + 1];
            }
            for(int i = 0; i < matrix.length; i++){
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = random.nextInt(10);
                }
            }

            for(int i = 0; i < matrix.length; i++){
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

    }
}
