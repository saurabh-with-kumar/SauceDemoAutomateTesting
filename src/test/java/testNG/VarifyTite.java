package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VarifyTite {
	
	
   WebDriver driver;
	
	
	@BeforeTest
	
	public void setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		  driver= new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		}
	
	@Test
	public  void Title() throws InterruptedException {
		String ExpectedTitle ="Swag Labs";
		
		String ActualTitle = driver.getTitle();
		
		if(ExpectedTitle.equals(ActualTitle)) {
			System.out.println("correct Title");
		}else {
			System.out.println("incorrect Title");
		}
		
	}
	

	
 
	@AfterTest
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
		

	}
	
}

