package task;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Cat {
    @JsonProperty("_id")
    private String id;
    @JsonProperty("text")
    public String fact;
    public String type;

    public User user;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id='" + id + '\'' +
                ", fact='" + fact + '\'' +
                ", type='" + type + '\'' +
                ", user=" + user +
                '}';
    }
}
