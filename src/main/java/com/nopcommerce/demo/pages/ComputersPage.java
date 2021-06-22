package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputersPage extends Utility {


    @FindBy(xpath ="//h2[@class='title']/a[@href='/desktops']")
    WebElement desktopLink;

    private static final Logger log= LogManager.getLogger(ComputersPage.class.getName());

    public void clickOnDesktop(){

        Reporter.log("Clicking on desktopLink"+desktopLink.toString()+"<br>");
        log.info("Clicking on desktopLink"+desktopLink.toString());
        clickOnElement(desktopLink);
    }
}
