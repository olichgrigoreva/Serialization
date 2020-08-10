package lesson;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="car", namespace = "http://cars.zz.yyy")
public class Car {

    private String color;
    public int wheelSize;
    public String model;

    public Car() {

    }

    public Car(String color, int wheelSize, String model) {
        this.color = color;
        this.wheelSize = wheelSize;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", wheelSize=" + wheelSize +
                ", model='" + model + '\'' +
                '}';
    }

    @XmlElement(name = "color")
    public String getColor() {
        return color;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public String getModel() {
        return model;
    }
}
