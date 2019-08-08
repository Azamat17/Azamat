package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.WikipediaHomePage;
import utilities.Config;
import utilities.Driver;

public class Wikipedia_Steps {

    WikipediaHomePage wikiPage = new WikipediaHomePage();

    @Given("User is on Wikipedia Homepage")
    public void user_is_on_Wikipedia_Homepage() {
        Driver.getDriver().get(Config.getProperty("wikipediaUrl"));
    }
    @When("User types {string} in the wikipedia search box")
    public void user_types_in_the_wikipedia_search_box(String word) {
        wikiPage.searchBox.sendKeys(word);
    }

    @When("User clicks wikipedia search button")
    public void user_clicks_wikipedia_search_button() {
        wikiPage.searchButton.click();
    }

    @Then("User sees {string} is in the wikipedia title")
    public void user_sees_is_in_the_wikipedia_title(String word) {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = word + " - Wikipedia";
        Assert.assertTrue("Wiki title is not matching" , actualTitle.equalsIgnoreCase(expectedTitle));

    }
    @Then("User sees {string} is in the main header")
    public void user_sees_is_in_the_main_header(String mainHeader) {
        Assert.assertTrue(wikiPage.wikiHeader.getText().equalsIgnoreCase(mainHeader));
    }

    @Then("User sees {string} is in the image header")
    public void user_sees_is_in_the_image_header(String imageHeader) {
        Assert.assertTrue(wikiPage.imageHeader.getText().equalsIgnoreCase(imageHeader));
    }

}
