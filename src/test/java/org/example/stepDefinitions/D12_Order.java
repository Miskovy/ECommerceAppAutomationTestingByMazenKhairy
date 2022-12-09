package org.example.stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P04_CheckoutPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class D12_Order {
P04_CheckoutPage order = new P04_CheckoutPage();
@When("user click on add to cart for the item \"Apple MacBook Pro 13-inch\"")
    public void addtocartitem(){
    Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/div[3]/div[2]/button[1]")).click();
}
@And("user clicks again on the second add to cart")
    public void addtocartitem2(){
    Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[9]/div[2]/button")).click();
}
@Then("success message is shown to inform user that item has been added to cart")
    public void assertsuccessMSG(){
    Assert.assertTrue(Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).isDisplayed());
}
    @And("^color of success message should be \"(.*)\"$")
    public void assertsucessMSG_color(String color){
        SoftAssert soft = new SoftAssert();
        String rgba = Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getCssValue("background-color");
        String hex = Color.fromString(rgba).asHex();
        soft.assertEquals(hex,color,"Color is not matched");
        soft.assertAll();
    }
    @Then("user click on shopping cart")
    public void clickonshoppingcart() throws InterruptedException {
    Thread.sleep(5000);
    Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[4]/a/span[1]")).click();
    }
    @Then("^user is redirected to shopping cart page \"(.*)\"$")
    public void assertcurrentpage(String url3){
        SoftAssert sAssert= new SoftAssert();
        sAssert.assertEquals(Hooks.driver.getCurrentUrl(),url3);
        sAssert.assertAll();
    }
    @And("user clicks on agree button")
    public void clickonagreetoterms(){
    Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[3]/div[2]/div[3]/input")).click();
    }
    @And("user clicks on checkout button")
    public void checkoutbtnclick(){
    Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[3]/div[2]/div[4]/button")).click();
    }
    @And("user clicks on checkout as guest button")
    public void checkoutasguestclick(){
    Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]")).click();
    }
    @Then("^user is redirected to \"(.*)\"$")
    public void assertcurrentpage2(String url4){
        SoftAssert sAssert3= new SoftAssert();
        sAssert3.assertEquals(Hooks.driver.getCurrentUrl(),url4);
        sAssert3.assertAll();
    }
    @When("^the user enter first name \"(.*)\" and last name \"(.*)\"$")
    public void enteringnames(String firstname2,String lastname2){
        order.firstNameTxt().sendKeys(firstname2);
        order.lastNameTxt().sendKeys(lastname2);
    }
    @And("^the user enter email \"(.*)\"$")
    public void enteremail(String email2){
        order.emailTxt().sendKeys(email2);
    }
    @And("^the user enter the country \"(.*)\"$")
    public void entercountry(String countryname){
        Select select2 = new Select(order.country());
        select2.selectByVisibleText(countryname);
    }
    @And("^the user enter the city \"(.*)\"$")
    public void entercity(String cityname){
    order.city().sendKeys(cityname);
    }
    @And("^the user enter the address 1 \"(.*)\"$")
    public void enteraddress(String address){
    order.address().sendKeys(address);
    }
    @And("^the user enter the zip/postal code \"(.*)\"$")
    public void enterzippostalcode(String code){
    order.zippostalcode().sendKeys(code);
    }
    @And("^the user enter the phone number \"(.*)\"$")
    public void enterphonenumber(String phonenum){
    order.phonenumber().sendKeys(phonenum);
    }
    @And("the user clicks on continue button")
    public void clickcontinue() throws InterruptedException {
    Thread.sleep(2000);
    order.continuebtn1().click();
    }
    @And("the user clicks again on continue button")
    public void clickcontinue2() throws InterruptedException {
    Thread.sleep(2000);
    order.continuebtn2().click();
    }
    @And("the user click on continue choosing to pay by cheque")
    public void clickcontinue3() throws InterruptedException {
    Thread.sleep(2000);
    order.continuebtn3().click();
    }
    @And("the user clicks on continue button again")
    public void clickcontinue4() throws InterruptedException {
    Thread.sleep(1000);
    order.continuebtn4().click();
    }
    @Then("the user finally confirms his order")
    public void confirmbtnclick() throws InterruptedException {
    Thread.sleep(1000);
    order.confirmbtn().click();
    }
    @Then("success message is shown")
    public void assertsuccessMSG2(){
        Assert.assertTrue(Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong")).isDisplayed());
    }
}
