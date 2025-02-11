package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@name='username']")private WebElement usernameField;
	@FindBy(xpath="//input[@name='password']")private WebElement passwordField;
	@FindBy(xpath="//button[text()='Sign In']")private WebElement signin;
	@FindBy(xpath="//p[text()='Dashboard']")private WebElement dashboard;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")private WebElement redalert;
	
	public void enterUserName(String usernamevalue)
	{
		usernameField.sendKeys(usernamevalue);
	}
	
	
	public void enterPassword(String passwordvalue)
	{
		passwordField.sendKeys(passwordvalue);
	}
	
	public void clickOnSigninButton()
	{
		signin.click();
	}
	
	public boolean isDashboardLoaded()
	{
		return dashboard.isDisplayed();
	
	}
	
	public boolean isAlertDisplayed() {
		return redalert.isDisplayed();
	}

}
