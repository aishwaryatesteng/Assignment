package week6.day1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class parameterized_yourname extends Baseclass {
	
	@BeforeTest
	public void setvalues()
	{
		filename="name";
	}
	
	
	@Test(dataProvider="fetchdata")
	public void salesforce_name(String name) {
		// Salesforce automation using name
		driver.findElement(By.xpath("//button[@class='slds-button slds-context-bar__button slds-icon-waffle_container slds-show']")).click();
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
		WebElement element=driver.findElement(By.xpath("//p[text()='Legal Entities']"));
        Actions act=new Actions(driver);
        act.scrollToElement(element).perform();
        element.click();
        driver.findElement(By.xpath("//div[@title='New']")).click();
        driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
        driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
       
	}

}
