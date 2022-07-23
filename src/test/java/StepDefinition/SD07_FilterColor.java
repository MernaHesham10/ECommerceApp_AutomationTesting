package StepDefinition;

import static Pages.P06_SelectDifferentCategoriesPage.ChoosingMenuElement;
import static Pages.P06_SelectDifferentCategoriesPage.ChoosingSubMenuElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import org.openqa.selenium.interactions.Actions;
import Pages.P07_FilterColor;

public class SD07_FilterColor {

    P07_FilterColor p07_filterColor = new P07_FilterColor();

    @And("user chooses Category and hover to open sub-Category")
    public void user_choose_Category_hover_to_open_subCategory() throws InterruptedException {
        Actions act = new Actions(Hooks.driver);
        act.moveToElement(ChoosingMenuElement()).moveToElement(ChoosingSubMenuElement()).click().build().perform();
    }

    @And("user can filter sub-Category with color")
    public void user_can_filter_subCategory_with_color() {
        p07_filterColor.colorFilterProduct().click();
    }

    @Then("user will find product with the selected color")
    public void user_will_find_product_with_the_selected_color() {
        Hooks.sleep(15);
        Assert.assertTrue(p07_filterColor.colorCheckProduct().isDisplayed(), "Error Message: Selected Color Not Found!");
        //System.out.println("Color Selected: Red Shoes");
    }

}