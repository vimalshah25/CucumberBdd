package org.example;

import org.openqa.selenium.By;



public class ShippingMethodPage extends CheckOut {

    public void userShouldConfirmShipping(){

waitForVisible(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button"), 10);
        // Click on continue button
      clickOnElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button"));




    }
}
