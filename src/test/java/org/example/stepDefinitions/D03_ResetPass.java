package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_Login;
import org.testng.asserts.SoftAssert;

public class D03_ResetPass {
    P02_Login resetpass = new P02_Login();
    @Given("a user navigate to login page")
    public void gotoLoginPage()
    {
        resetpass.loginLink().click();
    }
    @When("user clicks on forgot password")
    public void clickforgotpass(){
        resetpass.forgotpasslink().click();
    }
    @And("^user enter his/her login email \"(.*)\"$")
    public void enteremail(String email){
        resetpass.emailTxt().sendKeys(email);
    }
    @And("user clicks on recover")
    public void clickrecoverbtn(){
        resetpass.recoverbtn().click();
    }
    @Then("^a successful recovery message is displayed \"(.*)\"$")
    public void recoversuccessmsg(String msg){
        SoftAssert sAssert2 = new SoftAssert();
        sAssert2.assertEquals(resetpass.recoverysuccessMessage().getText(),msg);
        sAssert2.assertAll();
    }
}
