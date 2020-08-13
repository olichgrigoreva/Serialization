package task;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    public People name;

    @Override
    public String toString() {
        return "\n" + "Animal owner: " + name;
    }
}
