package homework7.task4;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class AnimalParser {

    public static void parse(File file) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Animal.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Animal animal = (Animal) unmarshaller.unmarshal(file);
            System.out.println(animal);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
