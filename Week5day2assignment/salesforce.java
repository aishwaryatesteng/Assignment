package Week5day2assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class salesforce extends ProjectSpecificMethod {
  


	@Test
	public void salesforces() throws InterruptedException {
		//salesforce automation
	 driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	  driver.findElement(By.xpath("//lightning-button[contains(@class,'slds-p-horizontal--small')]")).click();
	  WebElement legal=driver.findElement(By.xpath("//p[text()='Legal Entities']"));
	  Actions act=new Actions(driver);
	  act.scrollToElement(legal).perform();
	  legal.click();
	 // driver.findElement(By.xpath("//div[@class='slds-context-bar__label-action slds-p-left_none slds-p-right_x-small']")).click();
	// Thread.sleep(2000); 
	// WebElement element = driver.findElement(By.xpath("//span[text()='New Legal Entity']"));
	//driver.executeScript("arguments[0].click();",element);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[@Title='New']")).click();
	driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("MNC");
	driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("MNC company");
	driver.findElement(By.xpath("(//div[@class='slds-form-element__control textarea-container slds-grow']/textarea)[2]")).sendKeys("Description");
	WebElement elem=driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value']"));
    driver.executeScript("arguments[0].scrollIntoView();", elem);
    driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value']")).click();
	WebElement element2=driver.findElement(By.xpath("//span[text()='Active']"));
	driver.executeScript("arguments[0].click();", element2);
	driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	String text = driver.findElement(By.xpath("(//a[@class='forceActionLink']/div)[2]")).getText();
	System.out.println(text);
	if(text.equals("MNC"))
	{
		System.out.println("MNC is created");
	}
	else
	{
		System.out.println("MNC is not created");
	}
	}}

