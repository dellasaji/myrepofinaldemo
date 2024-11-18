package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Weightutility {
	public WebDriver driver;

	public void waitForVisibilityOfElement(WebDriver driver, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
