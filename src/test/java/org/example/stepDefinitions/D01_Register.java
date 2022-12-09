package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_Register {

    P01_register register = new P01_register();

    @Given("user go to register page")
    public void goToRegisterLink()
    {
        register.registerlink().click();
    }
    @When("^user select gender type \"(.*)\"$")
    public void chooseGender(String gender)
    {
        register.genderType(gender).click();
    }
    @And("^user enter first name \"(.*)\" and last name \"(.*)\"$")
    public void validNames(String firstname, String lastname)
    {
        register.firstNameTxt().sendKeys(firstname);
        register.lastNameTxt().sendKeys(lastname);
    }
    @And("^user enter date of birth day \"(.*)\" month \"(.*)\" year \"(.*)\"$")
    public void dateOfBirth(int day, String month, String year) {

        Select select = new Select(register.birthDay());
        select.selectByIndex(day);

        select = new Select(register.birthMonth());
        select.selectByValue(month);

        select = new Select(register.birthYear());
        select.selectByVisibleText(year);
    }
    @And("^user enter email \"(.*)\"$")
    public void enterEmail(String email)
    {
        register.emailTxt().sendKeys(email);
    }
    @And("^user fills password fields \"(.*)\" \"(.*)\"$")
    public void fillPass(String pass, String passConfirm)
    {
        register.passwordTxt().sendKeys(pass);
        register.confirmPassTxt().sendKeys(passConfirm);
    }
    @And("user clicks on register button")
    public void clkRegBtn() throws InterruptedException {
        register.registerButton().click();
        Thread.sleep(5000);
    }
    @Then("^user redirected to register completion page \"(.*)\"$")
    public void redirectPage(String url)
    {
        SoftAssert sAssert= new SoftAssert();
        sAssert.assertEquals(Hooks.driver.getCurrentUrl(),url);
        sAssert.assertAll();
    }
    @And("^a success message is displayed \"(.*)\"$")
    public void successMsg(String msg)
    {
        SoftAssert sAssert = new SoftAssert();
        sAssert.assertEquals(register.successMessage().getText(),msg);
        sAssert.assertAll();
    }
    @And("^the color of this message is green \"(.*)\"$")
    public void msgColor(String color)
    {
        SoftAssert sAssert = new SoftAssert();
        sAssert.assertEquals(register.successMessage().getCssValue("color"),color);
        sAssert.assertAll();
    }

}

