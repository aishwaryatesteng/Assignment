package week6.day1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class Baseclass {
	public ChromeDriver driver;
	public String filename;
	
	@DataProvider(name="fetchdata")
	public String[][] readingdata() throws IOException
	{
		String[][] final_data=Readexcel.readdata(filename);
		return final_data;
	}
	
	@Parameters({"url","user","password"})
	@BeforeMethod
	public void beforemethod(String url,String user,String password)
	{
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	driver=new ChromeDriver(options);
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys(user);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.id("Login")).click();
}
	@AfterMethod
	public void aftermethod()
	{
		 driver.close();
	}
}
