package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class pageutilities {
	public WebDriver driver;

	public pageutilities(WebDriver driver) {

		this.driver = driver;
	}

	public void selectByIndexofElement(WebElement dropdown, int index) {

		Select select = new Select(dropdown);
		select.selectByIndex(index);
	}
}
