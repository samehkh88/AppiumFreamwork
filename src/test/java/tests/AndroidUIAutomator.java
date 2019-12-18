package tests;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

public class AndroidUIAutomator extends Base {

	
	@Test
	public void clickon()
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		//driver.findElementByAndroidUIAutomator("text(\"Animation\")").click();
		
		
		 //  Validate clickable feature for all options
	     //  driver.findElementsByAndroidUIAutomator("new UiSelector().property(value)");  
		
		//int x = driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size();
		//System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size()); 
		System.out.println("the size is " + driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
		
		
	}
}
