package StepDefinition;

import Pages.P12_OrderChechOut;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class SD12_OrderCheckout {

    P12_OrderChechOut p12_orderChechOut = new P12_OrderChechOut();
    public static String city = "Cairo";
    public static String address1 = "Masr Elgdeda";
    public static String postCode = "11777";
    public static String phoneNo = "012345678911";
    public static String faxNo = "12345678";
    public static String cardHolderName = "Merna Hesham";
    public static String cardNumber = "9999999999";
    public static String cardCode = "999";

    @And("open shopping page")
    public void open_shopping_page(){
        Hooks.driver.get("https://demo.nopcommerce.com/cart");
    }

    @When("user agrees with terms and proceed to Checkout")
    public void user_agrees_with_terms_and_proceed_to_Checkout()  {
        p12_orderChechOut.checkoutTermsPOM().click();
        p12_orderChechOut.checkoutBtnPOM().click();

        //System.out.println("Welcome in Checkout Page!");
    }

    @And("user types Billing address to Create Order")
    public void user_types_Billing_address_to_Create_Order() {
        // Enter First Name //
        p12_orderChechOut.checkoutFNamePOM().click();
        p12_orderChechOut.checkoutFNamePOM().clear();
        p12_orderChechOut.checkoutFNamePOM().sendKeys(Hooks.userFirstName);

        // Enter Last Name //
        p12_orderChechOut.checkoutLNamePOM().click();
        p12_orderChechOut.checkoutLNamePOM().clear();
        p12_orderChechOut.checkoutLNamePOM().sendKeys(Hooks.userLastName);

        // Write valid Email //
        p12_orderChechOut.checkoutMailPOM().click();
        p12_orderChechOut.checkoutMailPOM().clear();
        p12_orderChechOut.checkoutMailPOM().sendKeys(Hooks.userValidEmail);

        Select country = new Select(p12_orderChechOut.checkoutCountryPOM());
        country.selectByVisibleText("Egypt"); //Select Country Name using visible text
        Hooks.sleep(5000);

        // Enter City //
        p12_orderChechOut.checkoutCityPOM().click();
        p12_orderChechOut.checkoutCityPOM().clear();
        p12_orderChechOut.checkoutCityPOM().sendKeys(city);

        // Write Address_1 //
        p12_orderChechOut.checkoutAddressPOM().click();
        p12_orderChechOut.checkoutAddressPOM().clear();
        p12_orderChechOut.checkoutAddressPOM().sendKeys(address1);

        // Enter Postal Code //
        p12_orderChechOut.checkoutPostCodePOM().click();
        p12_orderChechOut.checkoutPostCodePOM().clear();
        p12_orderChechOut.checkoutPostCodePOM().sendKeys(postCode);

        // Write Phone Number //
        p12_orderChechOut.checkoutPhoneNoPOM().click();
        p12_orderChechOut.checkoutPhoneNoPOM().clear();
        p12_orderChechOut.checkoutPhoneNoPOM().sendKeys(phoneNo);

        // Write Fax Number //
        p12_orderChechOut.checkoutFaxNoPOM().click();
        p12_orderChechOut.checkoutFaxNoPOM().clear();
        p12_orderChechOut.checkoutFaxNoPOM().sendKeys(faxNo);
    }

    @And("user confirms Billing address")
    public void user_confirms_Billing_address() {
        p12_orderChechOut.checkoutBillAddSaveBtnPOM().click();
        Hooks.sleep(3000);
    }

    @And("user chooses Shipping Method to Continue")
    public void user_chooses_Shipping_Method_to_Continue() {
        // Select Shipping Method and Continue //
        // Select Shipping Method (Next Day Air ($0.00)) //
        p12_orderChechOut.checkoutShipMethSelPOM().click();

        // Press CONTINUE //
        p12_orderChechOut.checkoutShipMethSaveBtnPOM().click();
        Hooks.sleep(3000);
    }

    @And("user chooses Payment Method to Continue")
    public void user_chooses_Payment_Method_to_Continue() {
        // Select Payment Method (Pay by Credit Card)) //
        p12_orderChechOut.checkoutPayMethSelPOM().click();

        // Press CONTINUE //
        p12_orderChechOut.checkoutPayMethSaveBtnPOM().click();
        Hooks.sleep(3000);
    }

    @And("user fills out Payment Information")
    public void user_fills_out_Payment_Information() {
        // Select Credit Card Type //
        Select card = new Select(p12_orderChechOut.checkoutCardTypePOM());
        card.selectByValue("MasterCard"); //Select Credit Card Type from Value

        // Write Cardholder Name //
        p12_orderChechOut.checkoutCardHolderNamePOM().click();
        p12_orderChechOut.checkoutCardHolderNamePOM().clear();
        p12_orderChechOut.checkoutCardHolderNamePOM().sendKeys(cardHolderName);

        // Enter Card Number //
        p12_orderChechOut.checkoutCardNoPOM().click();
        p12_orderChechOut.checkoutCardNoPOM().clear();
        p12_orderChechOut.checkoutCardNoPOM().sendKeys(cardNumber);

        // Select Card Expiration Month //
        Select month = new Select(p12_orderChechOut.checkoutCardExpMonthPOM());
        month.selectByValue("8"); //Select Card Expiration Month from Value

        // Select Card Expiration Year //
        Select year = new Select(p12_orderChechOut.checkoutCardExpYearPOM());
        year.selectByValue("2023"); //Select Card Expiration Year from Value

        // Write Card Code //
        p12_orderChechOut.checkoutCardCodePOM().click();
        p12_orderChechOut.checkoutCardCodePOM().clear();
        p12_orderChechOut.checkoutCardCodePOM().sendKeys(cardCode);

        // Press CONTINUE //
        p12_orderChechOut.checkoutPaymentSaveBtnPOM().click();

        System.out.println("Create Successful Order!");
    }

    @Then("user confirms his order")
    public void user_confirms_his_order() {
        p12_orderChechOut.checkoutOrderConfirmBtnPOM().click();
        System.out.println("Your order has been successfully processed!");
    }

    @And("user checks order details")
    public void user_checks_order_details() {
        // Click for order details //
        p12_orderChechOut.checkoutOrderDetailsPOM().click();
        System.out.println("Title of page is: " + Hooks.driver.getTitle());
    }

    @And("user saves invoice")
    public void user_saves_invoice() {
        p12_orderChechOut.checkoutInvoiceSavePOM().click();
        Hooks.sleep(3000);
        System.out.println("PDF Invoice has been downloaded Successfully");
    }

    @And("user prints invoice")
    public void user_prints_invoice() {
        p12_orderChechOut.checkoutInvoicePrintPOM().click();
        Hooks.sleep(3000);
        System.out.println("Invoice has been printed Successfully");
    }
}