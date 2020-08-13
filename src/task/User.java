package task;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    @JsonProperty("_id")
    private String id;
    public People[] name;
    /*@JsonProperty("first")
    public String firstName;
    @JsonProperty("last")
    public String lastName;*/

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name=" + Arrays.toString(name) +
                '}';
    }
}
