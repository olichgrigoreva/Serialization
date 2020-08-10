package lesson;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Cat {
    public String name;
    public int age;
    public int weight;

    public Cat() {
    }

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
