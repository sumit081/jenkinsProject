package seleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TC_01 
{

     @Test
     public void testOne()
     {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
    	 driver.get("https:/www.selenium.dev");
		System.out.println(driver.getTitle());
		driver.close();
		
	}
     
     
}

