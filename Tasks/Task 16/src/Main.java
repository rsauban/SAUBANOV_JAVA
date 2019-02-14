public class Main {
    public static void main(String[] args) {
    ArrayList list = new ArrayList();
    System.out.println("**** Добавление в конец 1,2,3,4,5 *****");
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.print();
    System.out.println("**** Добавление в начало 6,7,8,9 *****");
    list.addToBegin(6);
    list.addToBegin(7);
    list.addToBegin(8);
    list.addToBegin(9);
    list.print();
    list.insert(0,5);
    System.out.println("**** Вставка 0 в 5 позицию *****");
    list.print();
    list.sort();
    System.out.println("**** Отсартированный список *****");
    list.print();
    list.reverse();
    System.out.println("**** Список наоборот *****");
    list.print();
    if (list.contains(11)) System.out.println("11 - содержится в списке его индекс "+list.indexOf(11));
    else System.out.println("11 - НЕ содержится в списке его индекс "+list.indexOf(11));
    }
}
