package homework9.add_task;

public class Main {
    public static void main(String[] args) {

        System.out.println("Основной поток, getName(): " + Thread.currentThread().getName());
        System.out.println("Основной поток, isDaemon(): " + Thread.currentThread().isDaemon());
        System.out.println();

        ClassA instA = new ClassA();
        instA.setDaemon(true);
        instA.start();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nОсновной поток: завершилось выполнение");
    }
}
