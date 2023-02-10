package com.PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLogin {

	WebDriver ldriver;
	public FBLogin(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement pass;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")
	WebElement bttn;
	
	public void setUsername(String Email) {
		email.clear();
		email.sendKeys(Email);
	}
	
	public void setPassword(String Pass) {
		pass.clear();
		pass.sendKeys(Pass);
	} 
	
	public void clickOnButton() {
		bttn.click();
	}
}














