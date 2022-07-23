package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import Pages.P08_SelectDifferentTags;
import java.util.*;

public class SD08_SelectDifferentTags {

    P08_SelectDifferentTags p08_selectDifferentTags = new P08_SelectDifferentTags();

    @When("user chooses a popular tag")
    public void select_popular_tag() {
        p08_selectDifferentTags.SelectedCoolTag().click();

        Hooks.sleep(8);

        String actualResult = p08_selectDifferentTags.SelectedCoolItemPage().getText();
        //System.out.println(actualResult);
        String expectedResult = "Products tagged with 'cool'";

        Assert.assertEquals(actualResult, expectedResult, "Assertion False: ");
        //System.out.println("Products tagged with 'cool'");
    }

    @And("user will find products")
    public void find_products()
    {
        // Check products into Cool tag //
        List<WebElement> CoolPageCount = new ArrayList<>();
        CoolPageCount.add(p08_selectDifferentTags.GetCoolPageCount());

        List<WebElement> CoolAsser = new ArrayList<>();
        CoolAsser.add(p08_selectDifferentTags.DisplayCoolAsser());

        Assert.assertTrue(CoolPageCount.size() > 0); //6

        ArrayList<String> firstProductList = new ArrayList<>();

        for (int x = 0; x < CoolPageCount.size(); x++) {
            firstProductList.add(CoolPageCount.get(x).getText());
            Assert.assertTrue(CoolAsser.get(x).getText().toUpperCase().contains("ADD TO CART"), "Error Message: Cool Products Not Found");
        }
    }

    @Then("user chooses a different tag")
    public void select_a_different_tag() {
        p08_selectDifferentTags.SelectedShirtTag().click();
        // Assert Shirt Tag Products //
        String actualResult = p08_selectDifferentTags.SelectedShirtTag().getText();

        Hooks.sleep(8);

        String expectedResult = "shirt";
        Assert.assertEquals(actualResult, expectedResult, "Error Message: There are No Products");
    }

    @And("user will find another different products")
    public void find_another_different_products() {
        List<WebElement> ShirtCount = new ArrayList<>();
        ShirtCount.add(p08_selectDifferentTags.GetShirtCount());

        List<WebElement> ShirtAsser = new ArrayList<>();
        ShirtAsser.add(p08_selectDifferentTags.DisplayShirtAsser());

        // Check products into shirt tag using POM //
        Assert.assertTrue(ShirtCount.size() > 0); //3

        ArrayList<String> secondProductList = new ArrayList<>();

        for (int x = 0; x < ShirtCount.size() ; x++) {
            System.out.println(ShirtCount.get(x).getText());
            secondProductList.add(ShirtCount.get(x).getText());
            Assert.assertTrue(ShirtAsser.get(x).getText().contains("Shirt"), "Error Message: Shirt Products Not Found");
        }
    }

}
