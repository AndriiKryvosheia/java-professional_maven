package homework8.add_task;

public class ClassA implements Runnable {
    String a1;
    String a2;

    public ClassA() {
        this.a1 = "a1";
        this.a2 = "a2";
    }

    public String getA1() {
        return a1;
    }

    public String getA2() {
        return a2;
    }

    @Override
    public void run() {
        Main.getInstance().printMethod(Thread.currentThread(), "getA1", getA1());
//        try {
//            Thread.sleep(10);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        Main.getInstance().printMethod(Thread.currentThread(), "getA2", getA2());
//        try {
//            Thread.sleep(10);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
