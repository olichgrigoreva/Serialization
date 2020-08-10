package lesson.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.StringReader;

public class DeserializationExample {
    public static void main(String[] args) throws IOException {
        String json = "{\"name\":\"pushok\",\"age\":3,\"weight\":4}";
        //если есть дополнительное поле
        String json2 = "{\"name\":\"pushok\",\"age\":3,\"weight\":4,\"color\":\"gray\"}";
        ObjectMapper objectMapper = new ObjectMapper();
        //используются дженерики. что мапим и куда
        Cat cat = objectMapper.readValue(new StringReader(json), Cat.class);
        System.out.println(cat);
    }
}
