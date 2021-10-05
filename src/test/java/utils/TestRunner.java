package utils;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "Features"
                ,glue = "in.amazon.testscripts"
                ,tags = "@pizza"
                //,dryRun = true
)

public class TestRunner extends AbstractTestNGCucumberTests {


}
