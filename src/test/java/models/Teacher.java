package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)

public class Teacher {

    /*
    {
  "batch": 0,
  "birthDate": "12/12/2019",
  "department": "Maths",
  "emailAddress": "some@gmail.com",
  "firstName": "John",
  "gender": "male",
  "joinDate": "12/12/2019",
  "lastName": "string",
  "password": "string",
  "phone": "string",
  "premanentAddress": "string",
  "salary": 0,
  "section": "string",
  "subject": "string",
  "teacherId": 0
}
    * */

    private int batch;
    private String birthDate;
    private String department;
    private String emailAddress;
    private String firstName;
    private String gender;
    private String joinDate;
    private String lastName;
    private String password;
    private String phone;
    private String premanentAddress;
    private int salary;
    private String section;
    private String subject;
    private int teacherId;


}
