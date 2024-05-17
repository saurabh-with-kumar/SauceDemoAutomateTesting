package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	
	public WebDriver driver;
	
	public Login(WebDriver ldriver) {
		ldriver = driver;
		
		
	}
	
	@FindBy(id="user-name")
	WebElement uname;
	
	@FindBy(id="password")
	WebElement pswd;
	
	@FindBy(id="login-button")
	WebElement button;
	
	public void login(String username, String password) {
		
		uname.sendKeys(username);
		pswd.sendKeys(password);
		button.click();
		
	}
	
	
	
	
	
	
	
	
	
	

	

}
