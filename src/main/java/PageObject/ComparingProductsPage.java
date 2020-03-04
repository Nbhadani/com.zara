package PageObject;

import org.example.LoadProp;
import org.example.Utils;
import org.openqa.selenium.By;

public class ComparingProductsPage extends Utils {
    

    private By _books = By.linkText("Books");
    private By _fahrenheitBook = By.xpath("//input[@onclick='return AjaxCart.addproducttocomparelist(\"/compareproducts/add/37\"),!1']");
    private By _firstprizepies = By.xpath("//input[@onclick='return AjaxCart.addproducttocomparelist(\"/compareproducts/add/38\"),!1']");
    private By _compare = By.linkText("product comparison");
    private By _compareSuccessMessage = By.xpath("//*[contains(text(),'Compare products')]");
    String expected ="Compare products";


    public void clickOnBooksCategory() {
        driver.findElement(_books).click();
    }

    public void clickOnFahrenheitAddToCompareList() {
        driver.findElement(_fahrenheitBook).click();
    }

    public void clickOnFirstPrizeAddToCompareList() {
        driver.findElement(_firstprizepies).click();
    }

    public void userCompareProducts() {
        driver.findElement(_compare).click();
    }

    public void assertCompareProductsMessage() {
        assertTextMessage("Compare Products", expected,_compareSuccessMessage);
    }
}
