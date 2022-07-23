package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import Pages.P11_CompareList;
import java.util.ArrayList;
import java.util.List;

public class SD11_CompareList {

    P11_CompareList p11_compareList = new P11_CompareList();

    @Given("user adds First Product to CompareList")
    public void user_adds_First_Product_to_CompareList(){
        p11_compareList.compareProd1POM().click();

        Assert.assertTrue(p11_compareList.compareProd1AsserPOM().isDisplayed());
        Hooks.sleep(10);
        System.out.println("First product has been added to your productComparison");
    }

    @And("user adds Second Product to CompareList")
    public void user_adds_Second_Product_to_CompareList() {
        p11_compareList.compareProd2POM().click();
        // Assertion product_2 //
        Assert.assertTrue(p11_compareList.compareProd2AsserPOM().isDisplayed());
        Hooks.sleep(10);
        System.out.println("Second product has been added to your productComparison");
    }

    @And("user adds Third Product to CompareList")
    public void user_adds_Third_Product_to_CompareList()  {
        // Add & Assert product_3 to Compare list using POM //
        p11_compareList.compareProd3POM().click();
        // Assertion product_3 //
        Assert.assertTrue(p11_compareList.compareProd3AsserPOM().isDisplayed());
        Hooks.sleep(10);
        System.out.println("Third product has been added to your productComparison");
    }

    @When("user goes to CompareProductsList")
    public void user_goes_to_CompareProductsList() {
        // Go to Compare products list //
        //Hooks.driver.get("https://demo.nopcommerce.com/compareproducts");
        p11_compareList.GoToCompareProducts().click();
    }

    @Then("user compares between the chooesedProducts")
    public void user_compares_between_the_chooesedProducts() {
        List<WebElement> elements = new ArrayList<>();
        elements.add(p11_compareList.compareCheckPOM());

        // Check Compare products table //
        int count = elements.size();  //3
        System.out.println(count);
        Assert.assertTrue(count > 0);

        for (int x = 0; x < count ; x++) {
            System.out.println(elements.get(x).isDisplayed());
            Assert.assertTrue(elements.get(x).isDisplayed());
        }
        //System.out.println("You have 2 products in the compare table");
    }

    @And("user clears a product from compareList")
    public void user_clears_a_product_from_compareList() {
        p11_compareList.compareProdClearPOM().click();

    }

    @And("user deletes all the choosedProducts")
    public void user_deletes_all_the_choosedProducts() {

        p11_compareList.deleteListPOM().click();
        // Check deleted list //
        String actualResult = p11_compareList.compareDeleteListAsserPOM().getText();
        Hooks.sleep(3);

        String expectedResult = "You have no items to compare.";
        Assert.assertEquals(actualResult, expectedResult, "ERROR: Assertion False!");
        //System.out.println("You have no items to compare.");
    }
}
