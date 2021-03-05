package src;

import org.openqa.selenium.WebDriver;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_4_3_webScreenShot {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://api.jquery.com/dblclick/");		


		takeSnapShot("ScrenShot1") ;    
		
		driver.close();
		driver.quit();

	}

	public static void takeSnapShot(String fileWithPath) throws Exception{

		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);


		FileUtils.copyFile(file, new File("src/test/resources/src"+fileWithPath+".jpg"));

	}
}
