package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.Random;

public class CheckOutPage extends Utility {


    private static final Logger log= LogManager.getLogger(CheckOutPage.class.getName());

    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstNameField;
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastNameField ;
    @FindBy(id = "BillingNewAddress_Email")
    WebElement emailIdField;
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement country;
    @FindBy(id ="BillingNewAddress_City" )
    WebElement cityField;
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement addressField;
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement postalCodeField;
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumberField;
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement continueButton;
    @FindBy(xpath ="(//input[contains(@id,'shippingoption')])[2]" )
    WebElement nextDayAirRadioButton;
    @FindBy(xpath = "//button[@onclick='ShippingMethod.save()']")
    WebElement shippingContinueButton;
    @FindBy(xpath = "(//input[contains(@id,'paymentmethod')])[2]")
    WebElement creditCardRadioButton;
    @FindBy(xpath = "//button[@onclick='PaymentMethod.save()']")
    WebElement paymentMethodContinueButton;
    @FindBy(id ="CreditCardType" )
    WebElement selectCreditCard;
    @FindBy(id = "CardholderName")
    WebElement cardHolderNameField;
    @FindBy(id = "CardNumber")
    WebElement cardNumberField;
    @FindBy(id = "ExpireMonth")
    WebElement expireMonthField;
    @FindBy(id = "ExpireYear")
    WebElement expireYearField;
    @FindBy(id = "CardCode")
    WebElement cardCodeField;
    @FindBy(xpath = "//button[@onclick='PaymentInfo.save()']")
    WebElement paymentConfirmationButton;
    @FindBy(xpath ="//li[@class='payment-method']" )
    WebElement paymentMethodConformationText;
    @FindBy(xpath = "//li[@class='shipping-method']")
    WebElement shippingMethodConformationText;
    @FindBy(xpath ="//span[@class='value-summary']/child::strong" )
    WebElement totalPriceText;
    @FindBy(xpath ="//button[@onclick='ConfirmOrder.save()']" )
    WebElement confirmOrderButton;




    public void enterFirstName(String firstname){

        Reporter.log("Enter firstname "+firstname+" in first field"+firstNameField.toString()+"<br>");
        log.info("Enter firstname "+firstname+" in first field"+firstNameField.toString());
        sendTextToElement(firstNameField,firstname);
    }
    public void enterLastName(String lastName){
        Reporter.log("Enter last name "+lastName+" in last name field"+lastNameField.toString()+"<br>");
        log.info("Enter last name "+lastName+" in last name field"+lastNameField.toString());
        sendTextToElement(lastNameField,lastName);
    }
    public void enterEmailID(String username,String domain){

        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        Reporter.log("Send email id "+username+"random number"+randomInt+"Domain"+domain+"In emailid field "+emailIdField.toString()+"<br>");
        log.info("Send email id "+username+"random number"+randomInt+"Domain"+domain+"In emailid field "+emailIdField.toString());
        sendTextToElement(emailIdField,username+ randomInt +domain);
    }

    public void selectCountryFromDropDown(String visibleText ){
        Reporter.log("Select visible text "+visibleText+" In country field "+country.toString()+"<br>");
        log.info("Select visible text "+visibleText+" In country field "+country.toString());
        selectByVisibleTextFromDropDown(country,visibleText);
    }
    public void enterCityName(String cityName){
        Reporter.log("Enter city name "+cityName+" in city field"+cityField.toString()+"<br>");
        log.info("Enter city name "+cityName+" in city field"+cityField.toString());
        sendTextToElement(cityField,cityName);
    }
    public void enterAddress(String address){
        Reporter.log("Enter address"+address+" in address field"+addressField.toString()+"<br>");
        log.info("Enter address"+address+" in address field"+addressField.toString());
        sendTextToElement(addressField,address);
    }
    public void enterPostCode(String postalCode){
        Reporter.log("Enter post code"+postalCode+" in postal code field"+postalCodeField.toString()+"<br>");
        log.info("Enter post code"+postalCode+" in postal code field"+postalCodeField.toString());
        sendTextToElement(postalCodeField, postalCode);
    }
    public void enterPhoneNumber(String phoneNumber){
        Reporter.log("Enter phone number"+phoneNumber+" in phone number field"+phoneNumberField.toString()+"<br>");
        log.info("Enter phone number"+phoneNumber+" in phone number field"+phoneNumberField.toString());
        sendTextToElement(phoneNumberField,phoneNumber);
    }

    public void selectContinueButton(){

        Reporter.log("Clicking on continue button "+continueButton.toString()+"<br>");
        log.info("Clicking on continue button "+continueButton.toString());
        clickOnElement(continueButton);
    }

    public void selectNextDayAirRadioButton(){

        Reporter.log("Clicking on next day air delivery radio button "+nextDayAirRadioButton.toString()+"<br>");
        log.info("Clicking on next day air delivery radio button "+nextDayAirRadioButton.toString());
        clickOnElement(nextDayAirRadioButton);
    }

    public void selectShippingContinueButton(){

        Reporter.log("Clicking on shipping continue button "+shippingContinueButton.toString()+"<br>");
        log.info("Clicking on shipping continue button "+shippingContinueButton.toString());
        clickOnElement(shippingContinueButton);
    }

    public void selectCreditCardRadioButton(){

        Reporter.log("Clicking on credit card radio button "+creditCardRadioButton.toString()+"<br>");
        log.info("Clicking on credit card radio button "+creditCardRadioButton.toString());
        clickOnElement(creditCardRadioButton);
    }

    public void selectPaymentContinueButton(){

        Reporter.log("Clicking on payment continue button "+paymentMethodContinueButton.toString()+"<br>");
        log.info("Clicking on payment continue button "+paymentMethodContinueButton.toString());
        clickOnElement(paymentMethodContinueButton);
    }

    public void selectCardFromDropDown(String value){

        Reporter.log("Select card "+value+" from drop down "+selectCreditCard.toString()+"<br>");
        log.info("Select card "+value+" from drop down "+selectCreditCard.toString());
        selectByValueFromDropDown(selectCreditCard,value);
    }

    public void enterCardHolderName(String cardHolderName){
        Reporter.log("Send text "+cardHolderName+" In card holder field "+cardHolderNameField.toString()+"<br>");
        log.info("Send text "+cardHolderName+" In card holder field "+cardHolderNameField.toString());
        sendTextToElement(cardHolderNameField,cardHolderName);
    }

    public void enterCardNumber(String cardNumber){
        Reporter.log("Send text "+cardNumber+" In card number field "+cardNumberField.toString()+"<br>");
        log.info("Send text "+cardNumber+" In card number field "+cardNumberField.toString());
        sendTextToElement(cardNumberField,cardNumber);
    }

    public void enterExpireMonth(String expireMonth){
        Reporter.log("Send text "+expireMonth+" In expire month field "+expireMonthField.toString()+"<br>");
        log.info("Send text "+expireMonth+" In expire month field "+expireMonthField.toString());
        sendTextToElement(expireMonthField,expireMonth);
    }

    public void enterExpireYear(String expireYear){
        Reporter.log("Send text "+expireYear+" In expire year field "+expireYear.toString()+"<br>");
        log.info("Send text "+expireYear+" In expire year field "+expireYear.toString());
        sendTextToElement(expireYearField,expireYear);
    }

    public void enterCardCode(String cardCode){
        Reporter.log("Send text "+cardCode+" In card code field "+cardCodeField.toString()+"<br>");
        log.info("Send text "+cardCode+" In card code field "+cardCodeField.toString());
        sendTextToElement(cardCodeField,cardCode);
    }

    public void clickOnPaymentConfirmationButton(){

        Reporter.log("Clicking on payment confirmation button "+paymentConfirmationButton.toString()+"<br>");
        log.info("Clicking on payment confirmation button "+paymentConfirmationButton.toString());
        clickOnElement(paymentConfirmationButton);
    }

    public String getTextFromPaymentMethod(){
        Reporter.log("Getting payment method confirmation text from "+paymentMethodContinueButton.toString()+"<br>");
        log.info("Getting payment method confirmation text from "+paymentMethodContinueButton.toString());
        return getTextFromElement(paymentMethodConformationText);
    }

    public String getTextFromShippingMethod(){
        Reporter.log("Getting shipping method confirmation text from "+shippingMethodConformationText.toString()+"<br>");
        log.info("Getting shipping method confirmation text from "+shippingMethodConformationText.toString());
        return getTextFromElement(shippingMethodConformationText);
    }

    public String getTextFromTotalPrice(){
        Reporter.log("Getting total price text from "+totalPriceText.toString()+"<br>");
        log.info("Getting total price text from "+totalPriceText.toString());
        return getTextFromElement(totalPriceText);
    }

    public void selectConfirmOrderButton(){

        Reporter.log("Clicking on confirm order button "+confirmOrderButton.toString()+"<br>");
        log.info("Clicking on confirm order button "+confirmOrderButton.toString());
        clickOnElement(confirmOrderButton);
    }
}
