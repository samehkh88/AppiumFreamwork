package tests;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class ChromeBase {

	//public static AndroidDriver<AndroidElement> driver ;
	

	public AppiumDriver<MobileElement> driver ;
	DesiredCapabilities cap= new DesiredCapabilities();	
	
	@BeforeSuite
	public void startEmelator() throws MalformedURLException 
	{
		
		cap.setCapability("chromedriverExecutable",System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		
		//sameh device
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "GBT4C18C13004907" );
		
		// tablet
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "5203d634f4039303" );
		
		cap.setCapability("platformName", "Android");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		cap.setCapability("platformVersion", "9");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub") ,cap);
		driver.get("http://www.facebook.com");
	}
}
