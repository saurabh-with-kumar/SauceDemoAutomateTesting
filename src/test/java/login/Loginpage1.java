package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpage1 {
	
	
	public static void login() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
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
		
        String ExpectedUrl ="https://www.saucedemo.com/inventory.html";
		
		String ActualUrl1=driver.getCurrentUrl();
		
		if (ExpectedUrl.equals(ActualUrl1)) {
			System.out.println("login successfull");
		}else {
			System.out.println("invalid credentials");
		}
		
		Thread.sleep(2000);
		driver.close();
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		Loginpage1.login();
	}

}
