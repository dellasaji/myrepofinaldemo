package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;
import java.awt.datatransfer.StringSelection;

public class Categorypage {

	WebDriver driver;

	public Categorypage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category' and @class='small-box-footer'][1]")
	WebElement categoryinfolink;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newcategory;
	@FindBy(xpath = "//input[@class='form-control']")
	WebElement categoryfield;
	@FindBy(xpath = "//li[@id='134-selectable']")
	WebElement selectgroup;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement categorycreateConfirmation;

	@FindBy(xpath = "//input[@name='main_img']")
	WebElement choosefile;
	@FindBy(xpath = "//button[@name='create']")
	WebElement savebutton;

	public void isuserabletoclickonCategoryinfo() {
		categoryinfolink.click();
	}

	public void isuserabletoclickonnewcategorybutton() {
		newcategory.click();
	}

	public void isuserabletoentercategory(String categoryname) {
		categoryfield.sendKeys(categoryname);
	}

	public void isuserabletoselectthegroup() {
		selectgroup.click();
	}

	public boolean getvalidConfirmationforCategorycreation() {

		return categorycreateConfirmation.isDisplayed();
	}

	public void isuserabletouploadafile(String IMAGEUPLOADPATH) {
		// wait.waitForVisibilityOfElement(driver, choosefile);

		choosefile.sendKeys(IMAGEUPLOADPATH);
	}

}
