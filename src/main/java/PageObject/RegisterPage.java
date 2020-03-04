package PageObject;

import org.example.LoadProp;
import org.example.Utils;
import org.openqa.selenium.By;

public class RegisterPage extends Utils {

    LoadProp loadProp = new LoadProp();

    private By _radioButton = By.id("gender-female");
    private By _firstName = By.id("FirstName");
    private By _lastName = By.id("LastName");
    private By _email = By.id("Email");
    private By _password = By.id("Password");
    private By _confirmPassword = By.id("ConfirmPassword");
    private By _submitButton = By.id("register-button");
    private By _registerSuccessMessage = By.xpath("//*[contains(text(),'Your registration completed')]");
    String expected = "Your registration completed";
    private static String timeStamp = timeStamp();


    public void selectRadioButton(){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(_radioButton).click();
    }

    public void enterFirstName () {
        driver.findElement(_firstName).sendKeys(loadProp.getProperty("firstname"));
    }

    public void enterLastName(){
        driver.findElement(_lastName).sendKeys(loadProp.getProperty("lastname"));
    }

    public void enterEmailAddress(){ driver.findElement(_email).sendKeys("Johnsmith124" + timeStamp+ "@test.com");}
    public void enterPassword(){ driver.findElement(_password).sendKeys(loadProp.getProperty("password"));}

    public void enterConfirmPassword(){driver.findElement(_confirmPassword).sendKeys(loadProp.getProperty("confirmPassword"));}

    public void clickOnRadioButton(){driver.findElement(_submitButton).click();}

    public void assertRegisterSuccessfulMessage(){ assertTextMessage("Your registration completed",expected,_registerSuccessMessage);}


}
