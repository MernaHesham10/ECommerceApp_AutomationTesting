package StepDefinition;

import Pages.P09_ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;

public class SD09_ShoppingCart {

    P09_ShoppingCartPage p09_shoppingCartPage = new P09_ShoppingCartPage();

    @And("user chooses product randomly")
    public void user_chooses_product_randomly() {
        p09_shoppingCartPage.ChooseingAnyProduct().click();
    }

    @And("press on ADD TO CART button")
    public void press_on_add_to_cart_button() {
        p09_shoppingCartPage.AddingSpecificProductBtn().click();
    }

    @Then("the product is added to the user's shopping cart and message appears says The product has been added to your shopping cart")
    public void the_product_is_added_to_the_user_s_shopping_cart_and_message_appears_says_the_product_has_been_added_to_your_shopping_cart() {
        SoftAssert wishlistAssertion = new SoftAssert();
        if (p09_shoppingCartPage.DisplayingMessage().isDisplayed()) {
            wishlistAssertion.assertEquals(p09_shoppingCartPage.DisplayingMessage().getText(), "The product has been added to your shopping cart");
            wishlistAssertion.assertEquals(p09_shoppingCartPage.DisplayingMessage().getCssValue("background-color"), "rgba(75, 176, 122, 1)");
            wishlistAssertion.assertAll();
            //System.out.println("Add product to shopping cart successfully");
        }
    }

}