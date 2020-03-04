package org.example;

import PageObject.ComparingProductsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

public class CompareStepDefs extends Utils{
    ComparingProductsPage comparingProductsPage = new ComparingProductsPage();

    @Given("User is on Home Page")
    public void user_is_on_Home_Page() {
    }

    @When("User click on Book category")
    public void user_click_on_Book_category() {
        comparingProductsPage.clickOnBooksCategory();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @When("User Click on Add to Compare for product Fahrenheit by Ray Bradbury")
    public void user_Click_on_Add_to_Compare_for_product_Fahrenheit_by_Ray_Bradbury() {
       comparingProductsPage.clickOnFahrenheitAddToCompareList();
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
    }


    @When("User Click on Add to Compare for product First Prize Pies")
    public void user_Click_on_Add_to_Compare_for_product_First_Prize_Pies() {
       comparingProductsPage.clickOnFirstPrizeAddToCompareList();
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
    }

    @When("User Click on Product comparision on Popup Bar")
    public void user_Click_on_Product_comparision_on_Popup_Bar() {
      comparingProductsPage.userCompareProducts();
    }

    @Then("Compare Products message should be displayed")
    public void compare_Products_message_should_be_displayed() {
        comparingProductsPage.assertCompareProductsMessage();
    }

}
