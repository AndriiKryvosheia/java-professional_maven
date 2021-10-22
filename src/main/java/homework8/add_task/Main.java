package homework8.add_task;

public class Main {
    int i;
    private static Main instMain = new Main();

    public static Main getInstance() {
        return instMain;
    }

    public static void main(String[] args) {

        Thread threadA = new Thread(new ClassA(), "threadA");
        Thread threadB = new Thread(new ClassB(), "threadB");

        threadA.start();
        threadB.start();
    }

    public synchronized void printMethod(Thread thread, String methodName, String fieldValue) {
        i++;
        System.out.println(i + "    " + thread.getName() + ": " + methodName + ", " + fieldValue);

        try {
            wait(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
