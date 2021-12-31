package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class BuildYourOwnComputer1 extends HomePage{
    By _addToCart=By.id("add-to-cart-button-1");
    By _hdd=By.id("product_attribute_3_6");
    By _os=By.id("product_attribute_4_9");
    By _software=By.id("product_attribute_5_11");
    By _softWare=By.id("product_attribute_5_12");
//    By _shoppingCart=By.id("//div[@id='bar-notification']/div/p/a");
    By _shoppingCart=By.linkText("Shopping cart");
    public void userShouldAbleToSelectSpecificFunction(){
        Select selectProcessor = new Select(driver.findElement(By.id("product_attribute_1")));
        selectProcessor.selectByValue("1");
        Select selectRAM = new Select(driver.findElement(By.id("product_attribute_2")));
        selectRAM.selectByValue("5");
        clickOnElement(_hdd);
        clickOnElement(_os);
        clickOnElement(_software);
        clickOnElement(_softWare);
        clickOnElement(_addToCart);
        waitForClicable(_shoppingCart, 20);
        clickOnElement(_shoppingCart);

    }
}

