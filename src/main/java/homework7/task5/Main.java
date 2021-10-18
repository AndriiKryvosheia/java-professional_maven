package homework7.task5;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {
    public static void main(String[] args) {

        Adress adress = new Adress("Украина", "Киев", "Крещатик");

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        String gsonString = gson.toJson(adress);

        String path = "src/main/resources/homework7/gsonAdress.json";

        try {
            Files.write(Paths.get(path),
                    gsonString.getBytes(), StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }


        ObjectMapper objectMapper = new ObjectMapper();
        Adress adress1 = null;
        try {
            adress1 = objectMapper.readValue(new File(path), Adress.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(adress1);
    }


}
