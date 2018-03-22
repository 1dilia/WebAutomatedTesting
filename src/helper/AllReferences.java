package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllReferences {
	
	public static void main(String[] args) {
		WebDriver driver;
		String[] property = { "webdriver.chrome.driver", "D:\\\\chromedriver.exe" };
		System.setProperty(property[0], property[1]);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
		driver.get(Propirties.getBaseUrl());

		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println(links.size());

		for (int i = 0; i < links.size(); i++) {
			System.out.println(links.get(i).getText());
			System.out.println(links.get(i).getAttribute("href"));
	
		}
		driver.close();
	}
}
