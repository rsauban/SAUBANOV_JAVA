import java.util.Random;

public class Program {
    private String name;

    public Program(){
        Random random = new Random();
        this.name = "Программа " + random.nextInt();
    }

    public void show(){
        System.out.println(this.name);
    }



}


