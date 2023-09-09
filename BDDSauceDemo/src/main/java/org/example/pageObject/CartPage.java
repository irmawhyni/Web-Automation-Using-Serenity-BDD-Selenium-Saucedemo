package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    public static WebDriver webDriver;

    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private WebElement bttnCartTshirt;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    private WebElement bttnCartLabs;

    @FindBy(xpath = "//a[.='2']")
    private WebElement bttnShoppingCart;

    @FindBy(xpath = "//span[@class='title']")
    private WebElement yourShoppingCartPage;

    @FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
    private WebElement bttnRemove;

    public void clickButtonCartTshirt(){
        bttnCartTshirt.click();
    }

    public void clickButtonCartLabs(){
        bttnCartLabs.click();
    }

    public void clickButtonShoppingCart(){
        bttnShoppingCart.click();
    }

    public boolean verifyYourCartPage(){
        return yourShoppingCartPage.isDisplayed();
    }

    public void clickButtonRemove(){
        bttnRemove.click();
    }

}
