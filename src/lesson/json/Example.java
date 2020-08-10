package lesson.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;

public class Example {
    public static void main(String[] args) throws Exception{
        Cat cat = new Cat();
        cat.name = "pushok";
        cat.age = 3;
        cat.weight = 4;

        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println(objectMapper.writeValueAsString(cat));

        cat = new Cat();
        cat.weight = 5;
        cat.age = 1;
        System.out.println(objectMapper.writeValueAsString(cat));
    }
}
