package Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
	      ChromeDriver driver=new ChromeDriver();
	      driver.get("https://www.amazon.in/");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
	      driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags for boys"+ Keys.ENTER);
          driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]")).click();
          String text = driver.findElement(By.xpath("//span[contains(text(),'results')]")).getText();
	      System.out.println(text);
	      driver.findElement(By.xpath("(//div[@id='brandsRefinements']//span[contains(@class,'a-size-base')])[2]")).click();
	      driver.findElement(By.xpath("(//div[@id='brandsRefinements']//span[contains(@class,'a-size-base')])[4]")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).click();
	      driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
	      String text2 = driver.findElement(By.xpath("//a[contains(@class,'a-link-normal')]/h2/span")).getText();
	      System.out.println("The name of the bag is :"+text2);
	      String text3 = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[3]")).getText();
	      System.out.println("The price of the bag is : "+text3);
	     driver.close();
	}

}
