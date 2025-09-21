package w2.week2day2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class create_account {

	public static void main(String[] args) throws InterruptedException {
	//creating the account
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
	    driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Aishwarya");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement dropdown=driver.findElement(By.name("industryEnumId"));
		Select s=new Select(dropdown);
		s.selectByVisibleText("Computer Software");
		WebElement dropdown1=driver.findElement(By.name("ownershipEnumId"));
		Select s1=new Select(dropdown1);
		s1.selectByVisibleText("S-Corporation ");
		WebElement dropdown2=driver.findElement(By.id("dataSourceId"));
		Select s2=new Select(dropdown2);
		s2.selectByValue("LEAD_EMPLOYEE");
		WebElement dropdown3=driver.findElement(By.id("marketingCampaignId"));
		Select s3=new Select(dropdown3);
		s3.selectByIndex(6);
		WebElement dropdown4=driver.findElement(By.id("generalStateProvinceGeoId"));
		Select s4=new Select(dropdown4);
		s4.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
		
		
		
		

	}

}
