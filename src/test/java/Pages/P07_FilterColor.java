package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import StepDefinition.Hooks;

public class P07_FilterColor {

    public static WebElement colorFilterProduct() {
        return Hooks.driver.findElement(By.id("attribute-option-15"));
    }

    public static WebElement colorCheckProduct() {
        return Hooks.driver.findElement(By.id("attribute-option-15"));
    }

}
