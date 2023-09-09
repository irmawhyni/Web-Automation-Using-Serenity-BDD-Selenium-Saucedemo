package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.CartPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CartSteps {

    private final WebDriver driver = Hooks.driver;

    CartPage cartPage = new CartPage(driver);

    @When("User can select item Test.allTheThings T-Shirt Red and Sauce Labs Onesie on landing page")
    public void clickButtonCartTshirt() throws InterruptedException {
        cartPage.clickButtonCartTshirt();
        cartPage.clickButtonCartLabs();
        Thread.sleep(3000);
    }

    @And("User click icon shopping cart on landing page")
    public void clickButtonShoppingCart() throws InterruptedException {
        cartPage.clickButtonShoppingCart();
        Thread.sleep(3000);
    }

    @Then("User already on shopping cart page")
    public void verifyYourShoppingCartPage() throws InterruptedException {
        Assert.assertTrue(cartPage.verifyYourCartPage());
        Thread.sleep(3000);
    }

    @And("The user removes 1 item from the shopping cart page")
    public void clickButtonRemove() throws InterruptedException {
        cartPage.clickButtonRemove();
        Thread.sleep(3000);
    }
}
