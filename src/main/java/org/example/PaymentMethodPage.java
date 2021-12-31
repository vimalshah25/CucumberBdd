package org.example;

import org.openqa.selenium.By;

public class PaymentMethodPage extends ShippingMethodPage{

    public void userShouldBeVerifyPaymentMethod(){

        // select bank card option for payment
        clickOnElement(By.id("paymentmethod_1"));

        // click on continue button
        clickOnElement(By.xpath("//button[@class='button-1 payment-method-next-step-button']"));


    }
}
