package tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import helper.Helper;
import helper.Locators;
import helper.Propirties;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GoInSocialNetwork {

	private WebDriver driver;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass
	public void setUp() throws Exception {
		String browser = Propirties.getBrowser();
		driver = Helper.choiseBrowser(browser, driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testGoToSocialNetworks() throws Exception {
		Helper.logIn(Propirties.getLogin(), Propirties.getPassword(), driver);
		driver.findElement(Locators.getImgFB()).click();
		driver.findElement(Locators.getImgInstagramm()).click();
		driver.findElement(Locators.getImgPinterest()).click();
		driver.findElement(Locators.getImgWorldPress()).click();
		String parentHandle = driver.getWindowHandle();
		driver.findElement(Locators.getImgTwitter()).click();
		Thread.sleep(5000);
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		try {
			assertEquals(driver.getTitle(),
					"Tweets avec des réponses de American Body Art (@americanbodyart) | Twitter");
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		driver.close();
		driver.switchTo().window(parentHandle);

		driver.findElement(Locators.getButtonLogOut()).click();
	}

	
	@Test
	public void testGoToSocialNetworksWitoutLogIn() throws Exception {
		driver.get(Propirties.getBaseUrl());
		driver.findElement(Locators.getImgFB()).click();
		driver.findElement(Locators.getImgInstagramm()).click();
		driver.findElement(Locators.getImgPinterest()).click();
		driver.findElement(Locators.getImgWorldPress()).click();
		String parentHandle = driver.getWindowHandle();
		driver.findElement(Locators.getImgTwitter()).click();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		try {
			assertEquals(driver.getTitle(),
					"Tweets avec des réponses de American Body Art (@americanbodyart) | Twitter");
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		driver.close();
		driver.switchTo().window(parentHandle);
	}

	
	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		driver.close();

	}
}
