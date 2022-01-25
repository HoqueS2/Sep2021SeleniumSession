package SeleniumSessions;

public class AmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil br = new BrowserUtil();
		br.launchBrowser("chrome");
		br.launchBrowser(null);

		// br.enterUrl("http://www.amazon.com");
		String title = br.getPageTitle();
		System.out.println(title);
		if (title.contains("Amazon")) {
			System.out.println("correct title");
		}

		String url = br.getAppCurrentUrl();
		System.out.println(url);

		br.closeBrowser();

	}

}
