package org.example.stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class D09_AddToCart {
    P03_HomePage addtocart = new P03_HomePage();
    String subCategoryTxt;

    @When("the user hover to Apparel category")
    public void hoverToCategory() throws InterruptedException {
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(addtocart.apparelCategory()).perform();
        Thread.sleep(2000);
    }
    @And("the user selects Shoes subcategory")
    public void selectSubCategory()
    {
        subCategoryTxt = addtocart.shoesSubCategory().getText().toLowerCase().trim();
        addtocart.shoesSubCategory().click();
    }
    @Then("^the user should be redirected to subcategory page \"(.*)\"$")
    public void subCategoryPage(String url)
    {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),url);
        String subTitle = addtocart.shoesSubTitle().getText().toLowerCase().trim();
        Assert.assertTrue(subTitle.contains(subCategoryTxt));
    }
    @And("the user clicks on add to cart button")
    public void Addtocartbtn(){
        addtocart.addtocartbtn1().click();
    }
    @Then("the total shopping cart items equals to 1")
    public void checknumofitems() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(addtocart.quantity2().getText(), "(1)");
    }
}
