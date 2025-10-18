package StepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyStepdefs {

    WebDriver driver;
    @Given("User is able to open homepage")
    public void userIsAbleToOpenHomepage() throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        // Check if running on AWS CodeBuild

            options.addArguments("--headless");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--disable-gpu");
            options.addArguments("--window-size=1920,1080");
            options.addArguments("--disable-extensions");
            options.addArguments("--disable-web-security");

        driver= new ChromeDriver(options);

        driver.get("https://www.google.com");
        Thread.sleep(5000);

    }

    @Then("User is able to close the homepage")
    public void userIsAbleToCloseTheHomepage() {

      driver.close();

    }
}
