package StepDefinition;
import Pages.P01_RegistrationPageElements;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import StepDefinition.Hooks;

public class SD01_RegistrationStepDefinitions {

    P01_RegistrationPageElements p01_registrationPageElements = new P01_RegistrationPageElements();

    @When("user pressed on Register link")
    public void user_pressed_on_Register_link(){
        p01_registrationPageElements.GettingRegisterLink().click();
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/register?returnUrl=%2F", "Wrong Registration Link");
        Hooks.sleep(20);
    }

    @When("user chooses gender")
    public void user_chooses_gender() {
        if (Hooks.gender.equalsIgnoreCase("male")) {
            p01_registrationPageElements.GettingUserGender_male().click();
        }
        if (Hooks.gender.equalsIgnoreCase("female")) {
            p01_registrationPageElements.GettingUserGender_female().click();
        }
    }

    @When("user enters first name")
    public void user_enters_first_name() {
        p01_registrationPageElements.GettingUserFirstName().clear();
        p01_registrationPageElements.GettingUserFirstName().sendKeys(Hooks.userFirstName);
    }

    @When("user enters last name")
    public void user_enters_last_name() {
        p01_registrationPageElements.GettingUserLastName().clear();
        p01_registrationPageElements.GettingUserLastName().sendKeys(Hooks.userLastName);
    }

    @When("user chooses birth of date")
    public void user_chooses_birth_of_date() {
        String[] dateField = Hooks.dateOfBirth.split("/");

        p01_registrationPageElements.GettingUserDOB_day().selectByValue(dateField[0]);
        p01_registrationPageElements.GettingUserDOB_month().selectByValue(dateField[1]);
        p01_registrationPageElements.GettingUserDOB_year().selectByValue(dateField[2]);
    }

    @When("user enters company name")
    public void user_enters_company_name() {
        p01_registrationPageElements.GettingCompanyName().sendKeys(Hooks.companyName);
    }

    @When("user chooses Newsletter option")
    public void user_chooses_newsletter_option() throws InterruptedException {
        boolean isDisplayed = p01_registrationPageElements.ChoosingNewsLetterOption().isSelected();
        if (Hooks.option.equalsIgnoreCase("true") && isDisplayed == false) {
            p01_registrationPageElements.ChoosingNewsLetterOption().click();
            //System.out.println("Newsletter: " + option);
        } else if (Hooks.option.equalsIgnoreCase("false") && isDisplayed == true) {
            p01_registrationPageElements.ChoosingNewsLetterOption().click();
            //System.out.println("Newsletter: " + option);
        } else
            //System.out.println("Newsletter: " + option);

        Hooks.sleep(20);
    }

    @When("user enters confirm password")
    public void user_enters_confirm_password() {
        p01_registrationPageElements.GettingUserConfirmPassword().sendKeys(Hooks.userValidPassword);
    }

    @When("user pressed on REGISTER button")
    public void user_pressed_on_register_button() throws InterruptedException {
        p01_registrationPageElements.PressingRegisterBtn().click();
        Hooks.sleep(20);
    }

    @Then("user log-in successfully and log-out link appears in the header")
    public void log_out_link_appears_in_the_header() {
        Hooks.verifyRegistration.assertTrue(p01_registrationPageElements.PressingLogOutLink().isDisplayed(), "Registration Process Failed_2");
        Hooks.verifyRegistration.assertAll();
        Hooks.CheckRegistration = true;
    }

    @Then("display {string} message to user")
    public void display_message_to_user(String expectedResult) {
        String actualResult = p01_registrationPageElements.DisplayingMessage().getText();
        Hooks.verifyRegistration.assertTrue(actualResult.contains(expectedResult), "Registration Process Failed_1");
        Hooks.verifyRegistration.assertAll();
        p01_registrationPageElements.PressingContinueBtn().click();
    }
}