package homework7.task3;

public class Eagle extends Animal {
    int height;

    public Eagle(int weight, int age, String name, int height) {
        super(weight, age, name);
        this.height = height;
    }

    public Eagle(Eagle other) {
        this(other.weight, other.age, other.name, other.height);
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "height=" + height +
                "} " + super.toString();
    }
}
