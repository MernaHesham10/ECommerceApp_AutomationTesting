package StepDefinition;

import Pages.P02_LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import StepDefinition.Hooks;

public class SD02_Login {
    public static SoftAssert verifyLogin = new SoftAssert();
    P02_LoginPage p02_loginPage = new P02_LoginPage();

    @Given("user had an actual account")
    public void user_had_an_actual_account() {
        Assert.assertTrue(!(Hooks.userValidEmail.isEmpty() && Hooks.CheckRegistration), "There's no valid account registered yet");
    }

    @When("user pressed on Log-in link in the header")
    public void user_pressed_on_log_in_link_in_the_header() {
        p02_loginPage.PressingLogInLink().click();
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/login?returnUrl=%2F", "Wrong Log In Link");
        Hooks.sleep(20);
    }

    @And("user enters email address in login page")
    public void userEntersEmailAddressInLoginPage() {
        p02_loginPage.GettingUserEmailAddress().sendKeys(Hooks.userValidEmail);
    }

    @When("user pressed on Log-in button")
    public void user_pressed_on_Log_in_button() {
        p02_loginPage.PressingLogInBtn().click();
        Hooks.sleep(20);
    }

    @Then("user log-in successfully")
    public void user_log_in_successfully() {
        String expectedResult = "https://demo.nopcommerce.com/";
        verifyLogin.assertEquals(Hooks.driver.getCurrentUrl(), expectedResult, "Process Failed 1");
        verifyLogin.assertTrue(p02_loginPage.DisplayingMyAccountLink().isDisplayed(), "Process Failed 2");
        verifyLogin.assertAll();
    }

}