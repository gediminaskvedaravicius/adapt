package resources;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowHandle {

	WebDriver driver;

	public WindowHandle(WebDriver driver) {

		this.driver = driver;

	}

	public void MoveToSecondWindow() {

		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);

	}

}
