package helper;

import org.openqa.selenium.By;

public class Locators {
	// for LogIn
	private static final By settingsClose = null;
	private static By fieldEmail = By.name("email");
	private static By fieldPassword = By.name("password");
	private static By buttonEnter = By.cssSelector("button.btn.btn-primary");
	private static By buttonLogOut = By.linkText("Logout");

	// for Map
	private static By buttonContact = By.linkText("Contact");
	private static By buttonMapPlus = By.cssSelector("ymaps.ymaps-2-1-56-zoom__icon.ymaps-2-1-56-float-button-icon");
	private static By fieldMapAddress = By.cssSelector("input.ymaps-2-1-56-searchbox-input__input");
	private static By buttonMapSearch = By.cssSelector("ymaps.ymaps-2-1-56-searchbox-button-text");
	private static By titlePopUp = By.cssSelector("ymaps.ymaps-2-1-56-islets_card__title");
	private static By closePopUp = By.cssSelector("ymaps.ymaps-2-1-56-balloon__close-button");
	private static By buttonZoomIn = By.cssSelector(
			".ymaps-2-1-56-float-button.ymaps-2-1-56-user-selection-none>.ymaps-2-1-56-zoom__icon.ymaps-2-1-56-float-button-icon"); // .ymaps-2-1-56-zoom__plus.ymaps-2-1-56-zoom__button.ymaps-2-1-56-float-button.ymaps-2-1-56-user-selection-none:nth-of-type(1)
	private static By buttonZoomOut = By.cssSelector(
			".ymaps-2-1-56-zoom__minus.ymaps-2-1-56-zoom__button.ymaps-2-1-56-float-button.ymaps-2-1-56-user-selection-none");
	private static By buttonList = By.cssSelector("ymaps.ymaps-2-1-56-listbox__button-arrow");
	private static By buttonListSatellite = By
			.cssSelector("ymaps.ymaps-2-1-56-listbox__list-item.ymaps-2-1-56-listbox__list-item_selected_no");
	private static By buttonListHybrid = By
			.cssSelector(".ymaps-2-1-56-listbox__list-item.ymaps-2-1-56-listbox__list-item_selected_no");
	private static By buttonFull = By
			.cssSelector("ymaps.ymaps-2-1-56-float-button-icon.ymaps-2-1-56-float-button-icon_icon_expand");
	private static By buttonFullBack = By
			.cssSelector("ymaps.ymaps-2-1-56-float-button-icon.ymaps-2-1-56-float-button-icon_icon_collapse");
	private static By buttonHomePage = By.linkText("AMERICAN BODY ART");
	
	//for register
	private static By buttonRegister = By.linkText("Register");
	private static By fieldNameReg = By.id("name");
	private static By fieldEmailReg = By.id("email");
	private static By fieldPasswordReg = By.id("password");
	private static By fieldPasswordConfirmReg = By.id("password-confirm");
	private static By buttonAcceptRegister = By.cssSelector("button.btn.btn-primary");

	//for goInSocialNetwork
	private static By imgFB = By.xpath("//img[contains(@src,\"facebook\")]");
	private static By imgInstagramm = By.xpath("//img[contains(@src,\"instogramm\")]");
	private static By imgPinterest = By.xpath("//img[contains(@src,\"pinterest\")]");
	private static By imgWorldPress = By.xpath("//img[contains(@src,\"worldpress\")]");
	private static By imgTwitter = By.xpath("//img[contains(@src,\"twitter.jpg\")]");

	
	
	
	
	



	public static By getImgFB() {
		return imgFB;
	}

	public static By getImgInstagramm() {
		return imgInstagramm;
	}

	public static By getImgPinterest() {
		return imgPinterest;
	}

	public static By getImgWorldPress() {
		return imgWorldPress;
	}

	public static By getImgTwitter() {
		return imgTwitter;
	}

	public static By getButtonRegister() {
		return buttonRegister;
	}

	public static By getButtonAcceptRegister() {
		return buttonAcceptRegister;
	}

	public static By getButtonLogOut() {
		return buttonLogOut;
	}

	public static By getFieldNameReg() {
		return fieldNameReg;
	}

	public static By getFieldEmailReg() {
		return fieldEmailReg;
	}

	public static By getFieldPasswordReg() {
		return fieldPasswordReg;
	}

	public static By getFieldPasswordConfirmReg() {
		return fieldPasswordConfirmReg;
	}

	
	public static By getButtonListHybrid() {
		return buttonListHybrid;
	}

	public static By getClosePopUp() {
		return closePopUp;
	}

	public static By getButtonList() {
		return buttonList;
	}

	public static By getButtonListSatellite() {
		return buttonListSatellite;
	}

	public static By getButtonFull() {
		return buttonFull;
	}

	public static By getButtonFullBack() {
		return buttonFullBack;
	}

	public static By getButtonHomePage() {
		return buttonHomePage;
	}

	public static By getButtonMapPlus() {
		return buttonMapPlus;
	}

	public static By getFieldMapAddress() {
		return fieldMapAddress;
	}

	public static By getButtonMapSearch() {
		return buttonMapSearch;
	}

	public static By getTitlePopUp() {
		return titlePopUp;
	}

	public static By getButtonContact() {
		return buttonContact;
	}

	public static By getFieldEmail() {
		return fieldEmail;
	}

	public static By getFieldPassword() {
		return fieldPassword;
	}

	public static By getButtonEnter() {
		return buttonEnter;
	}

	public static By getSettingsclose() {
		return settingsClose;
	}

	public static By getButtonZoomIn() {
		return buttonZoomIn;
	}

	public static By getButtonZoomOut() {
		return buttonZoomOut;
	}

}
