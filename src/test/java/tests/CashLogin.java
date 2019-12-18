package tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class CashLogin extends Base{
	
	@Test
	public void UserCanLoginSuccessfully() 
	{
		
		try {
			Thread.sleep(4000);
			driver.findElementById("btn_login").click();
			Thread.sleep(3000);
			driver.findElementById("et_email").sendKeys("siry@yahoo.com");
			driver.findElementById("et_password").sendKeys("12345678");
			driver.findElementById("btn_login").click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		//driver.findElementByClassName("android.widget.ImageButton").click();
	}

}
