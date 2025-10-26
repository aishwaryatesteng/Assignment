package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class account_tab_salesforce {
	public ChromeDriver driver;
	@Given("Launch the Browsers")
	public void launch_the_browsers() {

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
       driver=new ChromeDriver(options);
	}

	@Given("Load the urls")
	public void load_the_urls() {
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
	}

	@Given("Enter the usernames as {string}")
	public void usernames(String users)
	{
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(users);
	
	}

	@Given("Enter the passwords as {string}")
	public void enter_the_passwords_as(String passs) {
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys(passs);

	}

	@When("click on login button")
	public void click_on_login_button() {
		  driver.findElement(By.xpath("//input[@id='Login']")).click();
	}

	@When("click on waffle icon")
	public void click_on_waffle_icon() {
		  driver.findElement(By.xpath("//button[@class='slds-button slds-context-bar__button slds-icon-waffle_container slds-show']")).click();
	}

	@When("click on view all")
	public void click_on_view_all() {
		 driver.findElement(By.xpath("(//button[@part='button'])[4]")).click();
	}

	@When("click on sales")
	public void click_on_sales() {
		  WebElement element = driver.findElement(By.xpath("//p[text()='Sales']"));
		  driver.executeScript("arguments[0].scrollIntoView();", element);
		  element.click();
	}

	@When("click on account tab")
	public void click_on_account_tab() {
		WebElement element2 = driver.findElement(By.xpath("(//span[text()='Accounts'])[1]"));
		  driver.executeScript("arguments[0].click();", element2);
	}

	@When("click on new button")
	public void click_on_new_button() {
		 driver.findElement(By.xpath("//a[@title='New']")).click();
	}

	@Given("Enter the name as {string}")
	public void enter_the_name_as(String name) {
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
	}

	@Given("select ownership as public")
	public void select_ownership_as_public() {
		WebElement element3 = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
		  driver.executeScript("arguments[0].scrollIntoView();",element3);
		  element3.click();
		  driver.findElement(By.xpath("//span[text()='Public']")).click();
	}

	@When("click on save")
	public void click_on_save() {
		  driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}

	@Then("Account should be created successfully")
	public void account_should_be_created_successfully() {
	   
	}


	
	}

