package lesson.internet;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee {
    public int id;
    @JsonProperty("employee_name")
    public String name;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                '}';
    }
}
