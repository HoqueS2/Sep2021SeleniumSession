package SeleniumSessions;

import org.openqa.selenium.WebDriver;

public class RegPageTest2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("chrome");
		brUtil.enterUrl("https://demo.opencart.com/index.php?route=account/register");
		String title = brUtil.getPageTitle();
		System.out.println(title);

		String firstName = "input-firstname";
		String lastName = "input-lastname";
		String email = "input-email";
		String telephone = "input-telephone";
		String password = "input-password";
		String passwordConfirm = "input-confirm";

		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys("id", firstName, "Sharmin");
		eleUtil.doSendKeys("id", lastName, "Hoque");
		eleUtil.doSendKeys("id", email, "naveen@gmail.com");
		eleUtil.doSendKeys("id", telephone, "0188-345-9091");
		eleUtil.doSendKeys("id", password, "naveen@123");
		eleUtil.doSendKeys("id", passwordConfirm, "naveen@123");

		Thread.sleep(5000);

		brUtil.closeBrowser();

	}

}
