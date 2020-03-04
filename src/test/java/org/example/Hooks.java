package org.example;

//import cucumber.api.Scenario;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.apache.commons.io.FileUtils.copyFile;


public class Hooks extends Utils {

    private String timestamp = new SimpleDateFormat( "yyyy.MM.dd.mm.ss").format(new Date());
    BrowserSelector browserSelector = new BrowserSelector();

    @Before
    public void openBrowser() {
        browserSelector.selectBrowser();
    }

    @After
    public void closeBrowser(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenshotName = scenario.getName().replaceAll("[.,:;?!]", "") + timestamp + ".png";
            try {
                // Captures a screenshot from the driver and saves it to a sepcified location
                File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                // Create a destination path for the screenshot to save
                // Make sure to create a folder 'screenshots' with in the cucumber-report folder
                File destinationPath = new File(System.getProperty("user.dir") + "/target/Destination/screenshots/" + screenshotName);
                //Copy the screenshot taken form source location to destination location
                copyFile(sourcePath, destinationPath);
                scenario.write("XXXXX-----Scenario Failed-----XXXXX Please see the attached screenshot for the error");
                //Attach the screenshot to our report
                scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES),"image/png");
            } catch (IOException e){
               e.printStackTrace();

            }
        }

        //     driver.quit();
    }


}
