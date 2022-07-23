package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import StepDefinition.Hooks;

public class P02_LoginPage {
    public static WebElement PressingLogInLink() {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-login\"]"));
    }

    public static WebElement PressingLogInBtn() {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
    }

    public static WebElement GettingUserEmailAddress() {
        return Hooks.driver.findElement(By.id("Email"));
    }

    public static WebElement DisplayingMyAccountLink() {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-account\"]"));
    }
}