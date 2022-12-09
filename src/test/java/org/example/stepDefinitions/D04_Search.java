package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D04_Search {
    P03_HomePage search = new P03_HomePage();

    @Given("user click on search field")
    public void clickSearchField()
    {
        search.searchField().click();
    }
    @When("^user enter item name like \"(.*)\" to search for it$")
    public void enterItemName(String itemName)
    {
        search.searchField().sendKeys(itemName);
    }
    @And("user click on search button")
    public void clickOnSearchButton() throws InterruptedException {
        search.searchButton().click();
        Thread.sleep(4000);
    }
    @Then("^user redirected to result search page \"(.*)\"$")
    public void redirectPage(String url)
    {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains(url));
        soft.assertAll();
    }
    @And("^user could find relative items to his search \"(.*)\"$")
    public void searchResult(String item)
    {
        int numberOfItems = search.searchResultItems().size();
        for (int x=0;x<numberOfItems;x++)
        {
            String itemName = search.searchResultItems().get(x).getText().toLowerCase();
            Assert.assertTrue(itemName.contains(item.toLowerCase()));
        }
    }
    @And("^user could find relative items using sku search \"(.*)\"$")
    public void skuResult(String sku)
    {
        search.searchResultItem().click();
        Assert.assertTrue(search.itemSKU().getText().contains(sku));
    }
}
