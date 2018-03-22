package classRetired;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class References {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://tattoo.obmenka.by/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testReferences() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Register")).click();
    driver.findElement(By.linkText("Register")).click();
    driver.findElement(By.id("name")).clear();
    driver.findElement(By.id("name")).sendKeys("1");
    driver.findElement(By.id("name")).clear();
    driver.findElement(By.id("name")).sendKeys("1");
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("dfs1@gfg.ru");
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("dfs1@gfg.ru");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("111111");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("111111");
    driver.findElement(By.id("password-confirm")).clear();
    driver.findElement(By.id("password-confirm")).sendKeys("111111");
    driver.findElement(By.id("password-confirm")).clear();
    driver.findElement(By.id("password-confirm")).sendKeys("111111");
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.linkText("Logout")).click();
    driver.findElement(By.linkText("Logout")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
