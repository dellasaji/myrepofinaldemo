package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver driver;

	public Loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@class='form-control']")
	WebElement username;
	@FindBy(xpath = "//input[@type='password']")
	WebElement password;
	@FindBy(xpath = "//button[@class='btn btn-dark btn-block']")
	WebElement signin;
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	WebElement errormessage;
	@FindBy(xpath = "//p[text()='Dashboard']")
	WebElement dashboard;

	public Loginpage enterusernamefield(String usernamefield)

	{
		username.sendKeys(usernamefield);
		return this;
	}

	public Loginpage enterpasswordfield(String passwordfield) {
		password.sendKeys(passwordfield);
		return this;
	}

	public Homepage clickonsigninbutton() {
		signin.click();
		return new Homepage(driver);
	}

	/*
	 * public String errormessagedisplay() { return errormessage.getText(); }
	 */
	public boolean is_dasboard_display() {
		return dashboard.isDisplayed();
	}

	public boolean iserrormessagedisplayed() {
		return errormessage.isDisplayed();
	}
}
