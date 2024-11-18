package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import pages.Adminsearchpage;
import pages.Loginpage;
import utilities.Excelutility;

public class Adminsearchtest extends Base {
	@Test

	public void isuserabletosearchandresettheadminsearchpage() throws IOException {
		String username = Excelutility.getstringdata(1, 0, "Loginpage");
		String password = Excelutility.getstringdata(1, 1, "Loginpage");

		String newusername = Excelutility.getstringdata(1, 0, "Adminsearchpage");

		Loginpage loginpage = new Loginpage(driver);
		loginpage.enterusernamefield(username);
		loginpage.enterpasswordfield(password);
		loginpage.clickonsigninbutton();

		Adminsearchpage searchadmin = new Adminsearchpage(driver);
		searchadmin.isuserisabletoclickadminusermoreinfo();
		searchadmin.issearchbuttonvisible();
		searchadmin.isuserabletoclickonadminsearchbutton();
		searchadmin.isuserabletoentertheusernameinadminsearchpage(newusername);
		searchadmin.isuserabletoselectusertypeinadminsearchpage(2);
		searchadmin.isuserabletoclickonsearchbutton();
		searchadmin.isuserabletoclickonresetbutton();
		boolean isadminsearchpageid = searchadmin.resultnotfounderrormessage();
		Assert.assertTrue(isadminsearchpageid, Constant.USER_NOT_FOUND_MESAGE);
	}

}
