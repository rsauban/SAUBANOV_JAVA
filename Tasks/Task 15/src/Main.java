public class Main {
   static int n = 6;
   static  int array [] = new int[n];
   static int first = 0;


    public static void InsertLast(int [] array, int ins) {
        if (first < n) {array[first] = ins; first ++;}
    }

    public static void InsertFist(int [] array, int insFirst) {
        if (first + 1 <= n) {
            for (int i = first; 0 <= i; i--)
                {
                    array[i + 1] = array[i];
                }
            array[0] = insFirst;
            first++;
        } else {
            System.out.println("выход за длинну массива");
            return;

        }
    }


    public static void DeleteOnIndex(int [] array, int index) {

        if (index < 0 || index > first) return;
        for (int i = index; i < first; i++) array[i] = array[i+1];
        first --;
    }


    public static void InsertOnIndex(int [] array, int index, int num) {
        if (index < 0 || index > first) return;
        for (int i = first; index <= i; i--) array[i+1] = array[i];
        array[index] = num;
        first++;




    }

    public static void Print(int [] array) {
        for (int i = 0; i < first; i++) System.out.println(array[i]);

    }


    public static void main(String[] args) {
        InsertLast(array, -3);
        InsertLast(array,4);
        InsertLast(array,5);
        Print(array);

        System.out.println("***InsertFist 1****");

        InsertFist(array, 1 );
        Print(array);



        System.out.println("***DeleteOnIndex 0 ****");
        DeleteOnIndex(array, 0);
        Print(array);


        System.out.println("***InsertOnIndex 3****");
        InsertOnIndex( array,  3,  2);
        Print(array);




    }

}
