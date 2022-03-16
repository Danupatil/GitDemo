package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		 features ="src/test/java/Features/Login.feature",
		 glue = "stepDefinitions",
		 dryRun = false,
         monochrome =true,
         plugin= {"pretty","html:target/testoutput.html"})
public class TestNGTestRunner extends AbstractTestNGCucumberTests {

}
