package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AgodaHomePage;


import static org.testng.Assert.assertEquals;

public class AgodaStepDefinitions {

    WebDriver driver;
    AgodaHomePage agodaHomePage;

    @Given("launch the chrome browser")
    public void launch_the_chrome_browser() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        agodaHomePage = new AgodaHomePage(driver);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Given("user is on the Agoda homepage")
    public void user_is_on_the_agoda_homepage() {
        agodaHomePage.navigateToHomePage();
    }

    @When("the user clicks on create account")
    public void the_user_clicks_on_create_account() throws InterruptedException {
        agodaHomePage.clickCreateAccountLink();
    }

    @When("enters the details {string},{string},{string},{string},{string}")
    public void enters_the_details(String firstname, String lastname, String email, String password, String confirmpassword) throws InterruptedException {
        agodaHomePage.fillRegistrationForm(firstname, lastname, email, password, confirmpassword);
    }


    @When("clicks on the signup button")
    public void clicks_on_the_signup_button() throws InterruptedException {
        agodaHomePage.clickSignUpButton();
    }

    @Then("username {string} should be displayed")
    public void username_should_be_displayed(String expectedUsername) throws InterruptedException {
        String actualUsername = agodaHomePage.userName();
        assertEquals(expectedUsername, actualUsername);
    }
}
