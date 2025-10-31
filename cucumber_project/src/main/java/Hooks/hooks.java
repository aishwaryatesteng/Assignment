package Hooks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import steps.parent_class;

public class hooks extends parent_class {
	  @Before
	    public void precondition()
	    {
		  ChromeOptions options=new ChromeOptions();
		    options.addArguments("--guest");
		    driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
	    @After
	    public void postcondition()
	    {
	    driver.close();
	    }
}
