package Pages;
import StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P01_RegistrationPageElements {

    public static WebElement GettingRegisterLink() {
        //return driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
        // both command are getting the same result

        return Hooks.driver.findElement(By.className("ico-register"));
    }

    public static WebElement GettingUserFirstName() {
        return Hooks.driver.findElement(By.id("FirstName"));
    }

    public static WebElement GettingUserLastName() {
        return Hooks.driver.findElement(By.id("LastName"));
    }

    public static WebElement GettingUserGender_male() {
        return Hooks.driver.findElement(By.id("gender-male"));
    }

    public static WebElement GettingUserGender_female() {
        return Hooks.driver.findElement(By.id("gender-female"));
    }

    public static WebElement GettingUserEmailAddress() {
        return Hooks.driver.findElement(By.id("Email"));
        // both command are getting the same result
        //return driver.findElement(By.cssSelector("input[id=\"Email\"]"));
    }

    public static Select GettingUserDOB_day() {
        WebElement dayOfDOB = Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthDay\"]"));
        Select chossedDay = new Select(dayOfDOB);
        return chossedDay;
    }

    public static Select GettingUserDOB_month() {
        WebElement monthOfDOB = Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthMonth\"]"));
        Select choosedMonth = new Select(monthOfDOB);
        return choosedMonth;
    }

    public static Select GettingUserDOB_year() {
        WebElement yearOfDOB = Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthYear\"]"));
        Select choosedYear = new Select(yearOfDOB);
        return choosedYear;
    }

    public static WebElement GettingUserPassword() {
        return Hooks.driver.findElement(By.id("Password"));
    }

    public static WebElement GettingUserConfirmPassword() {
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }

    public static WebElement GettingCompanyName() {
        return Hooks.driver.findElement(By.cssSelector("input[name=\"Company\"]"));
        // both command are getting the same result
        //return driver.findElement(By.id("Company"));
    }

    public static WebElement ChoosingNewsLetterOption() {
        return Hooks.driver.findElement(By.cssSelector("input[id=\"Newsletter\"]"));
        // both command are getting the same result
        //return driver.findElement(By.id("Newsletter"));
    }

    public static WebElement PressingRegisterBtn() {
        return Hooks.driver.findElement(By.id("register-button"));
    }

    // After Registration
    public static WebElement DisplayingMessage() {
        return Hooks.driver.findElement(By.className("result"));
    }

    public static WebElement PressingContinueBtn() {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"button-1 register-continue-button\"]"));
    }

    public static WebElement PressingLogOutLink() {
        return Hooks.driver.findElement(By.className("ico-logout"));
    }

    public static WebElement PressingLogOutBtn() {
        return Hooks.driver.findElement(By.className("ico-logout"));
    }

}