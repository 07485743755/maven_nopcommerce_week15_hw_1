package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.testng.Reporter;

import java.util.List;

public class BuildYourOwnComputerPage extends Utility {


    private static final Logger log= LogManager.getLogger(BuildYourOwnComputerPage.class.getName());

    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement welcomeText;

    @FindBy(xpath = "(//select[contains(@id,'product_attribute')])[1]")
    WebElement processorAttribute;

    @FindBy(xpath = "(//select[contains(@id,'product_attribute')])[2]")
    WebElement ramAttribute;

    @FindBys({@FindBy(xpath = "(//ul[@class='option-list'])[1]//label")})
    List<WebElement> hDDRadioButton;

    @FindBys({@FindBy( xpath = "(//ul[@class='option-list'])[2]//label")})
    List< WebElement > oSRadioButton;

    @FindBys({@FindBy( xpath = "(//ul[@class='option-list'])[3]//label")})
    List<WebElement > softwareCheckBox;

    @FindBy(xpath = "(//input[contains(@id,'product_attribute')])[7]")
    WebElement checkBoxTotalCommander;

    @FindBy(xpath = "//span[contains(@id,'price-value')]")
    WebElement priceLink;

    @FindBy(xpath = "//button[contains(@id,'add-to-cart-button')]")
    WebElement addToCartButton;

    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement popUpTextFromAddToCart;

    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement popUpCloseButton;

    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement shoppingCartLink;

    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement goToCartButton;

    public String getWelcomeText(){

        Reporter.log("Getting welcome text "+welcomeText.toString()+"<br>");
        log.info("Getting welcome text "+welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void selectProcessor(String value){
        Reporter.log("Select processor from drop down "+processorAttribute.toString()+"<br>");
        log.info("Select processor from drop down "+processorAttribute.toString());
        selectByValueFromDropDown(processorAttribute,value);
    }

    public void selectRamFromDropDown(String value){
        Reporter.log("Select ram from drop down "+ramAttribute.toString()+"<br>");
        log.info("Select ram from drop down: "+ramAttribute.toString());
        selectByValueFromDropDown(ramAttribute,value);
    }

    public void selectHddRadioButton(String hdd) {

        for (WebElement element : hDDRadioButton) {
            Reporter.log("Getting text"+element.getText()+"From element "+element.getText()+" and compare with hdd"+hdd+"<br>");
            log.info("Getting text"+element.getText()+"From element "+element.getText()+" and compare with hdd"+hdd);
            if (element.getText().equalsIgnoreCase(hdd)) {
                Reporter.log("Clicking on element "+element.toString()+"<br>");
                log.info("Clicking on element "+element.toString());
                element.click();
                break;
            }
        }
    }

    public void selectOsRadioButton(String os) {

        for (WebElement element : oSRadioButton) {
            Reporter.log("Getting text"+element.getText()+"From element "+element.getText()+" and compare with os"+os+"<br>");
            log.info("Getting text"+element.getText()+"From element "+element.getText()+" and compare with os"+os);
            if (element.getText().equalsIgnoreCase(os)) {
                Reporter.log("Clicking on element "+element.toString()+"<br>");
                log.info("Clicking on element "+element.toString());
                element.click();
                break;
            }
        }
    }

    public void selectSoftwareCheckBox(String software) {


        for (WebElement element : softwareCheckBox) {
            Reporter.log("Getting text"+element.getText()+"From element "+element.getText()+" and compare with software"+software+"<br>");
            log.info("Getting text"+element.getText()+"From element "+element.getText()+" and compare with software"+software);
            if (element.getText().equalsIgnoreCase(software)) {

                if(!element.isSelected()){
                    Reporter.log("Clicking on element "+element.toString()+"<br>");
                    log.info("Clicking on element "+element.toString());
                    element.click();
                }
                break;
            }
        }
    }


    /*public void checkOnCheckBoxMicroSoftOffice(){

        WebElement microSoftOfficeCheckBox=driver.findElement(checkBoxMicroSoftOffice);
        if(!microSoftOfficeCheckBox.isSelected()){
            microSoftOfficeCheckBox.click();
        }
    }

    public void checkOnCheckBoxTotalCommander(){

        Reporter.log();
        clickOnElement(waitUntilVisibilityOfElementLocated(checkBoxTotalCommander,30));
    }*/

    public String getTextFromPrice(){
        Reporter.log("Getting price text from "+priceLink.toString()+"<br>");
        log.info("Getting price text from "+priceLink.toString());
        return getTextFromElement(priceLink);
    }

    public void selectAddToCart(){

        Reporter.log("Clicking on add to cart button "+addToCartButton.toString()+"<br>");
        log.info("Clicking on add to cart button "+addToCartButton.toString());
        clickOnElement(addToCartButton);
    }

    public String getTextFromAddToCartPopup(){
        Reporter.log("Getting popup text from "+popUpTextFromAddToCart.toString()+"<br>");
        log.info("Getting popup text from "+popUpTextFromAddToCart.toString());
        return getTextFromElement(popUpTextFromAddToCart);
    }

    public void setPopUpCloseButton(){

        Reporter.log(("Accept pop up close button "+popUpCloseButton.toString()+"<br>"));
        log.info(("Accept pop up close button "+popUpCloseButton.toString()));
        clickOnElement(popUpCloseButton);
    }

    public void mouseHoverOnShoppingCart(){
        Reporter.log("Mouse hover to shopping cart link "+shoppingCartLink.toString()+"<br>");
        log.info("Mouse hover to shopping cart link "+shoppingCartLink.toString());
        mouseHoverToElement(shoppingCartLink);
    }

    public void selectGoToCartButton(){
        Reporter.log("Clicking on go to cart button "+goToCartButton.toString()+"<br>");
        log.info("Clicking on go to cart button "+goToCartButton.toString());
        clickOnElement(goToCartButton);
    }
}
