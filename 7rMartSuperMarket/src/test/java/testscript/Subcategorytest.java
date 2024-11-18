package testscript;

import org.testng.annotations.Test;

import pages.Categorypage;
import pages.Loginpage;
import pages.Subcategorypage;

public class Subcategorytest extends Base {
	@Test
	public void verifyuserisabletosearchsubcategory() {

		String username = "admin";
		String password = "admin";

		String subcategoryname1 = "JonaGold211024040305";

		Loginpage loginpage = new Loginpage(driver);
		loginpage.enterusernamefield(username);
		loginpage.enterpasswordfield(password);
		loginpage.clickonsigninbutton();
		Subcategorypage subcategory = new Subcategorypage(driver);
		subcategory.isuserabletoclickonsubcategoryinfo();

		subcategory.isuserabletoclickonsubcategorynew();
		subcategory.isuserabletoselectcateoryfromsubcategorynew(2);
		subcategory.isuserabletoselectsubcateoryfromsubcategorynew(subcategoryname1);

		/*
		 * subcategory.isuserabletoclickonsubcategoryinfo();
		 * subcategory.isuserabletoclickonsearchsubcategorybutton();
		 * subcategory.isuserabletoselectcategory(2);
		 * subcategory.entersubcategoryname(subcategoryname);
		 * subcategory.isuserabletosearch(); subcategory.isuserabletoreset();
		 */

	}
}
