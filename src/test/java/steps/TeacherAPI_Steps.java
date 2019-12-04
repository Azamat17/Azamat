package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.HelperMethods;
import io.cucumber.datatable.DataTable;
import models.CustomResponse;
import models.RequestBody;
import org.junit.Assert;
import utilities.APIrunner;
import utilities.DBType;
import utilities.DBUtility;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TeacherAPI_Steps {

    private RequestBody requestBody;
    private CustomResponse customResponse;

    @Given("Teacher is created with values")
    public void teacher_is_created_with_values(DataTable dataTable) {

        Map<String, String> map = dataTable.asMap(String.class, String.class);
        requestBody = HelperMethods.convertMapToObject(map);

    }

    @When("User hits the web service {string}")
    public void user_hits_the_web_service(String url) {
        // Write code here that turns the phrase above into concrete actions

        APIrunner.runPOST(url, requestBody);

    }

    @Then("User verifies status code {string}")
    public void user_verifies_status_code(String statusCode) {
        // Write code here that turns the phrase above into concrete actions

        Assert.assertTrue(APIrunner.getResponse().statusCode() == Integer.valueOf(statusCode));
    }
    @Then("User verifies response with Database")
    public void user_verifies_response_with_Database() {
        // Write code here that turns the phrase above into concrete actions
        String teacher_id = APIrunner.getCustomResponse().getTeacherId() + "";
        List<Map<String, Object>> table = null;

        try{
            DBUtility.openConnection(DBType.ORACLE);
            table = DBUtility.executeSQLquery("SELECT * FROM teacher WHERE teacher_id = " + teacher_id);
            System.out.println("Table size: " + table.size());

        } catch (SQLException e){
            e.printStackTrace();
        }

        // response is coming from API and we need to compare with data which is coming
        // from DB, APIrunner.getCustomResponse == Table
        // Compare first_name, last_name, teacher_id, salary, batch, subject, phone,
        // department, password

        ArrayList<String> keys = new ArrayList<>();
        keys.add("firstName");
        keys.add("lastName");
        keys.add("teacher_id");
        keys.add("salary");
        keys.add("batch");
        keys.add("subject");


        HelperMethods.validate(APIrunner.getCustomResponse(), table, keys);

    }

}
