package test;

import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

public class JsonMapping {

   @Test
    public void convertJSONbodyToObject(){

        String jsonBody = "{\n" +
                "        \t\t\"name\": \"John\",\n" +
                "        \t\t\"batch\": 17,\n" +
                "        \t\t\"subject\": \"Intro to Java\"\n" +
                "        \t}";

        String companyJson = "  {\n" +
                "                \"company\": \"Goolge\",\n" +
                "                \"title\": \"Automation\",\n" +
                "                \"address\":[\n" +
                "                    {\n" +
                "                        \"street\":\"13 N. Main st\",\n" +
                "                        \"city\": \"Chicago\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"street\":\"123 N. Main st\",\n" +
                "                        \"city\": \"Chicago\"\n" +
                "                    }\n" +
                "                    \n" +
                "                ]\n" +
                "            }";

       ObjectMapper mapper = new ObjectMapper();

       try{
//           Teacher teacher = mapper.readValue(jsonBody, Teacher.class);
//           System.out.println(teacher.getName());
           Company company = mapper.readValue(companyJson, Company.class);

           System.out.println(company.getAddress().get(0).getStreet());

       }catch (IOException e){
           e.printStackTrace();
       }

   }

}
