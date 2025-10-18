package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

import java.awt.*;

@CucumberOptions(
            features = "src\\test\\resources\\Features\\Homepage.feature",
            glue = {"StepDefinitions"},
            tags = "@tc1",
            plugin = {"pretty","html:target/cucumber-reports/cucumber.html"}
    )
public  class TestRunner extends AbstractTestNGCucumberTests
    {
        @Override
        @DataProvider(parallel = false)
        public Object[][] scenarios() {
            return super.scenarios();
        }
    }

