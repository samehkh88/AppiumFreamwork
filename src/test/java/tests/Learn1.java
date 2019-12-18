package tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class Learn1 extends Base {

	
	@Test
	public void clickon()
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementById("android:id/edit").sendKeys("Willkommen");
		driver.findElementsByClassName("android.widget.Button").get(1).click();
		//driver.findElementById("android:id/button1").click();
		
	}
}
