package homework7.task2;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Car implements Externalizable {
    private String model;
    private int price;
    static int quantity;

    public Car() {
    }

    public Car(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public Car(String model, int price, int quantity) {
        this.model = model;
        this.price = price;
        Car.quantity = quantity;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(model);
        out.writeInt(price);
        out.writeInt(quantity);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        model = (String) in.readObject();
        price = in.readInt();
        quantity = in.readInt();
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
