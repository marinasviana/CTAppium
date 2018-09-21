package runner;

import cucumber.api.CucumberOptions;
import helper.AppiumDriverHelper;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/features", glue = "stepDefinition", monochrome = true, dryRun = false)
public class CucumberTestRuner {
    @BeforeClass
    public static void tearUp(){
        AppiumDriverHelper.createDriver();

    }

    @AfterClass
    public static void tearDown(){
        AppiumDriverHelper.closeDriver();

    }

}
