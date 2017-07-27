package com.madison.tests;

import com.madison.steps.CheckoutSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 * Created by razvansidra on 7/27/2017.
 */

@RunWith(SerenityRunner.class)
public class test03CheckoutLoginNewAddressTest {

    @Before
    public void maxiPage(){driver.manage().window().maximize();}

    @Managed(uniqueSession = true)
    public WebDriver driver;


    String username = "test@gmail.com";
    String password = "test11";

    String selectAddress = "New Address";

    String firstName = "test";
    String lastName = "test";
    String emailAddress = "test@test.com";
    String address = "test";
    String city = "test";
    String postalCode = "123456";
    String telephone = "1234567899";
    String country = "test";


    @Steps
    public CheckoutSteps checkoutSteps;

    @Test
    public void checkoutLoginNewAddress(){

        checkoutSteps.navigateTo("http://qa2.madison.com/");

        checkoutSteps.clickOnProduct();

        checkoutSteps.clickOnColor();

        checkoutSteps.clickOnSize();

        checkoutSteps.clickOnAddToCart();

        checkoutSteps.clickOnProceedToCheckout();

        checkoutSteps.loginFlow(username, password);

        checkoutSteps.selectAddress(selectAddress);

//        checkoutSteps.billingInformationCheckout(firstName, lastName, emailAddress,
//                address, city, postalCode, country, telephone);
        checkoutSteps.clickOnContinue();
    }
}