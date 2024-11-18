package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.Homepage;
import pages.Loginpage;
import utilities.Excelutility;

public class Homepagetest extends Base {
	Homepage homepage;

	@Test
	public void userisabletoclicklogout() throws IOException {
		String username = Excelutility.getstringdata(1, 0, "Loginpage");
		String password = Excelutility.getstringdata(1, 1, "Loginpage");

		Loginpage loginpage = new Loginpage(driver);
		loginpage.enterusernamefield(username).enterpasswordfield(password);

		homepage = loginpage.clickonsigninbutton();
		homepage.isuserabletoclickonadmin();
		homepage.isuserabletoclickonlogout();

	}

}
