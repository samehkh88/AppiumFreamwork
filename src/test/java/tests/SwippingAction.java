package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class SwippingAction extends Base {


	@Test
	public void clickon()
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		driver.findElementByXPath("//*[@content-desc='9']").click();

		WebElement minDes = driver.findElementByXPath("//*[@content-desc='15']");
		WebElement minDepart = driver.findElementByXPath("//*[@content-desc='45']");
		
		io.appium.java_client.TouchAction action = new io.appium.java_client.TouchAction(driver);
		action.press(minDes).moveTo(minDepart).release();
		action.perform();
	}
}
