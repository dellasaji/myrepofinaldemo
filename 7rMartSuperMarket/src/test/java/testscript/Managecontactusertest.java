package testscript;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import pages.Loginpage;
import pages.Managecontactuser;
import utilities.Excelutility;

public class Managecontactusertest extends Base {

	@Test
	public void verifyUserisAbletoUpdatetheContactUsInfomrationfields() throws IOException {

		String username = Excelutility.getstringdata(1, 0, "Loginpage");
		String password = Excelutility.getstringdata(1, 1, "Loginpage");

		String phonefieldinContactUspage = Excelutility.getintegerdata(1, 0, "ManageContactPage");
		String deliveryTimefieldinContactUspage = Excelutility.getstringdata(1, 1, "ManageContactPage");

		Loginpage loginpage = new Loginpage(driver);
		loginpage.enterusernamefield(username);
		loginpage.enterpasswordfield(password);
		loginpage.clickonsigninbutton();

		Managecontactuser managecontactpage = new Managecontactuser(driver);
		managecontactpage.isUserabletoClickonManageContactMoreInfoLink();
		managecontactpage.isUserabletoClickonActionButtoninManageCotactPage();
		managecontactpage.updatePhonefieldinContactUspage(phonefieldinContactUspage);

		managecontactpage.updateDeliverytimefieldinContactUspage(deliveryTimefieldinContactUspage);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		managecontactpage.isUserabletoClickonUpdateButton();
		boolean isContactInfoUpdate = managecontactpage.getvalidConfirmationforContractUpdate();
		Assert.assertTrue(isContactInfoUpdate, Constant.CONFIRMATION_MESSAGE_FOR_NEW_ADMINUSER_CREATION);

	}
}
