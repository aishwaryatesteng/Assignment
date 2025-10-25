package Marathon_testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
    public ChromeDriver driver ;
 @Parameters({"url","user","password"})
@BeforeMethod
public void beforemethod(String url,String user,String password)
{   
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");
	driver = new ChromeDriver(option);
    driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
	driver.findElement(By.id("username")).sendKeys(user);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.id("Login")).click();
	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	driver.findElement(By.xpath("//button[text()='View All']")).click();
	WebElement scroll = driver.findElement(By.xpath("//p[text()='Party Consent']"));
	driver.executeScript("arguments[0].scrollIntoView();", scroll);
	WebElement individual = driver.findElement(By.xpath("//p[text()='Individuals']"));
	driver.executeScript("arguments[0].click();", individual);	
}

@AfterMethod
public void aftermethod()
{
   driver.close();	
}
}
