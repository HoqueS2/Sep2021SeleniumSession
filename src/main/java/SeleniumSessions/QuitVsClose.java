package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuitVsClose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// session id

		// System.setProperty("webdriver.chrome.driver",
		// "//Users//sharminhoque//Downloads//chromedriver");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();// launch chrome
		driver.get("https://www.google.com");// launch url
		String title = driver.getTitle();// get the title
		System.out.println("page title is: " + title);

		// driver.close();
		driver.quit();// close the browser

		driver = new ChromeDriver();// launch chrome
		driver.get("https://www.google.com");// launch url
		System.out.println(driver.getTitle());

	}

}
