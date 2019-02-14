import com.sun.org.apache.bcel.internal.generic.NEW;

public class Main {

    public static void main(String[] args) {
        int a[][] = new int[MatrixWorker.MaxSize][MatrixWorker.MaxSize];
        int b[][] = new int[MatrixWorker.MaxSize][MatrixWorker.MaxSize];

        MatrixWorker matrixWorker = new MatrixWorker();
        System.out.println("****** Input matrix A ******");
        matrixWorker.initMatrix(a);
        System.out.println("****** Input matrix B ******");
        matrixWorker.initMatrix(b);
        System.out.println("******* SUMMA *******");
        matrixWorker.printMatrix(matrixWorker.sum(a,b));
        System.out.println("****** Multiplay ******");
        matrixWorker.printMatrix(matrixWorker.mult(a,b));

    }


}
