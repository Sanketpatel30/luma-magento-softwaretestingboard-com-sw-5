package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Women')]")
    WebElement WomenMenuOption;
    public void mouseHoverOnWomenMenuTab() {
        CustomListeners.test.log(Status.PASS, "Mouse Hover On Women Menu Tab");
        Reporter.log("Mouse Hover On Women Menu Tab" + WomenMenuOption.toString());
        mouseHoverToElement(WomenMenuOption);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
    WebElement mouseHoverOnTopMenuOption;
    public void mouseHoverOnWomenTopMenuOption() {
        CustomListeners.test.log(Status.PASS, "Mouse Hover On Women Top Menu Option");
        Reporter.log("Mouse Hover On Women Top Menu Option" + mouseHoverOnBottomsMenuOption.toString());
        mouseHoverToElement(mouseHoverOnTopMenuOption);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']")
    WebElement jacketsOption;
    public void setJacketsOption() {
        CustomListeners.test.log(Status.PASS, "Set Jackets Option");
        Reporter.log("Set Jackets Option" + jacketsOption.toString());
        clickOnElement(jacketsOption);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]")
    WebElement sortProductNameInDropDownOption;
    public void productSortByProductName(String product) {
        CustomListeners.test.log(Status.PASS, "Product Sort By Product Name");
        Reporter.log("Product Sort By Product Name" + sortProductNameInDropDownOption.toString());
        selectByVisibleTextFromDropDown(sortProductNameInDropDownOption, product);
    }

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Men']")
    WebElement menMenuOption;
    public void mouseHoverOnMenMenuTab() {
        CustomListeners.test.log(Status.PASS, "Mouse Hover on Men Menu Tab");
        Reporter.log("Mouse Hover On Men Menu Tab" + menMenuOption.toString());
        mouseHoverToElement(menMenuOption);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']")
    WebElement mouseHoverOnBottomsMenuOption;
    public void mouseHoverOnMenBottomsMenuOption() {
        CustomListeners.test.log(Status.PASS, "Mouse Hover On Men Bottoms Menu Option");
        Reporter.log("Mouse Hover On Men Bottoms Menu Option" + mouseHoverOnBottomsMenuOption.toString());
        mouseHoverToElement(mouseHoverOnBottomsMenuOption);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pantsOption;
    public void setPantsOption() {
        CustomListeners.test.log(Status.PASS, "Set Pants Option");
        Reporter.log("Set Pants Option" + pantsOption.toString());
        clickOnElement(pantsOption);
    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement mouseHoverOnProductNameOption;
    public void mouseHoverOnMenPantsProductNameOption() {
        CustomListeners.test.log(Status.PASS, "Mouse Hover On Men Pants Product Name Option");
        Reporter.log("Mouse Hover On Men Pants Product Name Option" + mouseHoverAndClickOnProductNameOption.toString());
        mouseHoverToElement(mouseHoverOnProductNameOption);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-option text'])[1]")
    WebElement mouseHoverAndClickOnProductNameOption;
    public void mouseHoverOnProductNameCronusYogaPantAndClicksOnSizeOption(String pant) {
        CustomListeners.test.log(Status.PASS, "Mouse Hover On Product Name Cronus Yoga Pant And Clicks On Size Option");
        Reporter.log("Mouse Hover On Product Name Cronus Yoga Pant And Clicks On Size Option" + mouseHoverAndClickOnProductNameOption.toString());
        mouseHoverToElementAndClick(mouseHoverAndClickOnProductNameOption);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-option color'])[1]")
    WebElement mouseHoverAndClickOnColourNameOption;
    public void mouseHoverOnProductNameCronusYogaPantAndClicksOnColourOption(String pant) {
        CustomListeners.test.log(Status.PASS, "Mouse Hover On Product Name Cronus Yoga Pant And Clicks On Colour Option");
        Reporter.log("Mouse Hover On Product Name Cronus Yoga Pant And Clicks On Colour Option" + mouseHoverAndClickOnProductNameOption.toString());
        mouseHoverToElementAndClick(mouseHoverAndClickOnProductNameOption);
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Add to Cart')])[1]")
    WebElement mouseHoverAndClickOnAddToCartOption;
    public void mouseHoverOnProductNameCronusYogaPantAndClicksOnAddToCartOption() {
        CustomListeners.test.log(Status.PASS, "Mouse Hover On Product Name Cronus Yoga Pant And Clicks On Add To Cart Option");
        Reporter.log("Mouse Hover On Product Name Cronus Yoga Pant And Clicks On Add To Cart Option" + mouseHoverAndClickOnAddToCartOption.toString());
        mouseHoverToElementAndClick(mouseHoverAndClickOnAddToCartOption);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement addedToYourShoppingCartMethodText;
    public String youAddedCronusYogaPantToYourShoppingCartMethodTextMethodText() {
        CustomListeners.test.log(Status.PASS, "You Added Cronus Yoga Pant To Your Shopping Cart Method Text Method Text");
        Reporter.log("You Added Cronus Yoga Pant To Your Shopping Cart Method Text Method Text" + addedToYourShoppingCartMethodText.toString());
        return getTextFromElement(addedToYourShoppingCartMethodText);
    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCartOption;
    public void clickOnShoppingCartOption() {
        CustomListeners.test.log(Status.PASS, "Click On Shopping Cart Option");
        Reporter.log("Click On Shopping Cart Option" + pantsOption.toString());
        clickOnElement(pantsOption);
    }

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement shoppingCartTextMethod;
    public String shoppingCartText() {
        CustomListeners.test.log(Status.PASS, "Shopping Cart Text");
        Reporter.log("Shopping Cart Text" + shoppingCartTextMethod.toString());
        return getTextFromElement(shoppingCartTextMethod);
    }

    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement pantTextMethod;
    public String cronusPantText() {
        CustomListeners.test.log(Status.PASS, "Cronus Pant Text");
        Reporter.log("Cronus Pant Text" + pantTextMethod.toString());
        return getTextFromElement(pantTextMethod);
    }

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement sizeTextMethod;
    public String verifySizeText() {
        CustomListeners.test.log(Status.PASS, "Verify Size Text");
        Reporter.log("Verify Size Text" + sizeTextMethod.toString());
        return getTextFromElement(sizeTextMethod);
    }

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement colourTextMethod;
    public String verifyColourOfPantText() {
        CustomListeners.test.log(Status.PASS, "Verify Colour Of Pant Text");
        Reporter.log("Verify Colour Of Pant Text" + colourTextMethod.toString());
        return getTextFromElement(colourTextMethod);
    }

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Gear']")
    WebElement mouseHoverOnGearOption;
    public void mouseHoverOnGearMenuOption() {
        CustomListeners.test.log(Status.PASS, "Mouse Hover On Gear Menu Option");
        Reporter.log("Mouse Hover On Gear Menu Option" + mouseHoverOnGearOption.toString());
        mouseHoverToElement(mouseHoverOnGearOption);
    }

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Gear']")
    WebElement mouseHoverGearAndClickOption;
    public void mouseHoverOnGearMenuAndClicksOnBagsOption() {
        CustomListeners.test.log(Status.PASS, "Mouse Hover On Gear Menu And Clicks On Bags Option");
        Reporter.log("Mouse Hover On Gear Menu And Clicks On Bags Option" + mouseHoverAndClickOnAddToCartOption.toString());
        mouseHoverToElementAndClick(mouseHoverAndClickOnAddToCartOption);
    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
    WebElement duffleBagOption;
    public void clickOnDuffleBagOption() {
        CustomListeners.test.log(Status.PASS, "Click On Duffle Bag Option");
        Reporter.log("Click On Duffle Bag Option" + duffleBagOption.toString());
        clickOnElement(duffleBagOption);
    }

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement overNightDuffleText;
    public String verifyOvernightDuffleText() {
        CustomListeners.test.log(Status.PASS, "Verify Overnight Duffle Text");
        Reporter.log("Verify Overnight Duffle Text" + overNightDuffleText.toString());
        return getTextFromElement(overNightDuffleText);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement quantityOption;
    public void quantitySpaceOption() {
        CustomListeners.test.log(Status.PASS, "Quantity Space Option");
        Reporter.log("Quantity Space Option" + quantityOption.toString());
        clickOnElement(quantityOption);
        sendTextToElement(quantityOption, Keys.CONTROL + "a"); // Select all existing text
        sendTextToElement(quantityOption, "3"); // Type in the new text
    }

    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement youAddedText;
    public String verifyYouAddedOvernightDuffleToYourShoppingCartText() {
        CustomListeners.test.log(Status.PASS, "Verify You Added Overnight Duffle To Your Shopping Cart Text");
        Reporter.log("Verify You Added Overnight Duffle To Your Shopping Cart Text" + youAddedText.toString());
        return getTextFromElement(youAddedText);
    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement cartOption;
    public void clickOnShoppingCartLinkOption() {
        CustomListeners.test.log(Status.PASS, "Click On Shopping Cart Link Option");
        Reporter.log("Click On Shopping Cart Link Option" + cartOption.toString());
        clickOnElement(cartOption);
    }

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement nightDuffleText;
    public String verifyOvernightDuffleTextMethod() {
        CustomListeners.test.log(Status.PASS, "Verify Overnight Duffle Text Method");
        Reporter.log("Verify Overnight Duffle Text Method" + nightDuffleText.toString());
        return getTextFromElement(nightDuffleText);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@title='Qty']")
    WebElement qtyText;
    public String verifyQuantityText() {
        CustomListeners.test.log(Status.PASS, "Verify Quantity Text");
        Reporter.log("Verify Quantity Text" + qtyText.toString());
        return getTextFromElement(qtyText);
    }

    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span)[2]")
    WebElement priceText;
    public String verifyProductPrice() {
        CustomListeners.test.log(Status.PASS, "Verify Product Price");
        Reporter.log("verifyProductPrice" + priceText.toString());
        return getTextFromElement(priceText);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement qtyOption;
    public void quantityUpdateText() {
        CustomListeners.test.log(Status.PASS, "Quantity Update Text");
        Reporter.log("Quantity Update Text" + qtyOption.toString());
        clickOnElement(qtyOption);
        sendTextToElement(qtyOption, Keys.CONTROL + "a"); // Select all existing text
        sendTextToElement(qtyOption, "5"); // Type in the new text
    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shopCartOption;
    public void clickOnShoppingCartButtonOption() {
        CustomListeners.test.log(Status.PASS, "Click On Shopping Cart Button Option");
        Reporter.log("Click On Shopping Cart Button Option" + shopCartOption.toString());
        clickOnElement(shopCartOption);
    }

    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span)[2]")
    WebElement priceTextMethod;
    public String verifyUpdatedPriceText() {
        CustomListeners.test.log(Status.PASS, "Verify Updated Price Text");
        Reporter.log("Verify Updated Price Text" + priceTextMethod.toString());
        return getTextFromElement(priceTextMethod);
    }

}