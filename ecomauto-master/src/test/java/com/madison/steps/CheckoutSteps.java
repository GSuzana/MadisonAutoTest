package com.madison.steps;

import com.madison.pages.*;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import org.junit.Assert;
import org.yecht.Data;

import static org.junit.Assert.assertTrue;

/**
 * Created by razvansidra on 7/26/2017.
 */
public class CheckoutSteps {
    HomePage homePage;
    ProductPage productPage;
    ShoppingCartPage shoppingCartPage;
    CheckoutMethodPage checkoutMethodPage;
    BillingInformationPage billingInformationPage;


    @Step
    public void navigateTo(String url){homePage.navigateTo(url);}

    @Step
    public void clickOnProduct(){homePage.clickOnProduct();}

    @Step
    public void clickOnColor(){productPage.clickOnColor();}

    @Step
    public void clickOnSize(){productPage.clickOnSize();}

    @Step
    public void clickOnAddToCart(){productPage.clickOnAddToCart();}

    @Step
    public void clickOnProceedToCheckout(){shoppingCartPage.clickOnProceedToCheckout();}

    @Step
    public void clickOnContinueButton(){checkoutMethodPage.clickOnContinueButton();}

    @Step
    public void inputUsername(String keyword){checkoutMethodPage.inputUsername(keyword);}
    @Step
    public void inputPassword(String keyword){checkoutMethodPage.inputPassword(keyword);}
    @Step
    public void clickOnLoginButton(){checkoutMethodPage.clickOnLoginButton();}

    @StepGroup
    public void loginFlow(String username, String password){
        inputUsername(username);
        inputPassword(password);
        clickOnLoginButton();
    }

    @Step
    public void selectAddress(String word){billingInformationPage.selectAddress(word);}

    @Step
    public void inputFirstName(String word){billingInformationPage.inputFirstName(word);}
    @Step
    public void inputLastName(String word){billingInformationPage.inputLastName(word);}
    @Step
    public void inputEmailAddress(String word){billingInformationPage.inputEmailAddress(word);}
    @Step
    public void inputAddress(String word){billingInformationPage.inputAddress(word);}
    @Step
    public void inputCity(String word){billingInformationPage.inputCity(word);}
    @Step
    public void inputPostalCode(String word){billingInformationPage.inputPostalCode(word);}
    @Step
    public void selectCountry(String word){billingInformationPage.selectCountry(word);}
    @Step
    public void inputTelephone(String word){billingInformationPage.inputTelephone(word);}

    @StepGroup
    public void billingInformationCheckout(String firstname, String lastname, String emailaddress,
                                          String address, String city, String postalcode,
                                          String country, String telephone){
        inputFirstName(firstname);
        inputLastName(lastname);
        inputEmailAddress(emailaddress);
        inputAddress(address);
        inputCity(city);
        inputPostalCode(postalcode);
        selectCountry(country);
        inputTelephone(telephone);
    }

    @StepGroup
    public void billingInformationCheckoutLogin(String firstname, String lastname,
                                                String address, String city, String postalcode,
                                                String country, String telephone){
        inputFirstName(firstname);
        inputLastName(lastname);
        inputAddress(address);
        inputCity(city);
        inputPostalCode(postalcode);
        selectCountry(country);
        inputTelephone(telephone);
    }

    @Step
    public void checkEmail(String expectedMessage){
        String email = billingInformationPage.checkEmail();
        Assert.assertTrue("The email is invalid!", expectedMessage.contentEquals(email));
    }
    @Step
    public void clickOnContinue(){billingInformationPage.clickOnContinue();}
}