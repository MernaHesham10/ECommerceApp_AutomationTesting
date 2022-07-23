package StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import Pages.P06_SelectDifferentCategoriesPage;
import StepDefinition.Hooks;

public class SD06_SelectDifferentCategories {
    SoftAssert verifyLink = new SoftAssert();

    P06_SelectDifferentCategoriesPage p06_selectDifferentCategoriesPage = new P06_SelectDifferentCategoriesPage();

    @When("user chooses category randomly")
    public void user_chooses_category_randomly() {
        Actions actions = new Actions(Hooks.driver);
        actions.moveToElement(p06_selectDifferentCategoriesPage.ChoosingMenuElement());
        actions.moveToElement(p06_selectDifferentCategoriesPage.ChoosingSubMenuElement());

        Hooks.sleep(20);

        actions.click().build().perform();
    }

    @Then("user return to the choosed category page")
    public void user_return_to_the_choosed_category_page() {
        String expectedResult = "https://demo.nopcommerce.com/shoes";
        verifyLink.assertEquals(Hooks.driver.getCurrentUrl(), expectedResult, "Wrong Page");
        verifyLink.assertAll();
    }

}