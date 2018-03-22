package tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import classRetired.DataDriven2;
import helper.DataDriven;
import helper.Helper;
import helper.Locators;
import helper.Propirties;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Register {

	private WebDriver driver;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass
	public void setUp() throws Exception {
		String browser = Propirties.getBrowser();
		driver = Helper.choiseBrowser(browser, driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test(dataProvider = "dataRegister", dataProviderClass = DataDriven.class)
	public void testRegistrationForm(String name, String mail, String password, String passwordConfirm, String result)
			throws Exception {

		Helper.makeRegister(name, mail, password, passwordConfirm, driver);

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
			assertEquals(driver.findElement(By.cssSelector(".panel-heading")).getText(), "Register");
			break;
		case "3":
			assertEquals(driver.findElement(By.cssSelector(".panel-heading")).getText(), "Register");
			break;
		case "4":
			assertEquals(driver.findElement(By.cssSelector(".panel-heading")).getText(), "Register");
			break;
		case "5":
			assertEquals(driver.findElement(By.cssSelector(".panel-heading")).getText(), "Register");
			break;
		}
	}

	@Test(dataProvider = "dataRegisterName", dataProviderClass = DataDriven.class)
	public void testRegistrationName(String name, String mail, String password, String passwordConfirm, String result)
			throws Exception {

		Helper.makeRegister(name, mail, password, passwordConfirm, driver);

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
			assertEquals(driver.findElement(By.cssSelector("strong")).getText(),
					"The name may not be greater than 255 characters.");
			break;
		case "3":
			try {
				assertTrue(isElementPresent(Locators.getButtonLogOut()));
			} catch (Error e) {
				verificationErrors.append(e.toString());
			}
			// driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			driver.findElement(Locators.getButtonLogOut()).click();
			break;
		 case "4":
		 assertEquals(driver.findElement(By.cssSelector(".panel-heading")).getText(),
		 "Register");
		 break;
		 case "5":
		 assertEquals(driver.findElement(By.cssSelector(".panel-heading")).getText(),
		 "Register");
		 break;
		}
	}

	// @Test(dataProvider = "dataRegister", dataProviderClass = DataDriven.class)
	// public void testRegistrationForm(String name, String mail, String password,
	// String passwordConfirm, String result) throws Exception {
	//
	// Helper.makeRegister(name, mail, password, passwordConfirm, driver);
	//
	// switch (result) {
	// case "1":
	// try {
	// assertTrue(isElementPresent(Locators.getButtonLogOut()));
	// } catch (Error e) {
	// verificationErrors.append(e.toString());
	// }
	// driver.findElement(Locators.getButtonLogOut()).click();
	// break;
	// case "2":
	// assertEquals(driver.findElement(By.cssSelector(".panel-heading")).getText(),
	// "Register");
	// break;
	// case "3":
	// assertEquals(driver.findElement(By.cssSelector(".panel-heading")).getText(),
	// "Register");
	// break;
	// case "4":
	// assertEquals(driver.findElement(By.cssSelector(".panel-heading")).getText(),
	// "Register");
	// break;
	// case "5":
	// assertEquals(driver.findElement(By.cssSelector(".panel-heading")).getText(),
	// "Register");
	// break;
	// }
	// }
	//
	// @Test(dataProvider = "dataRegisterName", dataProviderClass =
	// DataDriven.class)
	// public void testRegistrationName(String name, String mail, String password,
	// String passwordConfirm, String result) throws Exception {
	//
	// Helper.makeRegister(name, mail, password, passwordConfirm, driver);
	//
	// switch (result) {
	// case "1":
	// try {
	// assertTrue(isElementPresent(Locators.getButtonLogOut()));
	// } catch (Error e) {
	// verificationErrors.append(e.toString());
	// }
	// driver.findElement(Locators.getButtonLogOut()).click();
	// break;
	// case "2":
	// try {
	// assertTrue(isElementPresent(Locators.getButtonLogOut()));
	// } catch (Error e) {
	// verificationErrors.append(e.toString());
	// }
	// driver.findElement(Locators.getButtonLogOut()).click();
	//
	//
	// case "3":
	// assertEquals(driver.findElement(By.cssSelector(".panel-heading")).getText(),
	// "Register");
	// break;
	// case "4":
	// assertEquals(driver.findElement(By.cssSelector(".panel-heading")).getText(),
	// "Register");
	// break;
	// case "5":
	// assertEquals(driver.findElement(By.cssSelector(".panel-heading")).getText(),
	// "Register");
	// break;
	// }
	// }

	//
	// @Test(dataProvider = "dataRegister", dataProviderClass = DataDriven.class)
	// public void testRegisterFieldEmail(String name, String login, String
	// password, String result) throws Exception {
	// driver.get(Propirties.getBaseUrl());
	// driver.findElement(Locators.getButtonRegister()).click();
	// driver.findElement(Locators.getFieldNameReg()).clear();
	// driver.findElement(Locators.getFieldNameReg()).sendKeys("1");
	// driver.findElement(Locators.getFieldEmailReg()).clear();
	// driver.findElement(Locators.getFieldEmailReg()).sendKeys("dijn11@gfg.ru");
	// driver.findElement(Locators.getFieldPasswordReg()).clear();
	// driver.findElement(Locators.getFieldPasswordReg()).sendKeys("111111");
	// driver.findElement(Locators.getFieldPasswordConfirmReg()).clear();
	// driver.findElement(Locators.getFieldPasswordConfirmReg()).sendKeys("111111");
	// driver.findElement(Locators.getButtonAcceptRegister()).click();
	// driver.findElement(Locators.getButtonLogOut()).click();
	//
	// }

	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		driver.close();

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
