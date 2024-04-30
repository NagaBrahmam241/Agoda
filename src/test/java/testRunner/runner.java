package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\E010585\\IdeaProjects\\Agoda\\src\\test\\Resources\\Features\\agoda.feature",
        glue = "StepDefinitions",
        monochrome = true,
        plugin = {"html:test-output"}
)

public class runner extends AbstractTestNGCucumberTests {

}

