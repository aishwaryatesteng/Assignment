package Marathon_testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class Individuals extends BaseClass {
   //Creating individuals in salesforce application
	
	@Test(priority=0)
	public void createindividual() {
	driver.findElement(By.xpath("//div[@title='New']")).click();
    driver.findElement(By.xpath("//input[contains(@class,'lastName compound')]")).sendKeys("Kumars");
	driver.findElement(By.xpath("//button[@title='Save']")).click();
	String message = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
	System.out.println(message);
	if(message.contains("Kumars"))
	{
		System.out.println("Kumars is created!");
	}
	else
	{
		System.out.println("Kumars is not created!");
	}
}
	
	@Test(priority=1,dependsOnMethods= {"createindividual"})
	public void editindividual()
	{
		WebElement name =driver.findElement(By.xpath("//input[@name='Individual-search-input']"));
		name.sendKeys("Kumars");
		name.sendKeys(Keys.ENTER);
		WebElement ele = driver.findElement(By.xpath("//span[text()='Kumars']/following::td//lightning-primitive-icon")); 
		driver.executeScript("arguments[0].click();", ele);
		WebElement edit = driver.findElement(By.xpath("//a[@title='Edit']"));
		driver.executeScript("arguments[0].click();", edit);
		driver.findElement(By.xpath("//a[@role='combobox']")).click();
		driver.findElement(By.xpath("//a[@title='Mr.']")).click();
		driver.findElement(By.xpath("//input[contains(@class,'firstName')]")).sendKeys("Ganesh");
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		String msg = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
	   //Verify the first name as 'Ganesh'
		System.out.println(msg);
		if(msg.contains("Ganesh"))
		{
			System.out.println("Ganesh kumars is updated");
		}
		else
		{
			System.out.println("Ganesh kumars is not updated");
		}
		
	}
	
	@Test(priority=2,dependsOnMethods= {"createindividual","editindividual"})
	public void deleteindividual()
	{
		WebElement name =driver.findElement(By.xpath("//input[@name='Individual-search-input']"));
		name.sendKeys("Ganesh Kumars");
		name.sendKeys(Keys.ENTER);
		WebElement ele = driver.findElement(By.xpath("//span[text()='Ganesh Kumars']/following::td//lightning-primitive-icon")); 
		driver.executeScript("arguments[0].click();", ele);
		WebElement delete = driver.findElement(By.xpath("//a[@role='menuitem']/div[@title='Delete']"));
		driver.executeScript("arguments[0].click();", delete);
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		String msg = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
		 System.out.println(msg);
		 driver.findElement(By.xpath("//input[@class='slds-input']")).clear();
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Ganesh Kumars",Keys.ENTER);
		String text = driver.findElement(By.xpath("//span[@class='countSortedByFilteredBy']")).getText();
	    System.out.println(text);
		if(text.contains("0"))
	    {
	    	System.out.println("Deleted");
	    }
	    else
	    {
	    	System.out.println("Not deleted");
	    }
	}
	}
