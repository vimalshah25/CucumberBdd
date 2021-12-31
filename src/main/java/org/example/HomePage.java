package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import javax.naming.Name;
import java.util.Iterator;
import java.util.Set;

public class HomePage extends Utils{
    By _clickOnTheComputerButton = By.xpath("//ul[@class='top-menu notmobile']/li/a[@href=\"/computers\"]");
    By _registerLinkButton = By.xpath("//a[@class=\"ico-register\"]");
    By _clickOnNewsDetailsButton = By.xpath("//div[@class='news-list-homepage']/div[2]/div[2]/div[3]/a");
    By _clickOnBuildYourOwnComputer = By.xpath("//div/a/img[@alt='Picture of Build your own computer']");
    By _clickOnNewOnlineStoreIsOpen = By.xpath("//div[@class=\"news-list-homepage\"]/div[2]/div[1]/div[1]/a");
    By _faceBook = By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[1]/a");
    By _vote = By.id("vote-poll-1");
    By _buildYourOwnComputer1 = By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[1]/div/div[2]/h2/a");


    public void ClickOnRegisterButton() {
        // Click on Register Button
        clickOnElement(_registerLinkButton);
    }
    public void clickOnComputerButton(){
        // Click on Computer Button
        clickOnElement(_clickOnTheComputerButton);


    }
    public void clickOnNewsCommentsDetails(){
        // click on News Details Page
        clickOnElement(_clickOnNewsDetailsButton);


    }
    public void clickOnBuildYourOwnComputer(){
        // click on Build Your Own Computer
        clickOnElement(_clickOnBuildYourOwnComputer);

    }
    public void clickOnCategory(String category){
        clickOnElement(By.linkText(category));
    }

    public void clickOnNewOnlineStoreIsOpen(){

        clickOnElement(_clickOnNewOnlineStoreIsOpen);
    }
    public void facebookWindowHandling(){
        clickOnElement(_faceBook);

        // window handling
        Set<String> Handles=driver.getWindowHandles();
        Iterator<String> iterator=Handles.iterator();
        String parentWindow = iterator.next();
        String childWindow = iterator.next();
        driver.switchTo().window(childWindow);

        // Accept cookies
        driver.findElement(By.xpath("//button[@data-cookiebanner=\"accept_button\"]")).click();

        // user verify that he is on Facebook Page

        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div/div/div[1]/a/i")).getText().equals("Facebook"));

        // close new tab or child page or facebook page
        driver.close();

        // now user at demo nopCommerce
        driver.switchTo().window(parentWindow);
    }
    public void clickOnVoteButton(){
        clickOnElement(_vote);
        driver.switchTo().alert().accept();
    }
    public void clickOnBuildYourOwnComputer1(){
        clickOnElement(_buildYourOwnComputer1);
    }

    public void mouseHoover(String subcategory){
        Actions actions = new Actions(driver);
        // move the mouse to the earlier identified menu option
        WebElement element1= driver.findElement(By.linkText(subcategory));
        actions.moveToElement(element1).build().perform();
        element1.click();


    }




}

