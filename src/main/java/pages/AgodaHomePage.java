/*package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AgodaHomePage {

    private WebDriver driver;

    public AgodaHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToHomePage() {
        driver.get("https://www.agoda.com/");
    }

    public void clickCreateAccountLink() throws InterruptedException {
        WebElement createAccountLink = driver.findElement(By.xpath("//span[text()='Create account']"));
        createAccountLink.click();
        Thread.sleep(3000);
    }

    public void fillRegistrationForm(String firstName,String lastName,String email,String password,String confirmPassword) throws InterruptedException {
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Universal login']")));
        driver.findElement(By.id("firstName")).sendKeys(firstName);
        driver.findElement(By.id("lastName")).sendKeys(lastName);
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("confirmPassword")).sendKeys(confirmPassword);
        driver.getWindowHandles().size();
        Thread.sleep(3000);
        
    }

    public void clickSignUpButton() throws InterruptedException {
        WebElement signUpButton = driver.findElement(By.id("email-signup-button"));
        signUpButton.click();

        driver.switchTo().parentFrame();
        Thread.sleep(5000);
        
    }

    public String userName() throws InterruptedException {

        WebElement userNameEl = driver.findElement(By.xpath("//div/span/p"));
        System.out.println("Logged user is : " + userNameEl.getText());
        return userNameEl.getText();
    }
}
*/
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgodaHomePage {

    private WebDriver driver;

    public AgodaHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Create account']")
    private WebElement createAccountLink;

    @FindBy(xpath = "//iframe[@title='Universal login']")
    private WebElement loginFrame;

    @FindBy(id = "firstName")
    private WebElement firstNameField;

    @FindBy(id = "lastName")
    private WebElement lastNameField;

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "confirmPassword")
    private WebElement confirmPasswordField;

    @FindBy(id = "email-signup-button")
    private WebElement signUpButton;

    @FindBy(xpath = "//div/span/p")
    private WebElement userNameEl;

    public void navigateToHomePage() {
        driver.get("https://www.agoda.com/");
    }

    public void clickCreateAccountLink() throws InterruptedException {
        createAccountLink.click();
        Thread.sleep(3000);
    }

    public void fillRegistrationForm(String firstName, String lastName, String email, String password, String confirmPassword) throws InterruptedException {
        driver.switchTo().frame(loginFrame);
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        confirmPasswordField.sendKeys(confirmPassword);
        driver.getWindowHandles().size();
        Thread.sleep(3000);
    }

    public void clickSignUpButton() throws InterruptedException {
        signUpButton.click();
        driver.switchTo().parentFrame();
        Thread.sleep(5000);
    }

    public String userName() throws InterruptedException {
        System.out.println("Logged user is : " + userNameEl.getText());
        return userNameEl.getText();
    }
}
