package StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import Pages.P03_ResetPasswordPage;

public class SD03_ResetPassword {

    P03_ResetPasswordPage p03_resetPasswordPage = new P03_ResetPasswordPage();

    @When("user presses on forgot password link")
    public void user_presses_on_forgot_password_link() {
        p03_resetPasswordPage.PressingOnForgetPasswordLink().click();
    }

    @When("user presses on Recover button")
    public void user_presses_on_recover_button() {
        p03_resetPasswordPage.PressingOnRecoverBtnLink().click();
    }

    @Then("display message \"Email with instructions has been sent to you.\"at the top for user")
    public void display_message_email_with_instructions_has_been_sent_to_you_at_the_top_for_user() {
        String expectedResult = "Email with instructions has been sent to you.";
        Assert.assertTrue(p03_resetPasswordPage.DisplayingMessage().getText().contains(expectedResult));
    }
}