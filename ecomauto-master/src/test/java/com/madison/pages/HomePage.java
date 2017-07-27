package com.madison.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by razvansidra on 7/26/2017.
 */
@DefaultUrl("http://qa2.madison.com")

public class HomePage extends PageObject {

    @FindBy(css = "li[class='item last']:last-child")
    private WebElement product;

    public void navigateTo(String url){getDriver().get(url);}

    public void clickOnProduct(){product.click();}
}