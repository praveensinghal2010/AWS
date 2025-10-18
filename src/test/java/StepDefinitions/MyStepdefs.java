package StepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {

    WebDriver driver;
    @Given("User is able to open homepage")
    public void userIsAbleToOpenHomepage() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
         driver= new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(5000);

    }

    @Then("User is able to close the homepage")
    public void userIsAbleToCloseTheHomepage() {

      driver.close();

    }
}
