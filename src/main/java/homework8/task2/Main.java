package homework8.task2;

public class Main {
    public static void main(String[] args) {

        Thread main = new Thread(new SomeClass(), "main");
        Thread second = new Thread(new SomeClass(), "second");
        Thread first = new Thread(new SomeClass(), "first");

        main.start();
        second.start();
        first.start();

        boolean threadsAreAlive = true;
        while (threadsAreAlive) {
            threadsAreAlive = threadIsAlive(main) || threadIsAlive(second) || threadIsAlive(first);
        }
    }

    public static boolean threadIsAlive(Thread thread) {
        if (thread.isAlive()) {
            System.out.println("Работает поток " + thread.getName());
            return true;
        } else {
            System.out.println("Завершен поток " + thread.getName());
            return false;
        }
    }

}
