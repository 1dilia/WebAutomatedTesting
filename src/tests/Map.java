package tests;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import helper.Helper;
import helper.Locators;
import helper.Propirties;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Map {

	private WebDriver driver;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass
	public void setUp() throws Exception {
		String browser = Propirties.getBrowser();
		driver = Helper.choiseBrowser(browser, driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testMap() throws Exception {
		 driver.get(Propirties.getBaseUrl()); //без регистрации
//		Helper.logIn(Propirties.getLogin(), Propirties.getPassword(), driver);
		driver.findElement(Locators.getButtonContact()).click();
		driver.findElement(Locators.getFieldMapAddress()).click();
		driver.findElement(Locators.getFieldMapAddress()).click();
		driver.findElement(Locators.getFieldMapAddress()).clear();
		driver.findElement(Locators.getFieldMapAddress()).sendKeys(Propirties.getAddressMap());
		driver.findElement(Locators.getButtonMapSearch()).click();
		assertTrue(isElementPresent(Locators.getTitlePopUp()));
		driver.findElement(Locators.getClosePopUp()).click();
		driver.findElement(Locators.getButtonZoomIn()).click();
		driver.findElement(Locators.getButtonZoomOut()).click();
		driver.findElement(Locators.getButtonList()).click();
		driver.findElement(Locators.getButtonListSatellite()).click();
		driver.findElement(Locators.getButtonList()).click();
		driver.findElement(Locators.getButtonListHybrid()).click();
		driver.findElement(Locators.getButtonFull()).click();
		driver.findElement(Locators.getButtonFullBack()).click();
		driver.findElement(Locators.getButtonHomePage()).click();
//		driver.findElement(Locators.getButtonLogOut()).click();
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		driver.quit();
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
