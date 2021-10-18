package homework7.task3;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "animal")
public class Animal {
    int weight;
    int age;
    String name;

    public Animal() {
    }

    public Animal(int weight, int age, String name) {
        this.weight = weight;
        this.age = age;
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
