package com.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.page.Baseclass;
import com.page.Loginpage;

public class Login extends Baseclass {
	
	@Test
	public void loginapp() {
		
		Loginpage loginpage = PageFactory.initElements(driver, Loginpage.class);
		
		loginpage.loginToSaucedemo("standard_user", "secret_sauce");
	}
	

	
	
	


}
