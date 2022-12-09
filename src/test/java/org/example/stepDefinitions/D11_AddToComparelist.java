package org.example.stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;


public class D11_AddToComparelist {
    P03_HomePage compare = new P03_HomePage();

    @When("user click on compare button for item \"HTC One M8 Android L 5.0 Lollipop\"")
    public void clickCompare() throws InterruptedException {
        compare.comparelistBtn().click();
        Thread.sleep(3000);
    }
    @And("user click on compare button for item \"Apple MacBook Pro 13-inch\"")
    public void clickcompare2(){
        compare.comparelistBtn2().click();
    }
    @Then("success message is shown to inform user that item has been added to compare list")
    public void successmsg_shown2(){
        SoftAssert soft2 = new SoftAssert();
        soft2.assertTrue(compare.successMSG().isDisplayed());
        soft2.assertAll();
    }
    @And("^color of comparelist success message should be \"(.*)\"$")
    public void successMSG_Color(String color)
    {
        SoftAssert soft = new SoftAssert();
        String rgba = compare.successMSG().getCssValue("background-color");
        String hex = Color.fromString(rgba).asHex();
        soft.assertEquals(hex,color,"Color is not matched");
        soft.assertAll();
    }
    @Then("user click on compare list button on the bar to show the compared items")
    public void gotocomparelist(){
        compare.comparelistlink().click();
    }
    @Then("^user redirected to comparelist page \"(.*)\"$")
    public void assertcomparelistpage(String url2){
        SoftAssert sAssert2= new SoftAssert();
        sAssert2.assertEquals(Hooks.driver.getCurrentUrl(),url2);
        sAssert2.assertAll();
    }

}
