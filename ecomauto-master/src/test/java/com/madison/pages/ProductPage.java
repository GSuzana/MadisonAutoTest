package com.madison.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by razvansidra on 7/26/2017.
 */
public class ProductPage extends PageObject {
    @FindBy(css = ".swatch-label")
    private WebElement color;

    @FindBy(css = ".option-l")
    private WebElement size;

    @FindBy(css = ".add-to-cart-buttons")
    private WebElement cartButton;


    public void clickOnColor(){color.click();}

    public void clickOnSize(){size.click();}

    public void clickOnAddToCart(){cartButton.click();}
}
