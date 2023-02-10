package com.StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.PageClass.FBLogin;

import cucumber.api.java.en.*;

public class Steps {

	public WebDriver driver;
	public FBLogin login;
	
	@Given("User opens Chrome browser")
	public void user_opens_Chrome_browser() {
	     
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aksha\\eclipse-workspace\\Testing_Maven_work\\Demofb\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		login = new FBLogin(driver);
	}

	@When("User on log in page {string}")
	public void user_on_log_in_page(String url) {
	    
		driver.get(url);
	}

	@When("User enters username {string} and Password {string}")
	public void user_enters_username_and_Password(String email, String pass) {
	    
		login.setUsername(email);
		login.setPassword(pass);
	}

	@Then("User click on login button")
	public void user_click_on_login_button() {
	    
		login.clickOnButton();
	}

	@Then("close browser")
	public void close_browser() {
	    
		driver.quit();
	}
}
