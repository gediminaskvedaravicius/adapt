package Tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LandingPage;
import Pages.LoginPage;
import Pages.RegisterNewUserPage;
import resources.Email;
import resources.WindowHandle;

public class NewUserTests extends Base {

	WebDriver driver;

	public void InitPages() {

		LandingPage = new LandingPage(driver);
		LoginPage = new LoginPage(driver);
		RegisterNewUserPage = new RegisterNewUserPage(driver);
		HomePage = new HomePage(driver);
		Email = new Email(driver);
		WindowHandle = new WindowHandle(driver);
	}

	@BeforeTest
	public void BeforeTest() throws IOException {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\main\\java\\drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("incognito");
		driver = new ChromeDriver(options);
		driver.get("https://sportmaster.dk/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		InitPages();
	}

	@Test
	public void CreateNewUserTest() throws InterruptedException {

		String firstName = "Gediminas";
		String lastName = "Kvedaravicius";
		String password = "pass123";
		String email = "testdummy42@getnada.com";

		LandingPage
		.ClickOnAcceptCookiesButton()
		.ClickOnSignInButton();

		LoginPage.ClickOnRegisterNewUserLink();

		RegisterNewUserPage
		.EnterFirstName(firstName)
		.EnterLastName(lastName)
		.EnterEmail(email)
		.EnterPassword(password)
		.ClickOnMaleGender()
		.ClickOntermsAcceptanceCheckbox()
		.ClickOnsumbitButton();

		Email
		.EmailVerification();

		WindowHandle
		.MoveToSecondWindow();

		Assert.assertEquals(firstName, HomePage.GetPopUpUserProfileGreetingSecondWord());

		HomePage
		.CloseUserProfileGreetingPopUp()
		.ClickLogoutButton();

		LandingPage
		.ClickOnSignInButton();

		LoginPage
		.EnterEmail(email)
		.EnterPassword(password)
		.ClickLogInButton();

		Assert.assertEquals(firstName, HomePage.GetUserProfileGreetingSecondWord());
	}
	
	@AfterTest
	public void AfterTest() {
		driver.quit();
	}
}
