package Runner;

import org.testng.annotations.AfterMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/Feature/account_salesforce.feature",glue="StepDefinition",monochrome=true,publish=true)
public class testng_runner extends AbstractTestNGCucumberTests{

	
}

