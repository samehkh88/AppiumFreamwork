package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class TouchAction extends Base {


	@Test
	public void clickon()
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		WebElement links = driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")");

		//here start touch action
		io.appium.java_client.TouchAction action = new io.appium.java_client.TouchAction(driver);
		action.tap(links);
		action.perform();

		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();

		
		io.appium.java_client.TouchAction action1 = new io.appium.java_client.TouchAction(driver);
		WebElement PeopleNames = driver.findElementByAndroidUIAutomator("text(\"People Names\")");
		action1.longPress(PeopleNames , 3000).release();
		action1.perform();

		String text = driver.findElementByAndroidUIAutomator("text(\"Sample menu\")").getText();
		System.out.println("after the long press the text is " + text);
	}
}
