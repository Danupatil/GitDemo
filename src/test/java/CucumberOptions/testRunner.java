package CucumberOptions;


import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions
        (

                features ="src/test/java/Features",
                glue = "stepDefinitions",tags= ("@Portaltest"), dryRun = true,monochrome = true,
                plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json","junit:target/cucumber.xml"} 
               
        )

public class testRunner {

}
