package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploadutility {
	public void verify_FileUpload_UsingSendkeys() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/upload/");

		// "C:\Users\della\git\seleniumrepo\seleniumbasics\src\main\resources\Campaign
		// speech.docx"
		WebElement choosebutton = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		choosebutton.sendKeys(
				"C:\\Users\\della\\git\\seleniumrepo\\seleniumbasics\\src\\main\\resources\\Campaign speech.docx");
		WebElement terms = driver.findElement(By.id("terms"));
		terms.click();
		WebElement submit = driver.findElement(By.id("submitbutton"));
		submit.click();
	}

	public void verify_FileUpload_UsingRobot() throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		WebElement selectfile = driver.findElement(By.xpath("//div[@id='uploader']"));
		selectfile.click();
		StringSelection s = new StringSelection("C:\\Users\\della\\This is a sample pro.pdf");
		// Toolkit
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		Robot robot = new Robot();
		robot.delay(250);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(90);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
