package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CategoryUrl extends Utils{
    By _pageTitle = By.xpath("//h1");

    public void verifyUrl(String pageURL){
        Assert.assertTrue(driver.getCurrentUrl().equals(pageURL));
    }

    public void verifyPageTitle(String pageTitle){
        Assert.assertEquals(driver.findElement(_pageTitle).getText(),pageTitle);
    }



}
