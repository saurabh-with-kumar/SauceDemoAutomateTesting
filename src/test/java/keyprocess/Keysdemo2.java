package keyprocess;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keysdemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("cetpa");
		
		Actions act =new Actions(driver);
		
		act.sendKeys(Keys.ENTER).perform();
		
		
		
		Thread.sleep(2000);
		driver.close();
		
	   
	

	}

}
