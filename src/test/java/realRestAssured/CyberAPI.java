package realRestAssured;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import models.Teacher;
import org.junit.Assert;
import org.junit.Test;
import utilities.APIrunner;

import java.io.IOException;

public class CyberAPI {

    @Test
    public void getTeachersTest() throws IOException {

        Response response = RestAssured.get("http://api.cybertektraining.com/teacher/all");
        System.out.println(response.statusCode());
        System.out.println(response.asString());
        /*
        Challenge: read 4 attributes from the response and for each and every object
        JsonPath: writing the syntax of the path to preferred attribute in the response.
        This design is not preferred. Because it will be hardcoded and dependent from the object structure.
        We are going to use POJO model.
        POJO approach is most fit for API automation.
        IDEA: converting the JSON response into Basic Java object and have an access to it's fields/attributes/properties.
        We aslo use Jackson library to map from json to object(deserialization) or object to json(serialization).
         */

        ObjectMapper mapper = new ObjectMapper();
        GeneralResponse gr = mapper.readValue(response.asString(), GeneralResponse.class);
        System.out.println(gr.getTeachers().size());

        for(GeneralTeacher teacher: gr.getTeachers()){
            System.out.println(teacher.getFirstName()+"\n");
            Assert.assertTrue(teacher.getFirstName() != null);
            Assert.assertTrue(teacher.getLastName() != null);
            Assert.assertTrue(teacher.getEmailAddress() != null);
            Assert.assertTrue(teacher.getSubject() != null);
        }

    }
    @Test
    public void t2(){
        APIrunner.runGET("http://api.cybertektraining.com/teacher/all");
        System.out.println(APIrunner.getCustomResponse().getTeachers().size());
    }
    @Test
    public void createInstructor(){

        GeneralTeacher teacher = new GeneralTeacher();
        Faker faker = new Faker();

        teacher.setFirstName(faker.name().firstName());
        teacher.setLastName(faker.name().lastName());
        teacher.setGender("Male");
        teacher.setEmailAddress(faker.internet().emailAddress());
        teacher.setDepartment("Maths");
        teacher.setBatch(11);
        teacher.setBirthDate("12/12/1987");
        teacher.setJoinDate("12/12/2019");
        teacher.setPassword("1231");
        teacher.setPhone("1231231212");
        teacher.setPremanentAddress(faker.address().streetAddress());
        teacher.setSalary(100000000);
        teacher.setSection("SOme");
        teacher.setSubject("Intro to some class");

        String url = "http://api.cybertektraining.com/teacher/create";
        Response response = RestAssured.given().contentType(ContentType.JSON)
                .body(teacher).when().post(url);

        System.out.println(response.statusCode());
        System.out.println(response.asString());

    }

}
