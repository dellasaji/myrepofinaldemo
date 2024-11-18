package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import pages.Categorypage;
import pages.Loginpage;
import utilities.Excelutility;

public class Categorytest extends Base {
	@Test
	public void verifyuserisabletoaddcategory() throws IOException {

		String username = Excelutility.getstringdata(1, 0, "Loginpage");
		String password = Excelutility.getstringdata(1, 1, "Loginpage");

		String category = Excelutility.getstringdata(1, 0, "Categorypage");

		Loginpage loginpage = new Loginpage(driver);
		loginpage.enterusernamefield(username);
		loginpage.enterpasswordfield(password);
		loginpage.clickonsigninbutton();
		Categorypage categorypage = new Categorypage(driver);
		categorypage.isuserabletoclickonCategoryinfo();
		categorypage.isuserabletoclickonnewcategorybutton();
		categorypage.isuserabletoentercategory(category);
		categorypage.isuserabletoselectthegroup();
		boolean isneCategoryCreated = categorypage.getvalidConfirmationforCategorycreation();
		Assert.assertTrue(isneCategoryCreated, Constant.CONFIRMATION_MESSAGE_FOR_NEW_CATEGORY_CREATION);
	}
}
