package steps;

import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class MVN_Steps {
    @Given("User goes to mvnrepository")
    public void user_goes_to_mvnrepository() {
        Driver.getDriver().get("https://www.mvnrepository.com");
    }

    @Given("User searches for a word_ {string}")
    public void user_searches_for_a_word_(String word) {
        WebElement searchBox = Driver.getDriver().findElement(By.name("q"));
        searchBox.sendKeys(word + Keys.ENTER);
    }
}
