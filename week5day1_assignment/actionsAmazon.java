package week5.week5day1_assignment;

import java.io.File;
import java.time.Duration;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class actionsAmazon {

	public static void main(String[] args) {
		// scroll to the element using action class
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		Actions act=new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//h5[text()='Amazon Prime Music']/following::a[1]"));
        act.scrollToElement(element).perform();
        String text = element.getText();
        System.out.println("The text of the conditions of use and sale is: "+text);
        driver.close();
        
	}

}

