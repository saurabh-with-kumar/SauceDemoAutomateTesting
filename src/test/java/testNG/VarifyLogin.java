package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VarifyLogin {
	static WebDriver driver;
	
	
	@BeforeTest
	
	public void setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		  driver= new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		}
	
	@Test
	public static void Logins() throws InterruptedException {
		
		String expectedUrl ="https://www.saucedemo.com/";
		String actualUrl = driver.getCurrentUrl();
		
		if(expectedUrl.equals(actualUrl)) {
			System.out.println("Url is correct url");
			
		}else {
			System.out.println("url is wrong");
		}
		
	String ExpectedTitle ="Swag Labs";
	
	String ActualTitle = driver.getTitle();
	
	if(ExpectedTitle.equals(ActualTitle)) {
		System.out.println("correct Title");
	}else {
		System.out.println("incorrect Title");
	}
	
	
	WebElement ele = driver.findElement(By.name("user-name"));
    ele.sendKeys("standard_user");
	Thread.sleep(2000);
	
	WebElement ele1 =driver.findElement(By.name("password"));
	ele1.sendKeys("secret_sauce");
	Thread.sleep(2000);
	
	driver.findElement(By.name("login-button")).click();
	Thread.sleep(2000);
	
 }
	@AfterTest
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
		
		
	}


	
}

	


		

	


