package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	public WebDriver driver;

	By registerNewUserLink = By.linkText("Ikke medlem? Tilmeld dig her!");
	By emailInputField = By.id("email");
	By passwordInputField = By.id("password");
	By logInButton = By.cssSelector("[type='submit']");
			
	public LoginPage (WebDriver driver) {
		
		this.driver = driver;

	}
	
	public LoginPage ClickOnRegisterNewUserLink() {
		driver.findElement(registerNewUserLink).click();
		return this;
	}
	
	public LoginPage EnterEmail (String email) {
		driver.findElement(emailInputField).sendKeys(email);
		return this;
	}
	
	public LoginPage EnterPassword (String password) {
		driver.findElement(passwordInputField).sendKeys(password);
		return this;
	}
	
	public LoginPage ClickLogInButton () {
		driver.findElement(logInButton).click();
		return this;
	}
	

}
