package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import StepDefinition.Hooks;

public class P11_CompareList {

    static By firstCompareProduct = By.xpath("//div[@class=\"item-grid\"]/div[1]/div[1]/div[2]/div[3]/div[2]/button[2]");
    static By firstCompareProductAsser = By.cssSelector("p[class=\"content\"]");
    static By secondCompareProduct = By.xpath("//div[@class=\"item-grid\"]/div[2]/div[1]/div[2]/div[3]/div[2]/button[2]");
    static By secondCompareProductAsser = By.cssSelector("p[class=\"content\"]");
    static By thirdCompareProduct = By.xpath("//div[@class=\"item-grid\"]/div[3]/div[1]/div[2]/div[3]/div[2]/button[2]");
    static By thirdCompareProductAsser = By.cssSelector("p[class=\"content\"]");
    static By checkCompare = By.cssSelector("a[class=\"picture\"]");
    static By ClearCompareProduct = By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[4]/button");
    static By deleteCompareList = By.xpath("//div[@class=\"page-body\"]/a");
    static By DeleteCompareListAsser = By.xpath("//div[@class=\"page-body\"]/div");

    public static WebElement compareProd1POM() {
        return Hooks.driver.findElement(firstCompareProduct);
    }

    public static WebElement compareProd1AsserPOM() {
        return Hooks.driver.findElement(firstCompareProductAsser);
    }

    public static WebElement compareProd2POM() {
        return Hooks.driver.findElement(secondCompareProduct);
    }

    public static WebElement compareProd2AsserPOM() {
        return Hooks.driver.findElement(secondCompareProductAsser);
    }

    public static WebElement compareProd3POM() {
        return Hooks.driver.findElement(thirdCompareProduct);
    }

    public static WebElement compareProd3AsserPOM() {
        return Hooks.driver.findElement(thirdCompareProductAsser);
    }

    public static WebElement compareCheckPOM() {
        return Hooks.driver.findElement(checkCompare);
    }
    public static WebElement compareProdClearPOM() {
        return Hooks.driver.findElement(ClearCompareProduct);
    }

    public static WebElement deleteListPOM() {
        return Hooks.driver.findElement(deleteCompareList);
    }

    public static WebElement compareDeleteListAsserPOM() {
        return Hooks.driver.findElement(DeleteCompareListAsser);
    }

    public static WebElement GoToCompareProducts(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/compareproducts\"]"));
    }
}
