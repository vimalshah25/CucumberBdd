package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NewOnlineIsOpenSuccessfullyPage extends NewOnlineStoreIsOpen{

    public void NewOnlineIsOpenSuccessfullyPage(){
        String actualNewOnlineopencomment = getTextFromElement(By.xpath("//div[@class='buttons']/button"));
        String expectedNewOnlinecomment = "News comment is successfully added.";
        Assert.assertTrue(actualNewOnlineopencomment.equals(expectedNewOnlinecomment),"News comment is successfully added.");


    }
}
