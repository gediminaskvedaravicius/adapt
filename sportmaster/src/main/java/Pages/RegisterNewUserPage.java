package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterNewUserPage {
	
	private static final RegisterNewUserPage RegisterUserPage = null;

	public WebDriver driver;

	By firstNameInputField = By.id("firstName");
	By lastNameInputField = By.id("lastName");
	By emailInputField = By.id("email");
	By passwordInputField = By.id("password");
	By femaleGenderButton = By.cssSelector("[for='gender-F']");
	By maleGenderButton = By.cssSelector("[for='gender-M']");
	By termsAcceptanceCheckbox = By.cssSelector("[for='termsAcceptance']");
	By sumbitButton = By.cssSelector("[type='submit']");

	public RegisterNewUserPage (WebDriver driver) {
		
		this.driver = driver;

	}
	
	public RegisterNewUserPage EnterFirstName (String firstName) {

		driver.findElement(firstNameInputField).sendKeys(firstName);
		return this;
	}
	
	public RegisterNewUserPage EnterLastName (String lastName) {

		driver.findElement(lastNameInputField).sendKeys(lastName);
		return this;
	}
	
	public RegisterNewUserPage EnterEmail (String email) {

		driver.findElement(emailInputField).sendKeys(email);
		return this;
	}
	
	public RegisterNewUserPage EnterPassword (String password) {

		driver.findElement(passwordInputField).sendKeys(password);
		return this;
	}
	public RegisterNewUserPage ClickOnMaleGender () {

		driver.findElement(maleGenderButton).click();
		return this;
	}
	public RegisterNewUserPage ClickOntermsAcceptanceCheckbox () {

		driver.findElement(termsAcceptanceCheckbox).click();
		return this;
	}
	public RegisterNewUserPage ClickOnsumbitButton () {

		driver.findElement(sumbitButton).click();
		return this;
	}

}
