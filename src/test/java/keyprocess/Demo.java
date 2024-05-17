package keyprocess;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.nopcommerce.com/en/demo");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,70)",  "");
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"ph-topic\"]/div[2]/div/div[1]/div[2]/div/div/a[2]/span"));
		
		js.executeScript("arguments[0].scrollIntoView()", ele);
		
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
				
		Thread.sleep(5000);
		driver.close();

	}

}
