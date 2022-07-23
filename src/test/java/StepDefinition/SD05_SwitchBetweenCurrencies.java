package StepDefinition;

import Pages.P05_SwitchBetweenCurrenciesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import Pages.P05_SwitchBetweenCurrenciesPage;

public class SD05_SwitchBetweenCurrencies {

    P05_SwitchBetweenCurrenciesPage p05_switchBetweenCurrenciesPage = new P05_SwitchBetweenCurrenciesPage();

    @When("user chooses from currency dropdown list")
    public void user_chooses_from_currency_dropdown_list() {
        if (p05_switchBetweenCurrenciesPage.ChoosingFromListElement().isEnabled() && p05_switchBetweenCurrenciesPage.ChoosingFromListElement().isDisplayed()) {
            System.out.println("DropList is Enabled and Visible");
        } else {
            System.out.println("DropList is not Visible");
        }

        Select select = new Select(p05_switchBetweenCurrenciesPage.ChoosingFromListElement());
        select.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
    }

    @Then("verification process from currency")
    public void verificationProcess_from_currency() {
        SoftAssert productAssert = new SoftAssert();
        String expectedResult = "€";
        for (int i = 0; i < p05_switchBetweenCurrenciesPage.DisplayingChoosedProductPrice().size(); i++) {
            productAssert.assertEquals(p05_switchBetweenCurrenciesPage.DisplayingChoosedProductPrice().get(i).getText().substring(0, 1), expectedResult, "Error found different currency");
            productAssert.assertAll();
            //System.out.println("Right: " + p05_switchBetweenCurrenciesPage.DisplayingChoosedProductPrice().get(i).getText());
        }
    }
}