package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import StepDefinition.Hooks;

public class P06_SelectDifferentCategoriesPage {
    public static WebElement ChoosingMenuElement() {

        return Hooks.driver.findElement(By.cssSelector("a[href=\"/apparel\"]"));
    }

    public static WebElement ChoosingSubMenuElement() {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/shoes\"]"));
    }
}