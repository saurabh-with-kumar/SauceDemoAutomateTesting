package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VarifyUrl {
	 WebDriver driver;

	
	
	@BeforeTest
	public void setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		  driver= new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}

		
	
	
	@Test
	
	public void url() {
		
	        String expectedUrl ="https://www.saucedemo.com/";
		
			String actualUrl = driver.getCurrentUrl();
			
			if(expectedUrl.equals(actualUrl)) {
				System.out.println("Url is correct url");
				
			}else {
				System.out.println("url is wrong");
			}
			
	}
			
			
	@AfterTest
	
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}
