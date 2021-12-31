package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CategoryPage extends Utils{

    By _pageTitle = By.xpath("//h1");

    public void getMyUrl(String page_url){
        Assert.assertTrue(driver.getCurrentUrl().equals(page_url));

    }
    public void verifyCategoryTitle(String text){
        Assert.assertEquals(driver.findElement(_pageTitle).getText(),text);
    }
}
