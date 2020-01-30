package tests;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ScrollToLink extends Base{

	@Test
	public void ScrollToSpiecialLink()
	{
	WebElement views = driver.findElementByAndroidUIAutomator("text(\"Views\")");
	views.click();
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Spinner\"))");
	
	
	}
}
