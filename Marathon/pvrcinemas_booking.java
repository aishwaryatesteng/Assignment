package Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class pvrcinemas_booking {
    //automating PVR cinema booking testcase
	public static void main(String[] args) throws InterruptedException {
      ChromeOptions options = new ChromeOptions();
      options.addArguments("--disable-notifications");
      ChromeDriver driver=new ChromeDriver(options);
      driver.get("https://www.pvrcinemas.com/");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
      driver.findElement(By.xpath("//span[text()='Cinema']")).click();
      driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
      driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[1]")).click();
      driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("(//span[text()='IDLI KADAI'])[2]")).click();
      driver.findElement(By.xpath("//li[@class='p-dropdown-item']//span[contains(text(),'03:40')]")).click();
      driver.findElement(By.xpath("//button[@aria-label='Submit']")).click();
      driver.findElement(By.xpath("//button[text()='Accept']")).click();
      driver.findElement(By.xpath("(//span[@class='seat-current-pvr'])[1]")).click();
      driver.findElement(By.xpath("//button[text()='Proceed']")).click();
      String text = driver.findElement(By.xpath("//div[@class='seat-number']/p")).getText();
      System.out.println("The seat information is : "+text);
      String text2 = driver.findElement(By.xpath("//div[contains(@class,'grand-tota')]/h6[2]/span")).getText();
      System.out.println("The grand total: "+text2);
      driver.findElement(By.xpath("//button[text()='Continue']")).click();
      driver.findElement(By.xpath("//i[contains(@class,'pi')]")).click();
      String title = driver.getTitle();
      System.out.println("The title of the page is: "+title);
      driver.close();
      
	}

}
