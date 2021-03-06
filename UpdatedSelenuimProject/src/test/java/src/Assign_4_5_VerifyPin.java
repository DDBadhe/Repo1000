package src;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assign_4_5_VerifyPin {

	@Test	
	public void name() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//		driver.manage().window().maximize();
		driver.get("https://chennaiiq.com/chennai/pincode-by-name.php");	

		List<WebElement> list = driver.findElements(By.xpath("//table[@class='TBox']//tbody/descendant::tr[@class='tab']"));

		System.out.println(list.size());

		String pin1 = null;
		String pin2 = null;

		for (int i=0; i<list.size(); i++) {
			if (list.get(i).getText().contains("Annanagar Western Extn")) {
				System.out.println(list.get(i).getText());

				String[] l1 = list.get(i).getText().split("  ");
				
				pin1 = l1[l1.length-1];
				break;

			}
		}
		for (int i=0; i<list.size(); i++) {

			if (list.get(i).getText().contains("Central Institute Of Tech")) {
				System.out.println(list.get(i).getText());
				String[] l2 = list.get(i).getText().split("  ");

				pin2 = l2[l2.length-1];
				break;


			}

		}

		System.out.println("pin1 "+pin1+" and pin2 "+pin2 );

		Assert.assertNotEquals(pin1, pin2);

		driver.close();
		driver.quit();

	}
}
