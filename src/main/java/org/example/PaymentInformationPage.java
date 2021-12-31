package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class PaymentInformationPage extends PaymentMethodPage{

    public void userShouldEnterCorrectPaymentDetails(){

        // Type the cardholder name
        typeText(By.id("CardholderName"),"Shah");

        // Enter the card number
        typeText(By.id("CardNumber"),"6439879625893654");

        // Select expiry month and year from drop down menu
        Select selectMonth = new Select(driver.findElement(By.id("ExpireMonth")));
        selectMonth.selectByValue("12");

        Select selectYear = new Select(driver.findElement(By.id("ExpireMonth")));
        selectYear.selectByValue("2025");

        // Enter code
        typeText(By.id("CardCode"),"421");

        // Click on continue
        clickOnElement(By.xpath("//button[@class='button-1 payment-info-next-step-button']"));
    }
}
