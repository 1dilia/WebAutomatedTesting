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
		driver.get(Propirties.getBaseUrl() + "/"); // без регистрации
	
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


Тест формы регистрации
Для генерации нового емайла можете использовать такой пример: 
| store | javascript{"user-id-" + Math.floor(Math.random() * 100) + "@mysite.com";} | variable |    (тут вы генерите емайл и сохраняете в переменную, получите:  user-id-100@mysite.com )
| echo | ${variable} |  |  (тут выводим в логи)
| type |  ваш локатор элемента | ${variable} |  (тут вставляете этот емайл в ваш инпут)
Math.floor(Math.random() * 100) Довольно наивный подход для тестировщика. Я так понимаю емейлы сохраняются по этому диапазон быстро забьется и тест начнет падать; Лучше уже  new Date().getTime()




