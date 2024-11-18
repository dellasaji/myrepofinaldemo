package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import pages.Adminusersnewpage;
import pages.Homepage;
import pages.Loginpage;
import utilities.Excelutility;

public class Adminusersnewtest extends Base {
	Adminusersnewpage adminuserpage;
	Homepage homepage;

	@Test

	public void userisabletoaddnewuser() throws IOException {
		String username = Excelutility.getstringdata(1, 0, "Loginpage");
		String password = Excelutility.getstringdata(1, 1, "Loginpage");

		String newusername = Excelutility.getstringdata(1, 0, "Adminusersnewpage");
		String newpassword = Excelutility.getstringdata(1, 1, "Adminusersnewpage");

		Loginpage loginpage = new Loginpage(driver);
		loginpage.enterusernamefield(username).enterpasswordfield(password);

		homepage = loginpage.clickonsigninbutton();
		adminuserpage = homepage.isuserisabletoclickadminusermoreinfo();
		adminuserpage.isuaerabletoclicknew().enterusername(newusername).enterpassword(newpassword)
				.isuserabletoselectusertype(2).isuserabletocreatenewuser();

		boolean isadminuserpagedis = adminuserpage.isadminuserspagedisplayed();
		Assert.assertTrue(isadminuserpagedis, Constant.CONFIRMATION_MESSAGE_FOR_NEW_ADMINUSER_CREATION);

	}

}
