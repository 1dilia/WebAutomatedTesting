package classRetired;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import Helper.Helper;
import Helper.Locators;
import Helper.Propirties;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TrialTrip {

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
		driver.get(Propirties.getBaseUrl() + "/"); // ��� �����������
	
		ArrayList(Collection <driver.findElements(By.cssSelector("a:links"))> col)
		list = driver.findElements(By.cssSelector("a:links"));
		driver.findElement(By.cssSelector("a:links")).click();
		driver.findElement(By.cssSelector("a:links")).click();
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		driver.close();
		// driver.quit();
	}

}


���� ����� �����������
��� ��������� ������ ������ ������ ������������ ����� ������: 
| store | javascript{"user-id-" + Math.floor(Math.random() * 100) + "@mysite.com";} | variable |    (��� �� �������� ����� � ���������� � ����������, ��������:  user-id-100@mysite.com )
| echo | ${variable} |  |  (��� ������� � ����)
| type |  ��� ������� �������� | ${variable} |  (��� ���������� ���� ����� � ��� �����)
Math.floor(Math.random() * 100) �������� ������� ������ ��� ������������. � ��� ������� ������ ����������� �� ����� �������� ������ �������� � ���� ������ ������; ����� ���  new Date().getTime()




