package w2.week2day2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook_day2 {

	public static void main(String[] args) {
		//creating facebook account for the first time
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Aishwarya");
		driver.findElement(By.name("lastname")).sendKeys("Rajasegaran");
		WebElement dropdown=driver.findElement(By.id("day"));
		Select s= new Select(dropdown);
		s.selectByValue("7");
		WebElement dropdown1=driver.findElement(By.id("month"));
		Select s1=new Select(dropdown1);
		s1.selectByValue("11");
		WebElement dropdown2=driver.findElement(By.id("year"));
		Select s2=new Select(dropdown2);
		s2.selectByValue("1997");
		driver.findElement(By.name("reg_email__")).sendKeys("xyz@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@id='sex'][1]")).click();
		driver.findElement(By.name("websubmit")).click();
		driver.close();
		

	}

}
