package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CheckOut extends ShoppingCart{

    public void userShouldVerifyBillingAddress(){

        // Select country
        Select selectCountry = new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
        selectCountry.selectByValue("233");

        // Type city name
        typeText(By.id("BillingNewAddress_City"),"London");

        // Type full address
        typeText(By.id("BillingNewAddress_Address1"),"20,Beatty Road");
        typeText(By.id("BillingNewAddress_ZipPostalCode"),"HA7 4EU");
        typeText(By.id("BillingNewAddress_PhoneNumber"),"07887942865");

        // Click on continue Button
        clickOnElement(By.name("save"));
    }
}
