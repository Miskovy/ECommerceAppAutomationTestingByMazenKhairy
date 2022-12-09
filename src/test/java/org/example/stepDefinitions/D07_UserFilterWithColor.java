package org.example.stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;



public class D07_UserFilterWithColor {
    P03_HomePage colorfilter = new P03_HomePage();
    String subCategoryTxt;

    @When("a user hover to Apparel category")
    public void hoverToCategory() throws InterruptedException {
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(colorfilter.apparelCategory()).perform();
        Thread.sleep(2000);
    }
    @And("a user selects Shoes subcategory")
    public void selectSubCategory()
    {
        subCategoryTxt = colorfilter.shoesSubCategory().getText().toLowerCase().trim();
        colorfilter.shoesSubCategory().click();
    }
    @Then("^a user should be redirected to subcategory page \"(.*)\"$")
    public void subCategoryPage(String url)
    {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),url);
        String subTitle = colorfilter.shoesSubTitle().getText().toLowerCase().trim();
        Assert.assertTrue(subTitle.contains(subCategoryTxt));
    }
    @And("a user selects the Red color")
    public void Colorfilter(){
        colorfilter.colorFilterRed().click();
    }
    @Then("a Red color item appears")
    public void redcolorassert(){
        Assert.assertTrue(Hooks.driver.findElement(By.cssSelector("a[href*=\"/adidas-consortium-campus-80s-running-shoes\"]")).isDisplayed());
    }
}
