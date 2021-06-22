package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CompletedPage extends Utility {

    @FindBy(xpath = "//h1[text()='Thank you']")
    WebElement thankYouText;
    @FindBy(xpath = "//strong[text()='Your order has been successfully processed!']")
    WebElement orderConfirmationText;
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;

    private static final Logger log= LogManager.getLogger(CompletedPage.class.getName());

    public String getTextFromThankYou(){
        Reporter.log("Getting thank you text from "+thankYouText.toString()+"<br>");
        log.info("Getting thank you text from "+thankYouText.toString());
        return getTextFromElement(thankYouText);
    }

    public String getTextOfOrderConfirmation(){
        Reporter.log("Getting order confirmation text from "+orderConfirmationText.toString()+"<br>");
        log.info("Getting order confirmation text from "+orderConfirmationText.toString());
        return getTextFromElement(orderConfirmationText);
    }

    public void selectContinueButton(){
        Reporter.log("Clicking on continue button"+continueButton.toString()+"<br>");
        log.info("Clicking on continue button"+continueButton.toString());
        clickOnElement(continueButton);
    }
}
