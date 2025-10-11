package week5.week5day1_assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class webTable {

	public static void main(String[] args) throws InterruptedException {
		// Handling webtable 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS",Keys.ENTER);
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("MDU",Keys.ENTER);
		WebElement element = driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']"));
       if(element.isEnabled())
       {
    	   element.click();
       }
       List<WebElement> elements = driver.findElements(By.xpath("//table[contains(@class,'TrainList')]/tbody/tr/td[2]"));
	   Set<String> train_name_list=new TreeSet<String>();
       List<String> train_names=new ArrayList<String>(train_name_list);
       int count=0;
       for(int i=0;i<elements.size();i++)
	  {    
    	   for(int j=i+1;j<elements.size();j++)
    	   {
    		   String text = elements.get(i).getText();
    		   String text1=elements.get(j).getText();
    		   if(text.equals(text1))
    		   {
    			   train_name_list.add(text1);
    			   count=count+1;
    			   
    		   }
    	   }
    	   
		  
		  
	  }
       if(count==0)
       {
    	   System.out.println("Train names have no duplicates");
       }
       else
       {
    	   System.out.println("Train names have duplicates");
       for(String s: train_names)
       {
    	   System.out.println("The duplicate train names are: "+s);
       }
	}
	}
       

}

