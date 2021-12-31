package org.example;

import org.openqa.selenium.By;

public class ShoppingCart extends BuildYourOwnComputer1{

    public void toVerifyTermsAndConditions(){

        // Click in the box of accept terms and conditions
        clickOnElement(By.xpath("//div[@class='terms-of-service']/input"));



        // Click on the checkout button
        clickOnElement(By.xpath("//div[@class='checkout-buttons']/button"));
    }
}
