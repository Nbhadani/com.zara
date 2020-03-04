package org.example;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(features = ".", tags = "@compare", plugin = {"pretty", "html:target/Destination"}, strict = true)




public class RunTest {
}
