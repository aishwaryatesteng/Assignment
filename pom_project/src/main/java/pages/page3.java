package pages;

import org.openqa.selenium.By;

import base.base;

public class page3 extends base {
 public page4 createleadbutton()

{
		driver.findElement(By.linkText("Create Lead")).click();
		return new page4();
}
 }
