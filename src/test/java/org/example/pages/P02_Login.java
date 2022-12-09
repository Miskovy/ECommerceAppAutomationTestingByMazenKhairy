package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_Login {
    public WebElement loginLink()
    {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-login\"]"));
    }
    public WebElement emailTxt()
    {
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement passTxt()
    {
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement loginBtn()
    {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
    }
    public WebElement myAccTab()
    {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-account\"]"));
    }
    public WebElement forgotpasslink(){
        return Hooks.driver.findElement(By.cssSelector("a[href*=\"/passwordrecovery\"]"));
    }
    public WebElement recoverbtn(){
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 password-recovery-button\"]"));
    }
    public WebElement recoverysuccessMessage()
    {
        return  Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }
    public WebElement recoveryfailedMessage(){
        return Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification error\"]"));
    }
}
