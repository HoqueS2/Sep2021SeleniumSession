package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookDropDownAssignment {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// drop down-- html tag --> select
		// Select class in selenium
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("shae@gmail.com");

		Thread.sleep(5000);

		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"))
				.click();
		Thread.sleep(5000);

		/*
		 * WebElement month = driver.findElement(By.id("month")); Select select = new
		 * Select(month); select.selectByIndex(5);// month
		 */
		// *****************************

		/*
		 * WebElement day = driver.findElement(By.id("day")); Select select1 = new
		 * Select(day); select1.selectByIndex(5);// month
		 */
		// *******************************
		// *****************************
		/*
		 * WebElement year = driver.findElement(By.id("year")); Select select2 = new
		 * Select(year); select2.selectByIndex(5);// month
		 */
		// *********************************
		By month = By.id("month");
		doDropDownSelectByIndex(month, 1);
		By day = By.id("day");
		doDropDownSelectByIndex(day, 1);
		By year = By.id("year");
		doDropDownSelectByIndex(year, 1);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doDropDownSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public static void doDropDownSelectByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}

	public static void doDropDownSelectByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

}
