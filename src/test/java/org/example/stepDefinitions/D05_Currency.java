package org.example.stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class D05_Currency {
    P03_HomePage currency = new P03_HomePage();

    @Given("user navigates to home page")
    public void navigateHome()
    {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
    }
    @When("user select currency from dropdown list")
    public void selectEuro() throws InterruptedException {
        Select select = new Select(currency.currencySelection());
        select.selectByVisibleText("Euro");
        Thread.sleep(3000);
    }
    @Then("prices of shown items should be in euro currency")
    public void euroPrice()
    {
        int numberOfProducts = currency.productPrice().size();
        for (int x=0;x<numberOfProducts;x++)
        {
            String txt = currency.productPrice().get(x).getText();
            Assert.assertTrue(txt.contains("€"));
        }
    }
}
