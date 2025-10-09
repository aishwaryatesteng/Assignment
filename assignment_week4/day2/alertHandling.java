package assignment_week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertHandling {
   //prompt alert handling
	public static void main(String[] args) {
	   ChromeDriver driver=new ChromeDriver();
	   driver.get("https://www.leafground.com/alert.xhtml");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
	   driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
	   Alert alert = driver.switchTo().alert();
	   alert.sendKeys("sending input");
	   alert.accept();
	   String text = driver.findElement(By.xpath(".//span[@id='confirm_result']")).getText();
       String sub_str=text.substring(text.indexOf(':')+1).trim();
       System.out.println("The given text in the prompt alert is :"+sub_str);
       String input="sending input";
       if(input.equals(sub_str))
       {
    	  
    	   System.out.println("Input matches!");
       }
       else
       {    
    	   System.out.println("Input does not match");
       }
       driver.close();
	}
	

}
