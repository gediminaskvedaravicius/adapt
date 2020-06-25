package Tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import Pages.HomePage;
import Pages.LandingPage;
import Pages.LoginPage;
import Pages.RegisterNewUserPage;
import resources.Email;
import resources.WindowHandle;

public class Base {

	WebDriver driver;

	public LandingPage LandingPage;
	public LoginPage LoginPage;
	public RegisterNewUserPage RegisterNewUserPage;
	public HomePage HomePage;
	public Email Email;
	public WindowHandle WindowHandle;
	public Properties prop;
}
