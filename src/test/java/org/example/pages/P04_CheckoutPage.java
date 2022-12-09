package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class P04_CheckoutPage {
    public WebElement firstNameTxt()
    {
        return  Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[1]/input"));
    }

    public WebElement lastNameTxt()
    {
        return  Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[2]/input"));
    }
    public WebElement emailTxt()
    {
        return  Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[3]/input"));
    }
    public WebElement country(){
        return Hooks.driver.findElement(By.id("BillingNewAddress_CountryId"));
    }
    public WebElement city(){
        return Hooks.driver.findElement(By.id("BillingNewAddress_City"));
    }
    public WebElement address(){
        return Hooks.driver.findElement(By.id("BillingNewAddress_Address1"));
    }
    public WebElement zippostalcode(){
        return Hooks.driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
    }
    public WebElement phonenumber(){
        return Hooks.driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
    }
    public WebElement continuebtn1(){
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 new-address-next-step-button\"]"));
    }
    public WebElement continuebtn2(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button"));
    }
    public WebElement continuebtn3(){
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[4]/div[2]/div/button"));
    }
    public WebElement continuebtn4(){
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[5]/div[2]/div/button"));
    }
    public WebElement confirmbtn(){
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[6]/div[2]/div[2]/button"));
    }
}
