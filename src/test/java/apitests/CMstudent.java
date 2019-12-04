package apitests;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CMstudent {



    @Test
    public void studentList(){

       Response response = RestAssured.get("http://api.cybertektraining.com/student/all");
        System.out.println(response.statusCode());
        //Assert.assertEquals(response.statusCode(), 200);
        //RestAssured.given().get("http://api.cybertektraining.com/student/all").then().statusCode(200);
        System.out.println(response.asString());

        JsonPath jsonPath = response.jsonPath();



    }
    @Test
    public void singleStudent(){

        Response response = RestAssured.get("http://api.cybertektraining.com/student/57001");
        System.out.println(response.statusCode());
        System.out.println(response.asString());
        JsonPath jp = response.jsonPath();

        int b = jp.get("students[0].batch");
        System.out.println(b);
        String name = jp.get("students[0].firstName");
        System.out.println(name);
        String email = jp.get("students[0].contact.emailAddress");
        System.out.println(email);
        String street = jp.get("students[0].company.address.street");
        System.out.println(street);

    }
    @Test
    public void singleTeacher(){

        Response response = RestAssured.get("http://api.cybertektraining.com/teacher/22842");
        System.out.println(response.asString());

    }

}
