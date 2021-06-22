package com.nopcommerce.demo.testSuite;

import com.nopcommerce.demo.customListener.CustomListener;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.retryAnalyzer.RetryAnalyzer;
import com.nopcommerce.demo.testBase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class TestTopMenu extends TestBase {

    HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        homePage=new HomePage();
    }

    @Test(groups = {"sanity","smoke","regression"},retryAnalyzer = RetryAnalyzer.class)
    public void selectMenuAndClick() throws InterruptedException {
        String expectedText=homePage.selectMenu("Computers");
        Thread.sleep(500);
        String actualText=homePage.getActualText();
        Assert.assertEquals(expectedText,actualText);

    }
}
