package com.madison.tests;

import com.madison.pages.BillingInformationPage;
import com.madison.pages.SetTestData;
import com.madison.pages.TestData;
import com.madison.steps.CheckoutSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 * Created by razvansidra on 7/26/2017.
 */

@RunWith(SerenityRunner.class)
public class test01CheckoutGuestTest {

    @Before
    public void maxiPage() {
        driver.manage().window().maximize();
    }

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    public CheckoutSteps checkoutSteps;

    @Steps
    public CheckoutSteps checkoutSteppp;

    private SetTestData init = new SetTestData();

    @Test
    public void checkoutProcess() {
        TestData testData =  init.initTestData();
        checkoutSteps.navigateTo("http://qa2.madison.com/");

        checkoutSteps.clickOnProduct();

        checkoutSteps.clickOnColor();

        checkoutSteps.clickOnSize();

        checkoutSteps.clickOnAddToCart();

        checkoutSteps.clickOnProceedToCheckout();

        checkoutSteps.clickOnContinueButton();


//         checkoutSteps.billingInformationCheckout(firstName, lastName, emailAddress,
//                address, city, postalCode, country, telephone);

        checkoutSteps.billingInformationCheckout();
        checkoutSteps.clickOnContinue();


        checkoutSteps.inputEmailAddress("test@gmail.com");
        checkoutSteppp.checkEmail("Please enter a valid email address. For example johndoe@domain.com.\n");
    }
}
