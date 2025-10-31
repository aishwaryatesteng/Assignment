package pages;

import org.openqa.selenium.By;

import base.base;

public class page1 extends base {
	public page1 enterusername(String username)
	{
		driver.findElement(By.id("username")).sendKeys(username);
		return this;
	}
	public page1 enterpassword(String password)
	{
		
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
	}
	public page1 submitbutton()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return this;
	}
   public page2 click_on_crmsfa()
   {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new page2();
   }
}
