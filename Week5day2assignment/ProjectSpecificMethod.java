package Week5day2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;



public class ProjectSpecificMethod {

	public ChromeDriver driver;
	@Parameters({"url","user","password"})
	@BeforeMethod
	public void preCondition(String URL, String USER,String Password)
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications","--incognito");
		driver= new ChromeDriver(options);
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(USER);
	   driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
	  driver.findElement(By.xpath("//input[@id='Login']")).click();

	}

	@AfterMethod
	public void postCondition()

{
		driver.close();
		

}
	}
