package org.example.stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class D08_SelectTags {
    P03_HomePage tags = new P03_HomePage();
    String subCategoryTxt;

    @When("this user hover to Apparel category")
    public void hoverToCategory() throws InterruptedException {
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(tags.apparelCategory()).perform();
        Thread.sleep(2000);
    }
    @And("this user selects Shoes subcategory")
    public void selectSubCategory()
    {
        subCategoryTxt = tags.shoesSubCategory().getText().toLowerCase().trim();
        tags.shoesSubCategory().click();
    }
    @Then("^this user should be redirected to subcategory page \"(.*)\"$")
    public void subCategoryPage(String url)
    {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),url);
        String subTitle = tags.shoesSubTitle().getText().toLowerCase().trim();
        Assert.assertTrue(subTitle.contains(subCategoryTxt));
    }
    @And("this user clicks on one of the popular tags")
    public void clickonAwesomeTag(){
        Hooks.driver.findElement(By.cssSelector("a[href*=\"/awesome\"]")).click();
    }
    @Then("the tagged item appears")
    public void checkifTheitemAppeared(){
        Assert.assertTrue(Hooks.driver.findElement(By.cssSelector("a[href*=\"/build-your-own-computer\"]")).isDisplayed());
    }
    @And("this user clicks on a different tag")
    public void clickonCoolTag(){
        Hooks.driver.findElement(By.cssSelector("a[href*=\"/cool\"]")).click();
    }
    @Then("the different tagged item appears")
    public void checkifTheitemAppeared2(){
        Assert.assertTrue(Hooks.driver.findElement(By.cssSelector("a[href*=\"/leica-t-mirrorless-digital-camera\"]")).isDisplayed());
    }
}
