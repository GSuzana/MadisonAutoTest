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
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 * Created by razvansidra on 7/27/2017.
 */

//@Story(Application.Authentication.Checkout.class)
//@RunWith(SerenityParameterizedRunner.class)
//@UseTestDataFrom(value = CSV_PATH)
//
//public class Test04CheckoutDDT {
//
//    @Managed(uniqueSession = false)
//
//    public WebDriver driver;
//
//    @ManagedPages(defaultUrl = )
//
//    public Pages pages;
//
//    @Steps
//    private CheckoutSteps checkoutSteps;
//    String firstname, lastname, email, address, city, country, postalCode, telephone;
//
//    @Test
//    public void test04_Checkout(){
//        checkoutSteps.billingInformationCheckout(firstname, lastname, email, address, city, country, postalCode, telephone);
//    }
//}