package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.Constant;
import pages.Loginpage;
import utilities.Excelutility;

public class Logintest extends Base {
	@DataProvider(name = "credentials")
	public Object[][] testdata() {
		Object[][] input = new Object[2][2];
		input[0][0] = "admin";
		input[0][1] = "admin";
		input[1][0] = "adminadmin";
		input[1][1] = "admin";

		return input;
	}

	@Test(dataProvider = "credentials")
	public void verifyuserisabletologinwithvalidcredentials(String username, String password) throws IOException {

		
		Loginpage loginpage = new Loginpage(driver);
		loginpage.enterusernamefield(username);
		loginpage.enterpasswordfield(password);
		loginpage.clickonsigninbutton();
		boolean ishomepageloaded = loginpage.is_dasboard_display();
		Assert.assertTrue(ishomepageloaded, Constant.ERRORMESSAGEFORLOGINPAGE);
	}

	@Test(groups = { "smoke" })

	public void verifyuserisnotabletologinwithinvalidusername() throws IOException {
		String username = Excelutility.getstringdata(2, 0, "Loginpage");
		String password = Excelutility.getstringdata(2, 1, "Loginpage");

		Loginpage loginpage = new Loginpage(driver);
		loginpage.enterusernamefield(username);
		loginpage.enterpasswordfield(password);
		loginpage.clickonsigninbutton();
		boolean errormessagedis = loginpage.iserrormessagedisplayed();
		Assert.assertTrue(errormessagedis, Constant.ERRORMESSAGEFORLOGINPAGE);

	}

	@Test
	@Parameters({ "username", "password" })
	public void verifyuserisnotabletologinwithinvalidpassword(String username, String password) throws IOException {
		
		Loginpage loginpage = new Loginpage(driver);
		loginpage.enterusernamefield(username);
		loginpage.enterpasswordfield(password);
		loginpage.clickonsigninbutton();
		boolean errormessagedis = loginpage.iserrormessagedisplayed();
		Assert.assertTrue(errormessagedis, Constant.ERRORMESSAGEFORLOGINPAGE);

	}

	@Test(retryAnalyzer = retry.Retry.class)
	public void verifyuserisnotabletologinwithinvalidcredentials() throws IOException {
		String username = Excelutility.getstringdata(4, 0, "Loginpage");
		String password = Excelutility.getstringdata(4, 1, "Loginpage");
		Loginpage loginpage = new Loginpage(driver);
		loginpage.enterusernamefield(username);
		loginpage.enterpasswordfield(password);
		loginpage.clickonsigninbutton();
		boolean errormessagedis = loginpage.iserrormessagedisplayed();
		Assert.assertTrue(errormessagedis, Constant.ERRORMESSAGEFORLOGINPAGE);

	}
}
