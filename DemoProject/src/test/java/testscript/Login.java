package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.ExcelUtility;

public class Login extends Base{
	
	@Test
	public void loginTest1() throws IOException
	{
		
		//String usernamevalue= "admin";
		//String passwordvalue= "admin";
		
		String usernamevalue= ExcelUtility.getStringData(1, 0, "Login_Page");
		String passwordvalue= ExcelUtility.getStringData(1, 1, "Login_Page");
		
		WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(usernamevalue);
		
		WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passwordvalue);
		
		WebElement signin= driver.findElement(By.xpath("//button[text()='Sign In']"));
		signin.click();
		
		WebElement dashboard= driver.findElement(By.xpath("//p[text()='Dashboard']"));
		Boolean ishomepageavailable= dashboard.isDisplayed();
		Assert.assertTrue(ishomepageavailable);
		
	}
	
	@Test
	public void loginTest2()
	{
		String usernamevalue= "admin";
		String passwordvalue= "password";
		
		WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(usernamevalue);
		
		WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passwordvalue);
		
		WebElement signin= driver.findElement(By.xpath("//button[text()='Sign In']"));
		signin.click();
		
		WebElement alert= driver.findElement(By.className("close"));
		Boolean isalertdisplayed= alert.isDisplayed();
		Assert.assertTrue(isalertdisplayed);
		
		
	}

}
