package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Helper {
	public static WebDriver choiseBrowser(String browser, WebDriver driver) {
		if (browser == "chrome") {
			String[] property = { "webdriver.chrome.driver", "D:\\\\chromedriver.exe" };
			System.setProperty(property[0], property[1]);
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			driver = new ChromeDriver(options);
		}
		if (browser == "firefox") {
			String[] property = { "webdriver.gecko.driver", "D:\\\\geckodriver.exe" };
			System.setProperty(property[0], property[1]);
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("start-maximized");
			driver = new FirefoxDriver(options);
		}
		return driver;
	}

	public static void logIn(String login, String password, WebDriver driver) {
		driver.get(Propirties.getBaseUrl() + "/");
		driver.findElement(By.linkText("Login with E-mail")).click();
		driver.findElement(Locators.getFieldEmail()).clear();
		driver.findElement(Locators.getFieldEmail()).sendKeys(login);
		driver.findElement(Locators.getFieldPassword()).clear();
		driver.findElement(Locators.getFieldPassword()).sendKeys(password);
		driver.findElement(Locators.getButtonEnter()).click();
	}
	
	public static void makeRegister(String name, String mail, String password, 
			                 String passwordConfirm, WebDriver driver) {
		driver.get(Propirties.getBaseUrl());
	    driver.findElement(Locators.getButtonRegister()).click();
	    driver.findElement(Locators.getFieldNameReg()).clear();
	    driver.findElement(Locators.getFieldNameReg()).sendKeys(name);
	    driver.findElement(Locators.getFieldEmailReg()).clear();
	    driver.findElement(Locators.getFieldEmailReg()).sendKeys(mail);
	    driver.findElement(Locators.getFieldPasswordReg()).clear();
	    driver.findElement(Locators.getFieldPasswordReg()).sendKeys(password);
	    driver.findElement(Locators.getFieldPasswordConfirmReg()).clear();
	    driver.findElement(Locators.getFieldPasswordConfirmReg()).sendKeys(passwordConfirm);
	    driver.findElement(Locators.getButtonAcceptRegister()).click();
	}

}
