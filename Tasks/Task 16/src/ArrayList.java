public class ArrayList {
    // константа
    final int MAX_SIZE = 100;

    int lines[];
    int count;

    // конструктор
    public ArrayList() {
        this.lines = new int[MAX_SIZE];
        this.count = 0;
    }

    void add(int element) {

        if (count  < MAX_SIZE) {
            this.lines[count] = element;
            this.count++;
        } else {
            System.out.println("выход за длинну массива");
            return;

        }
    }

    void println() {
        for (int i = 0; i < count; i++) {
            System.out.println(this.lines[i]);
        }

    }

    void print() {
        for (int i = 0; i < count; i++) {
            System.out.print(this.lines[i]+", ");
        }
        System.out.println();
    }

    void addToBegin(int element){
        if (count + 1 <= MAX_SIZE) {
            for (int i = count; 0 <= i; i--)
            {
                this.lines[i + 1] = this.lines[i];
            }
            this.lines[0] = element;
            this.count++;
        } else {
            System.out.println("выход за длинну массива");
            return;

        }


    }

    int get(int index){
        if (index < 0 || index > count) { System.out.println("выход за длинну массива"); return -1;}
        else return lines[index];

    }

    void insert(int element, int index){
        if (index < 0 || index > count) { System.out.println("выход за длинну массива"); return;}
        for (int i = count; index <= i; i--) this.lines[i+1] = lines[i];
        this.lines[index] = element;
        count++;


    }

    void reverse(){
        int temp;
        for (int i = 0; i < count/2; i ++) {
            temp = lines[i];
            this.lines[i] = this.lines[count-i-1];
            this.lines[count-i-1] = temp;
        }


    }

    int getCount(){

        if (0 <= count && count  <= MAX_SIZE) return count;
        else {System.out.println("выход за длинну массива"); return -1;}


    }

    boolean contains(int element) {
        for (int i = 0; i <= count; i++) {
            if (lines[i] == element) return true;

        }
    return false;
    }

    int indexOf(int element) {
        for (int i = 0; i <= count; i++) {
            if (lines[i] == element) return i;

        }
        return -1;
    }

    void sort() {
        int tmp;
        for (int i = count-1; i > 0; i--) {
            for (int j = 0; j < i; j++)
            {
                if (lines[j] > lines[j + 1])
                {
                    tmp = lines[j];
                    lines[j] = lines[j+1];
                    lines[j+1] = tmp;
                }
            }

        }
    }

}