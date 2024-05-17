package nopcommerceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[1]/div/div[2]/div[3]/div[2]/button[1]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"product_attribute_1\"]]")).click();
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//*[@id=\"product_attribute_2\"]]")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type= 'radio' and @name= 'product_attribute_3']")).click();
	
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type= 'radio' and @name= 'product_attribute_4']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(" //input[@type= 'checkbox']")).click();
	
		Thread.sleep(2000);
		
		driver.findElement(By.id("add-to-cart-button-1")).click();
		
		Thread.sleep(2000);
		driver.close();
		
		
		
		
	}
	
	


}
