package homework8.task3;

public class Main {
    public static void main(String[] args) {

        Thread min = new Thread(new SomeClass(), "min");
        min.setPriority(1);
        Thread max = new Thread(new SomeClass(), "max");
        max.setPriority(10);
        Thread norm = new Thread(new SomeClass(), "norm");

        min.start();
        max.start();
        norm.start();
   }
}
