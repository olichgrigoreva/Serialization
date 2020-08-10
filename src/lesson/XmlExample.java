package lesson;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public class XmlExample {
    public static void main(String[] args) throws Exception {
        Car car = new Car("red", 19, "sedan");
        System.out.println(car.toString());
        JAXBContext context = JAXBContext.newInstance(Car.class);
        Marshaller marshaller = context.createMarshaller();
        StringWriter stringWriter = new StringWriter();
        marshaller.marshal(car, stringWriter);
        System.out.println(stringWriter.toString());
    }
}
