package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/feature_assignment",glue={"Hooks","steps"},monochrome=true,publish=true)
public class leads_runner extends AbstractTestNGCucumberTests{
    
}
