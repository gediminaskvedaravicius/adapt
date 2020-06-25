package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Email {

	WebDriver driver;

	By addInboxButton = By.cssSelector("a:nth-child(3) > span");
	By usernameInputField = By.cssSelector(".user_name");
	By acceptButton = By.cssSelector(".button");
	By verificationLetter = By.cssSelector(".fn");
	By activateAccountButton = By.cssSelector("td > a");

    public Email (WebDriver driver) {
		
		this.driver = driver;

	}

	public void EmailVerification() {
		
		String email = "testdummy42";
		
		WebDriverWait wait = new WebDriverWait(driver,120);
		driver.get("https://getnada.com/");
		driver.findElement(addInboxButton).click();
		wait.until(ExpectedConditions.elementToBeClickable(usernameInputField)).clear();
		driver.findElement(usernameInputField).sendKeys(email);
		driver.findElement(acceptButton).click();
		wait.until(ExpectedConditions.elementToBeClickable(verificationLetter));
		driver.findElement(verificationLetter).click();
		driver.switchTo().frame("idIframe");
		driver.findElement(activateAccountButton).click();
	}
}
