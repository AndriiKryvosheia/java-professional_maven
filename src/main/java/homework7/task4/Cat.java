package homework7.task4;

import jakarta.xml.bind.annotation.XmlElement;

public class Cat {
    String name;
    int age;
    String breed;
    int weight;

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public void setAge(int age) {
        this.age = age;
    }

    @XmlElement
    public void setBreed(String breed) {
        this.breed = breed;
    }

    @XmlElement
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", weight=" + weight +
                '}';
    }
}
