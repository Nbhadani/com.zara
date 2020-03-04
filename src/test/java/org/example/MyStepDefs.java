package org.example;

import PageObject.HomePage;
import PageObject.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

public class MyStepDefs extends Utils{
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Given("User is on homepage")
    public void user_is_on_homepage() {
    }

    @When("User click on register button")
    public void user_click_on_register_button() {
        homePage.clickOnRegisterButton();
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
    }

    @When("User enter first name")
    public void user_enter_first_name() {
        registerPage.selectRadioButton();
        registerPage.enterFirstName();
    }

    @When("User enter last name")
    public void user_enter_last_name() {
        registerPage.enterLastName();

    }

    @When("User enter email address")
    public void user_enter_email_address() {
        registerPage.enterEmailAddress();
    //    driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);

    }

    @When("User enter password")
    public void user_enter_password() {
        registerPage.enterPassword();

    }

    @When("User enter confirm password")
    public void user_enter_confirm_password() {
        registerPage.enterConfirmPassword();

    }

    @When("User click on registersubmit button")
    public void user_click_on_registersubmit_button() {
        registerPage.clickOnRadioButton();
    }

    @Then("User should be able to see registration successfully")
    public void user_should_be_able_to_see_registration_successfully() {
    registerPage.assertRegisterSuccessfulMessage();
    }




}
