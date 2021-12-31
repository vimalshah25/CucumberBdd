package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import static org.example.BasePage.driver;

public class OrderConfirmSuccessPage extends ConfirmOrderPage{

    public void toVerifyUserShouldPlacedOrderSuccessfully(){

       Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong")).getText().equals("Order Confirm Successfully"));
    }
}
