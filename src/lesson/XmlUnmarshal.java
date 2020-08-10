package lesson;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

public class XmlUnmarshal {
    public static void main(String[] args) throws Exception{
        JAXBContext context = JAXBContext.newInstance(Cat.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>" +
                "<cat>" +
                "<name>murka</name>" +
                "<age>10</age>" +
                "<weight>4</weight>" +
                "</cat>";

        //Object object = unmarshaller.unmarshal(new StringReader(xml));
        Cat cat = (Cat) unmarshaller.unmarshal(new StringReader(xml));
        System.out.println(cat);
        System.out.println(cat.name);
    }
}
