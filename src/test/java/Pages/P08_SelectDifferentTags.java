package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import StepDefinition.Hooks;

public class P08_SelectDifferentTags {

    public static WebElement SelectedCoolTag() {
        // Select Cool Tag //
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/cool\"]"));
    }

    public static WebElement SelectedCoolItemPage(){
        return Hooks.driver.findElement(By.xpath("//div[@class=\"page-title\"]/h1"));
    }

    public static WebElement DisplayCoolAsser(){
        return Hooks.driver.findElement(By.cssSelector("div[class=\"buttons\"]"));
    }

    public static WebElement GetCoolPageCount() {
        return  Hooks.driver.findElement(By.cssSelector("h2[class=\"product-title\"] a"));
    }

    public static WebElement SelectedShirtTag() {
        // Select Shirt Tag //
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/shirt\"]"));
    }

    public static WebElement GetShirtCount(){
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[1]/div[3]/select/option[2]"));
    }

    public static WebElement DisplayShirtAsser(){
        return Hooks.driver.findElement(By.cssSelector("h2[class=\"product-title\"] a"));
    }

}
