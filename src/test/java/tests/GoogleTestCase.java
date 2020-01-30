package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class GoogleTestCase extends ChromeBase {
	
	@Test
	public void UserCanSearchIngoogleSuccessfully() 
	{
		
		driver.findElement(By.id("signup-button")).click();
		driver.findElement(By.id("firstname_input")).sendKeys("Sameh");
		driver.findElement(By.id("lastname_input")).sendKeys("Khalil");
		driver.findElement(By.xpath(".//button[@value='Next']")).click();
		
		WebElement day = driver.findElement(By.id("day"));
		Select selDay = new Select(day);
		selDay.selectByValue("11");
		
		WebElement month = driver.findElement(By.id("month"));
		Select selmMonth = new Select(month);
		selmMonth.selectByValue("5");
		
		WebElement Year = driver.findElement(By.id("year"));
		Select selYear = new Select(Year);
		selYear.selectByValue("1988");
		
		driver.findElement(By.xpath(".//button[@value='Next']")).click();
	}

}
