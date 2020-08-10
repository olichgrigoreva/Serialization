package lesson.internet;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URL;

public class Program {
    public static void main(String[] args) throws Exception{
        URL jsonUrl = new URL("http://dummy.restapiexample.com/api/v1/employees");
        ObjectMapper mapper = new ObjectMapper();
        Response response = mapper.readValue(jsonUrl, Response.class);
        System.out.println(response.data.length); //24 сотрудника, 24 массива data
        //вывод их id
        for (Employee employee : response.data){
            //System.out.print(employee.id + " ");
            System.out.printf("%d %s %n", employee.id, employee.name);
        }
    }
}
