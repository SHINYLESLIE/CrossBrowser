package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
	
	@Test
	public void verifyTheUserIsAbleToLoginUsingValidCredentials() throws IOException
	{
		//String usernamevalue= "admin";
		//String passwordvalue= "admin";
		
		String usernamevalue= ExcelUtility.getStringData(1, 0, "Login_Page");
		String passwordvalue= ExcelUtility.getStringData(1, 1, "Login_Page");
		
		LoginPage loginpage= new LoginPage(driver);
		loginpage.enterUserName(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		loginpage.clickOnSigninButton();
		Boolean ishomepageavailable= loginpage.isDashboardLoaded();
		Assert.assertTrue(ishomepageavailable);
	}
	
	@Test
	public void verifyTheUserIsAbleToLoginUsingInvalidCredentials1() throws IOException
	{
		//String usernamevalue= "wrong";
		//String passwordvalue= "admin";
		
		String usernamevalue= ExcelUtility.getStringData(2, 0, "Login_Page");
		String passwordvalue= ExcelUtility.getStringData(2, 1, "Login_Page");
		
		
		LoginPage loginpage= new LoginPage(driver);
		loginpage.enterUserName(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		loginpage.clickOnSigninButton();
		Boolean isredalertdisplayed= loginpage.isAlertDisplayed();
		Assert.assertTrue(isredalertdisplayed);
	}
	
	@Test
	public void verifyTheUserIsAbleToLoginUsingInvalidCredentials2() throws IOException
	{
		//String usernamevalue= "admin";
		//String passwordvalue= "wrong";
		
		String usernamevalue= ExcelUtility.getStringData(3, 0, "Login_Page");
		String passwordvalue= ExcelUtility.getStringData(3, 1, "Login_Page");		
		
		
		LoginPage loginpage= new LoginPage(driver);
		loginpage.enterUserName(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		loginpage.clickOnSigninButton();
		Boolean isredalertdisplayed= loginpage.isAlertDisplayed();
		Assert.assertTrue(isredalertdisplayed);
	}
	
	@Test
	public void verifyTheUserIsAbleToLoginUsingInvalidCredentials3() throws IOException
	{
		//String usernamevalue= "incorrect";
		//String passwordvalue= "wrong";
		
		String usernamevalue= ExcelUtility.getStringData(4, 0, "Login_Page");
		String passwordvalue= ExcelUtility.getStringData(4, 1, "Login_Page");
		
		LoginPage loginpage= new LoginPage(driver);
		loginpage.enterUserName(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		loginpage.clickOnSigninButton();
		Boolean isredalertdisplayed= loginpage.isAlertDisplayed();
		Assert.assertTrue(isredalertdisplayed);
	}

}
