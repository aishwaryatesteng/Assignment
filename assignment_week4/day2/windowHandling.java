package assignment_week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Assignment_week3_day2_Q1.WebElement;

public class windowHandling {

	public static void main(String[] args) throws InterruptedException {
		// Window Handling
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list=new ArrayList<String>(windowHandles);
            driver.switchTo().window(list.get(1));
			driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
			driver.switchTo().window(list.get(0));
		    driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
      
     	Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> list1=new ArrayList<String>(windowHandles1);
            driver.switchTo().window(list1.get(1));
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		driver.switchTo().window(list.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Alert alert = driver.switchTo().alert();
	    alert.accept();
	    System.out.println("alert is accepted!");
	    String title = driver.getTitle();	   
	    String text_verification="View Contact | opentaps CRM";
	    if(text_verification.equals(title))
	    {
	    	System.out.println("the tile is verified!");
	    }
	    else
	    {
	    	System.out.println("title is not correct");
	    }
	    driver.close();
	}

}
