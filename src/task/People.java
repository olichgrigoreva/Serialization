package task;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class People {
    @JsonProperty("first")
    public String firstName;
    @JsonProperty("last")
    public String lastName;

    @Override
    public String toString() {
        return " " + firstName + " " + lastName;
    }
}
