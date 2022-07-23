package runnerFiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/features",
        glue = {"StepDefinition"},
        plugin = { "pretty", "html:target/cucumber.html",
                    "json:target/cucumber.json",
                    "junit:target/cukes.xml",
                    "rerun:target/rerun.txt",
                    "html:target/cucumber-reports"},
        monochrome = true,
        tags = "@SmokeTesting"
)

public class RunTesting extends AbstractTestNGCucumberTests {}