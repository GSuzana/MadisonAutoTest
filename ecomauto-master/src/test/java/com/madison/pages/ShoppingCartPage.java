package com.madison.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by razvansidra on 7/26/2017.
 */
public class ShoppingCartPage extends PageObject{

    @FindBy(css = "ul[class='checkout-types top'] button>span>span")
    private WebElement proceedButton;

    public void clickOnProceedToCheckout(){proceedButton.click();}
}
