package tests;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static AndroidDriver<AndroidElement> driver ;
	
	@BeforeSuite
	public void startEmelator() throws MalformedURLException 
	{
		File fis = new File(System.getProperty("user.dir")+"\\APK\\");
		
		//File fs = new File(fis, "CashSwapTestV0.27..apk");
		File fs = new File(fis, "ApiDemos-debug.apk");
		
		DesiredCapabilities cap= new DesiredCapabilities();
		
		
		// emulator device
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "samDV" );
	
		// real device
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "5203d634f4039303" );
		
	
		//new step 
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		 driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub") ,cap);
		
	}
}
