package classRetired;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import helper.DataDriven;
import helper.Helper;
import helper.Locators;
import helper.Propirties;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestRegister2 {

  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass
	public void setUp() throws Exception {
		String browser = Propirties.getBrowser();
		driver = Helper.choiseBrowser(browser, driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
  
  
  
  @Test(dataProvider = "dataRegister2", dataProviderClass = DataDriven2.class)
public void testRegistrationForm(String name, String mail, String password, 
                                 String passwordConfirm, String result) throws Exception {         
	  
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
		}
}
  
  

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
