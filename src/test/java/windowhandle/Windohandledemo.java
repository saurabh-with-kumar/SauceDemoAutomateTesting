package windowhandle;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windohandledemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();
		
		//String window = driver.getWindowHandle();
		
		//System.out.println("window=:"+window);
		
		Set<String> windowid = driver.getWindowHandles();
		
		List<String> windowlist = new ArrayList<String>(windowid);
		
		String pwindow = windowlist.get(0);
		System.out.println("the pwindowid=:"+ pwindow);
		
		String cwindow= windowlist.get(1);
		System.out.println("the cwindow=:"+ cwindow);
		Thread.sleep(4000);
		
		driver.switchTo().window(pwindow);
		Thread.sleep(4000);
		driver.switchTo().window(cwindow);
		
		Thread.sleep(2000);
		driver.quit();
		

		
		
	
		

		
				
				
		
	

	}

}
