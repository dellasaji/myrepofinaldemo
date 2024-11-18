package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Subcategorypage {
	WebDriver driver;

	public Subcategorypage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement subcategorynew;
	@FindBy(xpath = "//select[@class='form-control selectpicker']")
	WebElement subcategorynewcategoryselect;
	@FindBy(xpath = "//input[@id='subcategory']")
	WebElement subcategorynewsubcategoryselect;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-sub-category' and @class='small-box-footer'][1]")
	WebElement categorysubinfolink;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	WebElement subcategorysearch;
	@FindBy(xpath = "//select[@class='form-control selectpicker']")
	WebElement selectcategory;
	@FindBy(xpath = "//input[@name='ut']")
	WebElement subcategoryname;
	@FindBy(xpath = "//i[@class='fa fa-search']")
	WebElement search;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-sub-category' and @class='btn btn-rounded btn-warning']")
	WebElement reset;
	@FindBy(xpath = "")
	WebElement choosefile;
	//// input[@name='main_img']

	public void isuserabletoclickonsubcategoryinfo() {
		categorysubinfolink.click();
	}

	public void isuserabletoclickonsearchsubcategorybutton() {
		subcategorysearch.click();
	}

	public void isuserabletoclickonsubcategorynew() {
		subcategorynew.click();
	}

	public void isuserabletoselectcateoryfromsubcategorynew(int index) {
		Select dropdown = new Select(subcategorynewcategoryselect);
		dropdown.selectByIndex(index);
	}

	public void isuserabletoselectsubcateoryfromsubcategorynew(String usernamefield1) {
		subcategorynewsubcategoryselect.sendKeys(usernamefield1);
	}

	public void isuserabletoselectcategory(int index) {
		Select dropdown = new Select(selectcategory);
		dropdown.selectByIndex(index);
	}

	public void entersubcategoryname(String usernamefield) {
		subcategoryname.sendKeys(usernamefield);
	}

	public void isuserabletosearch() {
		search.click();
	}

	public void isuserabletoreset() {
		reset.click();
	}

	public void isuserabletouploadafile(String IMAGEUPLOADPATH) {
		// wait.waitForVisibilityOfElement(driver, choosefile);

		choosefile.sendKeys(IMAGEUPLOADPATH);
	}
}
