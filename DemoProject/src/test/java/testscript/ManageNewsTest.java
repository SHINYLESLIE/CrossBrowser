package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;

public class ManageNewsTest extends Base {

	@Test(retryAnalyzer = retry.Retry.class)
	public void verifyThatUserCanCreateNewsSuccessfully() {
		String usernamevalue = "admin";
		String passwordvalue = "admin";
		String news = "OFFER!!";

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		loginpage.clickOnSigninButton();

		ManageNewsPage managenewspage = new ManageNewsPage(driver);
		managenewspage.clickManageNewsMoreInfo();
		managenewspage.clickNewButton();
		managenewspage.newsContent(news);
		managenewspage.clickSaveButton();
		Boolean isalertdisplayed = managenewspage.isgreenAlertDisplay();
		Assert.assertTrue(isalertdisplayed);

	}
}
