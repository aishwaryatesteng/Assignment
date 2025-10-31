package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class leads extends parent_class {

	@Given("Enter the username as {string}")
	public void username_as(String user) {

		driver.findElement(By.id("username")).sendKeys(user);
	}
	@Given("Enter the password as {string}")
	public void password_as(String password) {

		driver.findElement(By.id("password")).sendKeys(password);
	}
	@When("clicking on login button")
	public void login() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

@When("clicking on crm\\/sfa")
public void clicking_on_crm_sfa() {
	driver.findElement(By.linkText("CRM/SFA")).click();
}
	
		@When("clicking on lead")
		public void clicking_on_lead() {

			driver.findElement(By.linkText("Leads")).click();
		}
		@When("clicking on createlead")
		public void clicking_on_createlead() {
			driver.findElement(By.linkText("Create Lead")).click();
		}

		@When("Entering the company name as (.*)$")
		public void entering_the_company_name_as(String companyname) {
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
		}

		@When("Entering the first name as (.*)$")
		public void entering_the_first_name_as(String firstname) {
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		}

		@When("Entering the last name as (.*)$")
		public void entering_the_last_name_as(String lastname) {
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		}

		@When("clicking on create lead button")
		public void clicking_on_create_lead_button() {
			driver.findElement(By.name("submitButton")).click();
		}

		@Then("lead must be created successfully")
		public void lead_must_be_created_successfully() {
        System.out.println("Lead is created");
		}
		@When("clicking on find lead")
		public void clicking_on_find_lead() {
			driver.findElement(By.linkText("Find Leads")).click();
		}

		@When("Entering the phone number as {string}")
		public void entering_the_phone_number_as(String phone) {
			driver.findElement(By.xpath("//span[text()='Phone']")).click();
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phone);
		}

		@When("clicking on find lead button")
		public void clicking_on_find_lead_button() {
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		}

		@When("clicking on edit button")
		public void clicking_on_edit_button() throws InterruptedException {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			driver.findElement(By.linkText("Edit")).click();
		}

		@When("Entering the companyname as {string}")
		public void entering_the_companyname_as(String comp) {
			driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(comp);
		}

		@Then("Lead must be edited")
		public void lead_must_be_edited() {
			driver.findElement(By.name("submitButton")).click();
		}
		@When("clicking on delete lead")
		public void clicking_on_delete_lead() throws InterruptedException {
			Thread.sleep(2000);
		
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			driver.findElement(By.linkText("Duplicate Lead")).click();
			driver.findElement(By.xpath("//input[@name='submitButton']")).click();
			driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
			
		}

		@Then("Lead should be deleted")
		public void lead_should_be_deleted() {
		    System.out.println("lead is deleted");
		}



}







