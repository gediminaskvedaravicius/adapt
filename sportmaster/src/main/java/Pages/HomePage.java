package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	public WebDriver driver;

	By popUpUserProfileGreetingTitle = By.cssSelector(".UserOnboardingHeader__greetings h4");
	By userProfileGreetingTitle = By.cssSelector(".UserProfileGreetings__text");
	By logoutButton = By.cssSelector("[href='/user/logout']");
	By userProfileGreetingPopUpCloseButton = By.cssSelector(".sportmaster-modal__quit");

	public HomePage(WebDriver driver) {

		this.driver = driver;

	}
	
	public String GetPopUpUserProfileGreetingSecondWord() {
		String popUpUserProfileGreetingText = driver.findElement(popUpUserProfileGreetingTitle).getText();
		String[] arrOfPopUpUserProfileGreetingText = popUpUserProfileGreetingText.split(" ", 3);
		return arrOfPopUpUserProfileGreetingText[1].replaceAll(",", "");
	}
	
	public HomePage ClickLogoutButton () {
		driver.findElement(logoutButton).click();
		return this;
	}
	
	public HomePage CloseUserProfileGreetingPopUp () {
		driver.findElement(userProfileGreetingPopUpCloseButton).click();
		return this;
	}
	
	public String GetUserProfileGreetingSecondWord() {
		String userProfileGreetingText = driver.findElement(userProfileGreetingTitle).getText();
		String[] arrOfUserProfileGreetingText = userProfileGreetingText.split(" ", 3);
		return arrOfUserProfileGreetingText[1].replaceAll(",", "");
	}

}
