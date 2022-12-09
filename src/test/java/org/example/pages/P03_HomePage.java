package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class P03_HomePage {
    public WebElement currencySelection()
    {
        return Hooks.driver.findElement(By.cssSelector("select[id=\"customerCurrency\"]"));
    }
    public List<WebElement> productPrice()
    {
        return Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
    }
    public WebElement searchField()
    {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }
    public WebElement searchButton()
    {
        return Hooks.driver.findElement(By.cssSelector("button[type=\"submit\"]"));
    }
    public List<WebElement> searchResultItems()
    {
        return Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]"));
    }
    public WebElement searchResultItem()
    {
        return Hooks.driver.findElement(By.xpath("//h2[@class='product-title']/a"));
    }
    public WebElement itemSKU()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"sku\"]>span[class=\"value\"]"));
    }
    public WebElement apparelCategory()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/apparel\"]"));
    }
    public WebElement shoesSubCategory()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/shoes\"]"));
    }
    public WebElement shoesSubTitle()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]>h1"));
    }
    public WebElement colorFilterRed(){
        return Hooks.driver.findElement(By.id("attribute-option-15"));
    }
    public WebElement wishlistBtn()
    {
        return Hooks.driver.findElement(By.xpath("//div//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/18/2/1\"),!1']"));
    }
    public WebElement comparelistBtn(){
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[2]"));
    }
    public WebElement comparelistBtn2(){
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/div[3]/div[2]/button[2]"));
    }
    public WebElement successMSG()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }
    public WebElement wishlistLink()
    {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-wishlist\"]"));
    }
    public WebElement quantity()
    {
        return Hooks.driver.findElement(By.cssSelector("input[class=\"qty-input\"]"));
    }
    public WebElement comparelistlink(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/compareproducts\"]"));
    }
    public WebElement addtocartbtn1(){
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]"));
    }
    public WebElement quantity2(){
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[4]/a/span[2]"));
    }
}
