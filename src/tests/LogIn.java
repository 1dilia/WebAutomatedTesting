package tests;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import com.google.common.base.Verify;

import helper.*;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogIn {

	private WebDriver driver;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass
	public void setUp() throws Exception {
		String browser = Propirties.getBrowser();
		driver = Helper.choiseBrowser(browser, driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test(dataProvider = "dataLogIn", dataProviderClass = DataDriven.class) // , groups = { "functional", "critical" })
	public void testLogIn(String login, String password, String result) throws Exception {

		Helper.logIn(login, password, driver);

		switch (result) {
		case "1":
			try {
				assertTrue(isElementPresent(Locators.getButtonLogOut()));
			} catch (Error e) {
				verificationErrors.append(e.toString());
			}
			driver.findElement(Locators.getButtonLogOut()).click();
			break;
		case "2":
			assertEquals(driver.findElement(By.cssSelector(".alert.alert-danger>ul>li")).getText(),
					"These credentials do not match our records.");
			break;
		case "3":
			assertEquals(driver.findElement(By.cssSelector(".alert.alert-danger>ul>li")).getText(),
					"The email field is required.");
			break;
		case "4":
			assertEquals(driver.findElement(By.cssSelector(".alert.alert-danger>ul>li")).getText(),
					"The password field is required.");
			break;
		case "5":
			assertEquals(driver.findElement(By.cssSelector(".alert.alert-danger>ul>li")).getText(),
					"The email field is required.");
			break;
		}

	}

	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		driver.close();
		// driver.quit();
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
}
