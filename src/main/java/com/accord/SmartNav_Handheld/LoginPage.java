package com.accord.SmartNav_Handheld;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public static final String SMART_NAV_PACKAGE_NAME = "com.accord.smartnav20_v20:id/";
	AndroidDriver driver;

	public LoginPage (AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}

	//driver.findElement(By.id("com.accord.smartnav20_v20:id/editTextNumber"))
	@AndroidFindBy(id= SMART_NAV_PACKAGE_NAME + "editTextNumber")
	private WebElement elePinField;

	public void setPin(String strPin) {
		elePinField.sendKeys(strPin);
	}
}
