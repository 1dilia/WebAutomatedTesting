package tests;

import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import helper.Propirties;

public class AnswerHTTP {

	public static boolean linkExists(String URLName) {
		try {
			HttpURLConnection.setFollowRedirects(false);
			HttpURLConnection con = (HttpURLConnection) new URL(URLName).openConnection();
			con.setRequestMethod("HEAD");
			return (con.getResponseCode() == HttpURLConnection.HTTP_OK);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public static void main(String[] args) {
		WebDriver driver;
		String[] property = { "webdriver.chrome.driver", "D:\\\\chromedriver.exe" };
		System.setProperty(property[0], property[1]);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
		driver.get(Propirties.getBaseUrl());
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));

		for (int i = 0; i < links.size(); i++) {
			if (linkExists(links.get(i).getAttribute("href")))
				continue;
			else
				System.out.println("href != text: " + links.get(i).getText() + (links.get(i).getAttribute("href")));
		}
		driver.close();
	}
}