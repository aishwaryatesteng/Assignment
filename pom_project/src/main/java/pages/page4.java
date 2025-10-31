package pages;

import org.openqa.selenium.By;

import base.base;

public class page4 extends base{
public page4 entercompany(String comp)
{
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(comp);
	return this;
}
public page4 enterfirst(String first)
{driver.findElement(By.id("createLeadForm_firstName")).sendKeys(first);
  return this;
	}
public page4 enterlast(String last)
{
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(last);
	return this;
}
}
