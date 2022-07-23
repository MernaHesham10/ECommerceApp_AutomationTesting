package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import StepDefinition.Hooks;

public class P12_OrderChechOut {
    static By checkoutFirstName = By.xpath("//input[@id=\"BillingNewAddress_FirstName\"]");
    static By checkoutLastName = By.xpath("//input[@id=\"BillingNewAddress_LastName\"]");
    static By checkoutEmail = By.xpath("//input[@id=\"BillingNewAddress_Email\"]");
    static By checkoutCountry = By.xpath("//select[@name=\"BillingNewAddress.CountryId\"]");
    static By checkoutCity = By.xpath("//input[@id=\"BillingNewAddress_City\"]");
    static By checkoutAddress = By.xpath("//input[@id=\"BillingNewAddress_Address1\"]");
    static By checkoutPostCode = By.xpath("//input[@id=\"BillingNewAddress_ZipPostalCode\"]");
    static By checkoutPhoneNo = By.xpath("//input[@id=\"BillingNewAddress_PhoneNumber\"]");
    static By checkoutFaxNo = By.xpath("//input[@id=\"BillingNewAddress_FaxNumber\"]");
    static By checkoutBillAddSaveBtn = By.xpath("//button[@onclick=\"Billing.save()\"]");
    static By checkoutShipMethSel = By.xpath("//ul[@class=\"method-list\"]/li[2]/div[1]/input");
    static By checkoutShipMethSaveBtn = By.xpath("//button[@onclick=\"ShippingMethod.save()\"]");
    static By checkoutPayMethSel = By.cssSelector("input[id=\"paymentmethod_1\"]");
    static By checkoutPayMethSaveBtn = By.xpath("//button[@onclick=\"PaymentMethod.save()\"]");
    static By checkoutCardType = By.className("dropdownlists");
    static By checkoutCardHolderName =By.xpath("//input[@id=\"CardholderName\"]");
    static By checkoutCardNo = By.xpath("//input[@id=\"CardNumber\"]");
    static By checkoutCardExpMonth = By.xpath("//select[@id=\"ExpireMonth\"]");
    static By checkoutCardExpYear = By.xpath("//select[@id=\"ExpireYear\"]");
    static By checkoutCardCode = By.xpath("//input[@id=\"CardCode\"]");
    static By checkoutPaymentSaveBtn = By.xpath("//button[@onclick=\"PaymentInfo.save()\"]");
    static By checkoutOrderConfirmBtn = By.cssSelector("button[onclick=\"ConfirmOrder.save()\"]");
    static By checkoutOrderDetails = By.partialLinkText("details");
    static By checkoutInvoiceSave = By.xpath("//a[@class=\"button-2 pdf-invoice-button\"]");
    static By checkoutInvoicePrint = By.xpath("//a[@class=\"button-2 print-order-button\"]");

    public static WebElement checkoutTermsPOM(){
        // Agree with the terms of service //
        return Hooks.driver.findElement(By.xpath("//div[@class=\"terms-of-service\"]/input"));
    }

    public static WebElement checkoutCardExpMonthPOM(){
        // Press Checkout button //
        return Hooks.driver.findElement(checkoutCardExpMonth);
    }

    public static WebElement checkoutCardExpYearPOM(){
        // Press Checkout button //
        return Hooks.driver.findElement(checkoutCardExpYear);
    }

    public static WebElement checkoutCardCodePOM(){
        // Press Checkout button //
        return Hooks.driver.findElement(checkoutCardCode);
    }

    public static WebElement checkoutPaymentSaveBtnPOM(){
        // Press Checkout button //
        return Hooks.driver.findElement(checkoutPaymentSaveBtn);
    }

    public static WebElement checkoutOrderConfirmBtnPOM(){
        // Press Checkout button //
        return Hooks.driver.findElement(checkoutOrderConfirmBtn);
    }

    public static WebElement checkoutOrderDetailsPOM(){
        // Press Checkout button //
        return Hooks.driver.findElement(checkoutOrderDetails);
    }

    public static WebElement checkoutInvoiceSavePOM(){
        // Press Checkout button //
        return Hooks.driver.findElement(checkoutInvoiceSave);
    }

    public static WebElement checkoutInvoicePrintPOM(){
        // Press Checkout button //
        return Hooks.driver.findElement(checkoutInvoicePrint);
    }

    public static WebElement checkoutFNamePOM(){
        // Press Checkout button //
        return Hooks.driver.findElement(checkoutFirstName);
    }

    public static WebElement checkoutLNamePOM(){
        // Press Checkout button //
        return Hooks.driver.findElement(checkoutLastName);
    }

    public static WebElement checkoutMailPOM(){
        // Press Checkout button //
        return Hooks.driver.findElement(checkoutEmail);
    }

    public static WebElement checkoutCountryPOM(){
        // Press Checkout button //
        return Hooks.driver.findElement(checkoutCountry);
    }

    public static WebElement checkoutCityPOM(){
        // Press Checkout button //
        return Hooks.driver.findElement(checkoutCity);
    }

    public static WebElement checkoutAddressPOM(){
        // Press Checkout button //
        return Hooks.driver.findElement(checkoutAddress);
    }

    public static WebElement checkoutPostCodePOM(){
        // Press Checkout button //
        return Hooks.driver.findElement(checkoutPostCode);
    }

    public static WebElement checkoutPhoneNoPOM(){
        // Press Checkout button //
        return Hooks.driver.findElement(checkoutPhoneNo);
    }

    public static WebElement checkoutFaxNoPOM(){
        // Press Checkout button //
        return Hooks.driver.findElement(checkoutFaxNo);
    }

    public static WebElement checkoutBillAddSaveBtnPOM(){
        // Press Checkout button //
        return Hooks.driver.findElement(checkoutBillAddSaveBtn);
    }

    public static WebElement checkoutShipMethSelPOM(){
        // Press Checkout button //
        return Hooks.driver.findElement(checkoutShipMethSel);
    }

    public static WebElement checkoutBtnPOM(){
        // Press Checkout button //
        return Hooks.driver.findElement(By.xpath("//div[@class=\"checkout-buttons\"]/button"));
    }

    public static WebElement checkoutShipMethSaveBtnPOM(){
        // Press Checkout button //
        return Hooks.driver.findElement(checkoutShipMethSaveBtn);
    }

    public static WebElement checkoutPayMethSelPOM(){
        // Press Checkout button //
        return Hooks.driver.findElement(checkoutPayMethSel);
    }

    public static WebElement checkoutPayMethSaveBtnPOM(){
        // Press Checkout button //
        return Hooks.driver.findElement(checkoutPayMethSaveBtn);
    }

    public static WebElement checkoutCardTypePOM(){
        // Press Checkout button //
        return Hooks.driver.findElement(checkoutCardType);
    }

    public static WebElement checkoutCardHolderNamePOM(){
        // Press Checkout button //
        return Hooks.driver.findElement(checkoutCardHolderName);
    }

    public static WebElement checkoutCardNoPOM(){
        // Press Checkout button //
        return Hooks.driver.findElement(checkoutCardNo);
    }

}