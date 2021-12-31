package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NewOnlineStoreIsOpen extends HomePage{

    By _clickOnNewOnlineStoreIsOpen = By.xpath("//div[@class=\"news-list-homepage\"]/div[2]/div[1]/div[1]/a");
    By _NewOnlineStoreTitle = By.xpath("//input[@class=\"enter-comment-title\"]");
    By _NewOnlineStoreNewCommentButton = By.xpath("//div[@class='form-fields']/div[2]/textarea");
    By _clickOnNewCommentButton = By.xpath("//div[@class='buttons']/button");
    public void userVerifyThatUserAtOnlineStorePage(){
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[1]/h1")).getText().equals("New online store is open!"));

    }
    public void userVerifyLeaveYourCommentTittle(){
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"comments\"]/div[1]/strong")).getText().equals("Leave your comment"));
    }




    public void clickOnNewOnlineStoreIsOpen() {
        clickOnElement(_clickOnNewOnlineStoreIsOpen);
    }
    public void userTypeTitle() {
        typeText(_NewOnlineStoreTitle, "Excellent Product");
        typeText(_NewOnlineStoreNewCommentButton, "7 Star Product");
        clickOnElement(_clickOnNewCommentButton);

        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"comments\"]/div[2]/div")).getText().equals("News comment is successfully added."));

    }
    public void toVerifyUserShouldAbleToSeeComment(){
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[4]/div[2]/div[2]/div[2]/div[3]/p")).getText().equals("Nice online store"));
    }
}


