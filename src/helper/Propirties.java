package helper;

public class Propirties {
	private static String browser = "firefox"; // "chrome", "firefox"
	private static String baseUrl = "http://tattoo.obmenka.by//";
	private static String login = "test1@mail.ru";
	private static String password = "111111";
	private static String addressMap = "Франция, Иль-де-Франс, Париж, Rue Rambuteau, 1";

	public static String getAddressMap() {
		return addressMap;
	}

	public static void setAddressMap(String addressMap) {
		Propirties.addressMap = addressMap;
	}

	public static String getBrowser() {
		return browser;
	}

	public static void setBrowser(String browser) {
		Propirties.browser = browser;
	}

	public static String getBaseUrl() {
		return baseUrl;
	}

	public static void setBaseUrl(String baseUrl) {
		Propirties.baseUrl = baseUrl;
	}

	public static String getLogin() {
		return login;
	}

	public static void setLogin(String login) {
		Propirties.login = login;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		Propirties.password = password;
	}

}
