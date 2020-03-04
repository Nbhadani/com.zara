package PageObject;

import org.example.Utils;
import org.openqa.selenium.By;

public class HomePage extends Utils {

    private By _registerButton = By.xpath("//*[contains(text(),'Register')]");


    public void clickOnRegisterButton(){
        driver.findElement(_registerButton).click();
    }
}
