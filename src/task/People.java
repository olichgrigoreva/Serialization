package task;

import com.fasterxml.jackson.annotation.JsonProperty;

public class People {
    @JsonProperty("first")
    public String firstName;
    @JsonProperty("last")
    public String lastName;

    @Override
    public String toString() {
        return "People{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
