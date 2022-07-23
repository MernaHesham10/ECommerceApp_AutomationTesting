package StepDefinition;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import Pages.P01_RegistrationPageElements;
import Pages.P10_WishlistPage;

public class Hooks {

    P01_RegistrationPageElements p01_registrationPageElements = new P01_RegistrationPageElements();

    P10_WishlistPage p10_wishlistPage = new P10_WishlistPage();

    static public WebDriver driver = null;
    static public String userFirstName = "FirstNameTesting";
    static public String userLastName = "LastNameTesting";
    static public String dateOfBirth =  "10/7/2001";
    static public String gender =  "Female";
    static public String companyName = "AutomationTesting";
    static public String option = "True";
    static public String userValidEmail = "automationTestingDoneM@gmail.com";
    static public String userValidPassword = "Test@123";
    static public SoftAssert verifyRegistration = new SoftAssert();
    static public boolean CheckRegistration = false;

    @BeforeAll
    public static void user_open_chrome_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
    }

    public static void sleep(int seconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }

    // Common steps between features
    @Given("open home page again")
    public void open_home_page_again() {
        driver.get("https://demo.nopcommerce.com/");
    }

    @Given("user goes to home page")
    public void user_goes_to_home_page() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/", "Wrong HomePage Link");
    }

    @When("user enters email address")
    public void user_enters_email_address() throws InterruptedException {
        p01_registrationPageElements.GettingUserEmailAddress().clear();

        while (!(userValidEmail.contains("@")));  // check functionality email
        //System.out.println("Email: " + userValidEmail);

        p01_registrationPageElements.GettingUserEmailAddress().sendKeys(userValidEmail);
    }


    @When("user enters password")
    public void user_enters_password() {
        p01_registrationPageElements.GettingUserPassword().sendKeys(userValidPassword);
    }

    @Then("user pressed on Log-out link")
    public void user_pressed_on_Log_out_link() {
        p01_registrationPageElements.PressingLogOutBtn().click();
    }

    @When("user scrolls down to products")
    public void user_scrolls_down_to_products() {
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("arguments[0].scrollIntoView();", p10_wishlistPage.DisplayingSpecificProduct());
        Hooks.sleep(20);
    }

    @AfterAll
    public static void closeDriver() {
        sleep(30);
        driver.quit();
    }

}