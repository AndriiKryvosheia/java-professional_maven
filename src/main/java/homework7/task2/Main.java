package homework7.task2;

import java.io.*;

class Main {
    public static void main(String[] args) {
        Car car = new Car("Ford", 12000);
        File f = new File("src/main/resources/homework7/serialization.txt");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(f));
             ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(f))) {

            outputStream.writeObject(car);

            Car serCar = (Car) inputStream.readObject();
            serCar.setModel("Ford_ser");

            System.out.println(car);
            System.out.println(serCar);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
