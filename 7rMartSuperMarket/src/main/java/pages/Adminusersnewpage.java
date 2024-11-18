package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.pageutilities;

public class Adminusersnewpage {
	WebDriver driver;

	public Adminusersnewpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")
	WebElement adminusermoreinfo;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement adminusernew;
	@FindBy(xpath = "//input[@type='text' and @name='username']")
	WebElement username;
	@FindBy(xpath = "//input[@type='password']")
	WebElement password;
	@FindBy(xpath = "//select[@name='user_type']")
	WebElement selectusertype;
	@FindBy(xpath = "//button[@type='submit' and @name='Create']")
	WebElement savebutton;
	@FindBy(xpath = "//h1[text()='Admin Users']")
	WebElement adminuserspage;

	public Adminusersnewpage isuserisabletoclickadminusermoreinfo() {
		adminusermoreinfo.click();
		return new Adminusersnewpage(driver);
	}

	public Adminusersnewpage isuaerabletoclicknew() {
		adminusernew.click();
		return this;
	}

	public Adminusersnewpage enterusername(String usernamefield) {
		username.sendKeys(usernamefield);
		return this;
	}

	public Adminusersnewpage enterpassword(String passwordfield) {
		password.sendKeys(passwordfield);
		return this;
	}

	public Adminusersnewpage isuserabletoselectusertype(int index) {
		pageutilities pageutilities1 = new pageutilities(driver);
		pageutilities1.selectByIndexofElement(selectusertype, index);
		return this;
	}

	public Adminusersnewpage isuserabletocreatenewuser() {
		savebutton.click();
		return this;
	}

	public boolean isadminuserspagedisplayed() {
		return adminuserspage.isDisplayed();
	}

}
