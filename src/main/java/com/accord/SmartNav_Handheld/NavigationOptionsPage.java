package com.accord.SmartNav_Handheld;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static com.accord.SmartNav_Handheld.Utils.Constants.SMART_NAV_PACKAGE_NAME;

public class NavigationOptionsPage {

	AndroidDriver driver;

	public NavigationOptionsPage (AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}

	//Back button
	@AndroidFindBy(accessibility = "back")
	public WebElement eleBackButton;

	//Home button
	@AndroidFindBy(accessibility = "home")
	public WebElement eleHomeButton;

	//Page button
	@AndroidFindBy(accessibility = "page")
	public WebElement elePageButton;

	// Page heading field
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "textView2")
	public WebElement elePageHeading;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "eleExtPort")
	public  WebElement eleExtPort;
}
