package testscript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base {
	
	WebDriver driver;
	
   @BeforeMethod
   @Parameters("browser")
	public void initializeBrowser(String browser) throws Exception 
	{
	   if(browser.equalsIgnoreCase("edge"))
	   {
		   driver= new EdgeDriver();
	   }
	   else if(browser.equalsIgnoreCase("chrome"))
	   {
		   driver= new ChromeDriver();
	   }
	   else if(browser.equalsIgnoreCase("firefox"))
	   {
		   driver= new FirefoxDriver();
	   }
	   else
	   {
		   throw new Exception ("Invalid Browser");
	   }
		driver= new EdgeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/admin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void quitAndClose()
	{
		//driver.close();
		//driver.quit();
	}

}
