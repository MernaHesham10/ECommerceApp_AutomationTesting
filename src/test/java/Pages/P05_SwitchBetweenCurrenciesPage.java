package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import StepDefinition.Hooks;

public class P05_SwitchBetweenCurrenciesPage {

    public static List<WebElement> DisplayingChoosedProductPrice() {
        return Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
    }

    public static WebElement ChoosingFromListElement() {
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }

}