package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPageTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("chrome");
		brUtil.enterUrl("https://demo.opencart.com/index.php?route=account/register");
		String title = brUtil.getPageTitle();
		System.out.println(title);

		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By passwordConfirm = By.id("input-confirm");

		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(firstName, "Sharmin");
		eleUtil.doSendKeys(lastName, "Hoque");
		eleUtil.doSendKeys(email, "sharmin@gmail.com");
		eleUtil.doSendKeys(telephone, "915-905-8811");
		eleUtil.doSendKeys(password, "SH00!@$00");
		eleUtil.doSendKeys(passwordConfirm, "SH00!@$00");

		Thread.sleep(5000);

		brUtil.closeBrowser();

	}

}
