package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {

	public WebDriver driver;

	By acceptCookiesButton = By.cssSelector("[aria-label='Det er fint']");
	By SignInButton = By.cssSelector("a[href='/user']");

	public LandingPage(WebDriver driver) {

		this.driver = driver;

	}

	public LandingPage ClickOnAcceptCookiesButton() {
		driver.findElement(acceptCookiesButton).click();
		return this;
	}

	public LandingPage ClickOnSignInButton() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(SignInButton));
		driver.findElement(SignInButton).click();
		return this;
	}

}
