package utilities;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtility {
	public void captureFailureScreenShot(WebDriver driver, String name) throws IOException {
		// Interface & method for Capture Screenshot
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File screenShot = scrShot.getScreenshotAs(OutputType.FILE); // screenshot will store in temporary path
																	// "screenShot
		File f1 = new File(System.getProperty("user.dir") + "\\OutputScreenshots");// Generating folder using Java
																					// (user.dir) automatically folder
		String timeStamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date(0));// date time capture using
																							// java
		File finalDestination = new File(
				System.getProperty("user.dir") + "\\OutputScreenshots\\" + name + "_" + timeStamp + ".png");
		FileHandler.copy(screenShot, finalDestination);// copy screenshot from temp path to project folder
	}
}
