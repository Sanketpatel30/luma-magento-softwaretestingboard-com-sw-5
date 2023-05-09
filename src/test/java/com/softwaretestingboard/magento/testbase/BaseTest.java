package com.softwaretestingboard.magento.testbase;

import com.softwaretestingboard.magento.propertyreader.PropertyReader;

import com.softwaretestingboard.magento.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }

    public void selectBrowser(String browser) {
    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }

    public void closeBrowser() {
    }
}
