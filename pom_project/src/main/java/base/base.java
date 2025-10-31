package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import excelData.readexcel;

public class base {
  public static ChromeDriver driver;
  
  @DataProvider(name="fetchdata")
  public String[][] getdata() throws IOException
  {
	  String[][] datta=readexcel.readdata();
	return datta;
	  
	  
  }
  @BeforeMethod
	public void preCondition()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");
	    driver = new ChromeDriver(options);
	    driver.manage().window().maximize();
	    driver.get("http://leaftaps.com/opentaps/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
  @AfterMethod
  public void postCondition()
  {
	  driver.close();
	  }
}
