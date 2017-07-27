package com.emag.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Created by razvansidra on 7/25/2017.
 */

@DefaultUrl("www.emag.ro")

public class ProductPage extends PageObject {

    @FindBy(css = ".btn.btn-primary.btn-emag.btn-block.yeahIWantThisProduct.btn-lg")
    private WebElement addToCartButton;

    public void clickOnAddToCartButton() {
        addToCartButton.click();
    }

    public String getProductTitle() {
        return getDriver().findElement(By.cssSelector(".page-title")).getText();
    }

    public void clickOnShowCartDetails() {
        getDriver().findElement(By.cssSelector(".btn")).submit();
    }
}