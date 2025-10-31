package pages;

import org.openqa.selenium.By;

import base.base;

public class page2 extends base{
public page3 createlead()
{
	driver.findElement(By.linkText("Leads")).click();
	return new page3();
}
}
