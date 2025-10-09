package assignment_week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lowestPrice {

	public static void main(String[] args) throws InterruptedException {
		//calculating the lowest price in the phones at amazon website
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("Phones"+Keys.ENTER);
		List<WebElement> elements = driver.findElements(By.xpath("//div[@data-cy='reviews-block' and contains(@class,'a-spacing-top-micro')]/following-sibling::div//span[@class='a-price-whole']"));
		//div[@data-component-type='s-search-result' or contains(@data-uuid,'s-searchgrid' )]//span[@class='a-price']
		
		List<Integer> element_list=new ArrayList<Integer>();
       for(int i=0;i<elements.size();i++)
       {
    	String text = elements.get(i).getText();   
    	if(! text.isEmpty())
    	{
    	String text_value=text.replaceAll("[^0-9]", "");
    	System.out.println(text_value);
    	int int_text=Integer.parseInt(text_value);
    	element_list.add(int_text);
    	
    	}
       }
       Collections.sort(element_list);
       System.out.println("The lowest phone price is : "+element_list.get(0));
       driver.close();
       }
}