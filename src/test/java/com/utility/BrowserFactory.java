package com.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	
	public static WebDriver startAppliction(WebDriver driver, String browserName, String appUrl) {
		if(browserName.equals("Chrome")) {
			WebDriverManager .chromedriver().setup();
			driver=new ChromeDriver();
		
		}
		else if(browserName.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new FirefoxDriver();
			
			
		}
		else if(browserName.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else {
			System.err.println("Wrong driver");
		}
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		return driver;
	}
	public static void quitBrowser(WebDriver driver) {
		driver.close();
	}
	
	
	
	
	
	
	
	

	
	
	
	
	

}
