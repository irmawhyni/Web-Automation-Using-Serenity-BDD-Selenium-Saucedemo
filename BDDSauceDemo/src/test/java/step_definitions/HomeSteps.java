package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.HomePage;
import org.openqa.selenium.WebDriver;

public class HomeSteps {

    private final WebDriver driver = Hooks.driver;

    HomePage homePage = new HomePage(driver);

    @Then("User filter list product by {string}")
    public void selectFilterProduct(String filterProduct) throws InterruptedException {
        homePage.selectFilterProduct(filterProduct);
        Thread.sleep(3000);
    }
}
