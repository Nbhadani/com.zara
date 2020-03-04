package org.example;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends Utils {


    public void selectBrowser(){
        LoadProp loadProp = new LoadProp();
        String browser =  loadProp.getProperty("browser");
        System.out.println("Browser :    "+browser);

        if (browser.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","src/test/Resources/BrowserDriver/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get(loadProp.getProperty("url"));
        }
        else if (browser.equalsIgnoreCase("firefox"))
        {
            System.setProperty("webdriver.gecko.driver","src/test/Resources/BrowserDriver/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get(loadProp.getProperty("url"));
        }
        else
        {
            System.out.println("You have selected wrong browser"+browser);
        }
    }



}
