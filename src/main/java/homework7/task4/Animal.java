package homework7.task4;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@XmlRootElement(name = "animal")
public class Animal {

    @XmlElement(name = "cat")
    private List<Cat> cats = new ArrayList<>();

    @Override
    public String toString() {
        return Arrays.deepToString(cats.toArray());
    }
}
