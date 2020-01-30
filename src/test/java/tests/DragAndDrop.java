package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;

public class DragAndDrop extends Base {

	@Test
	public void DragAndDropTUT() 
	{
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
		
		// we need to use TouchAction class
		
		WebElement source = driver.findElementById("drag_dot_1");
		WebElement dest = driver.findElementById("drag_dot_2");
		TouchAction t = new TouchAction(driver);
		t.longPress(source).moveTo(dest).release();
		t.perform();
	}
}
