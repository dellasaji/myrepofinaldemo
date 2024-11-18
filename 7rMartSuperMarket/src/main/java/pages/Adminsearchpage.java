package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.pageutilities;

public class Adminsearchpage {
	WebDriver driver;

	public Adminsearchpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")
	WebElement adminusermoreinfo;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	WebElement adminsearchbutton;
	@FindBy(xpath = "//input[@id='un']")
	WebElement adminsearchusername;
	@FindBy(xpath = "//select[@id='ut']")
	WebElement adminsearchusertype;
	@FindBy(xpath = "//button[@class='btn btn-block-sm btn-danger' and @value='sr']")
	WebElement searchadminresult;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-warning']")
	WebElement adminreset;
	@FindBy(xpath = "//span[@id='res']")
	WebElement resultnotfound;

	public void isuserisabletoclickadminusermoreinfo() {
		adminusermoreinfo.click();
	}

	public boolean issearchbuttonvisible() {
		return adminsearchbutton.isDisplayed();
	}

	public void isuserabletoclickonadminsearchbutton() {
		adminsearchbutton.click();
	}

	public void isuserabletoentertheusernameinadminsearchpage(String searchusernamefield) {
		adminsearchusername.sendKeys(searchusernamefield);

	}

	public void isuserabletoselectusertypeinadminsearchpage(int index) {
		pageutilities pageutilities1 = new pageutilities(driver);
		pageutilities1.selectByIndexofElement(adminsearchusertype, index);
	}

	public void isuserabletoclickonsearchbutton() {
		searchadminresult.click();
	}

	public void isuserabletoclickonresetbutton() {
		adminreset.click();
	}

	public boolean resultnotfounderrormessage() {
		return resultnotfound.isDisplayed();
	}
}
