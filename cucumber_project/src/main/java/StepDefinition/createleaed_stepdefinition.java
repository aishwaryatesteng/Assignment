package StepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class createleaed_stepdefinition extends Baseclass1 {
	@When("click on crmsfa")
	public void click_on_crmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@When("click on lead link")
public void lead()
{
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
	}

	@When("click on create lead link")
	public void click_on_create_lead_link() {
	  driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
	}

	@Given("Enter the company name")
	public void enter_the_company_name() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC");
	}

	@Given("Enter the first name")
	public void enter_the_first_name() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aishwarya");
	}

	@Given("Enter the last name")
	public void enter_the_last_name() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajasegaran");
	}

	@When("click on create lead")
	public void click_on_create_lead() {
		driver.findElement(By.name("submitButton")).click();
	}

	@Then("Lead should be created")
	public void lead_should_be_created() {
     System.out.println("lead is created");
	}



}
