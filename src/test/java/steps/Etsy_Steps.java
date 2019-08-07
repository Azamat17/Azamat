package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.EtsyHomePage;
import utilities.Config;
import utilities.Driver;

public class Etsy_Steps {

    EtsyHomePage etsyHomePage = new EtsyHomePage();

    @Given("User is on Etsy Homepage")
    public void user_is_on_Etsy_Homepage() {
        Driver.getDriver().get(Config.getProperty("etsyUrl"));
    }

    @When("User types {string} in the search box")
    public void user_types_in_the_search_box(String word) {
       etsyHomePage.searchBox.sendKeys(word);

    }

    @When("User clicks search button")
    public void user_clicks_search_button() {
        etsyHomePage.searchButton.click();
    }

    @Then("User sees {string} is in the title")
    public void user_sees_is_in_the_title(String word) {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = word + " | Etsy";
        Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle));
    }

}
