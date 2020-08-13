package task;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class MainApp {
    public static void main(String[] args) {
        try {
            URL jsonURL = new URL("https://cat-fact.herokuapp.com/facts");
            ObjectMapper objectMapper = new ObjectMapper();

            Response response = objectMapper.readValue(jsonURL, Response.class);
            System.out.println(response.all.length);

            for (Cat cat : response.all) {
                System.out.printf("%s %s %s %s %n", cat.getId(), cat.fact, cat.type, cat.user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
