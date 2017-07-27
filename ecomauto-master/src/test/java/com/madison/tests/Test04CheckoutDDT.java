package com.madison.tests;

import com.madison.steps.CheckoutSteps;
import com.sun.glass.ui.Application;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.fluentlenium.core.annotation.Page;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 * Created by razvansidra on 7/27/2017.
 */

//@Story(Application.class)
@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "CSV/test.csv")
public class test04CheckoutDDT {

    @Before
    public void maxiPage() {
        driver.manage().window().maximize();
    }

    @Managed(uniqueSession = false)
    public WebDriver driver;

    @ManagedPages(defaultUrl = "CSV")
    public Pages pages;
    @Steps
    private CheckoutSteps checkoutSteps;
    String firstname, lastname, email, address, city, country, postalCode, telephone;

    @Test
    public void test04_Checkout() {
        checkoutSteps.navigateTo("http://qa2.madison.com/");
        checkoutSteps.clickOnProduct();
        checkoutSteps.clickOnColor();
        checkoutSteps.clickOnSize();
        checkoutSteps.clickOnAddToCart();
        checkoutSteps.clickOnProceedToCheckout();
        checkoutSteps.clickOnContinueButton();
        checkoutSteps.billingInformationCheckout(firstname, lastname, email, address, city, country, postalCode, telephone);
        checkoutSteps.clickOnContinue();
    }
}