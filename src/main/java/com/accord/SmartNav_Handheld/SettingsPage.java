package com.accord.SmartNav_Handheld;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static com.accord.SmartNav_Handheld.Utils.AppiumUtils.scrollUntilElement;
import static com.accord.SmartNav_Handheld.Utils.Constants.MAINTENANCE_PASSWORD;
import static com.accord.SmartNav_Handheld.Utils.Constants.SMART_NAV_PACKAGE_NAME;

public class SettingsPage{

	AndroidDriver driver;

	public SettingsPage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Settings option from main menu
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Settings']")
	public WebElement eleSettings;

	// Device option in Settings page
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Device']")
	public WebElement eleDeviceSettings;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Notifications']")
	public WebElement eleNotification;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='OFF']")
	public WebElement eleNotificationOFF;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='ON']")
	public WebElement eleNotificationON;

	@AndroidFindBy(accessibility = "back")
	public WebElement eleBackButton;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Lock Screen Settings']")
	public WebElement eleLockScreenSettings;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='OFF']")
	public WebElement eleStartUpOFF;

	@AndroidFindBy(accessibility = "Home")
	public WebElement eleHomeButton;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='ON']")
	public WebElement eleStartUpON;

	// Device option in Settings page
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='GNSS Settings']")
	public WebElement eleGNSSSettings;

	// Device option in Settings page
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Logging']")
	public WebElement eleLogging;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "minute_val")
	public WebElement eleMinutesField;
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "second_val")
	public WebElement eleSecondsField;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "set_btn")
	public WebElement eleLoggingSetButton;


	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME +"positive_button")
	public WebElement eleLoggingOKButton;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "militaryMode")
	public WebElement eleMilitaryMode;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "send_cmd_btn")
	public WebElement eleSwitchMode;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "positive_button")
	public WebElement eleSwitcModeOkButton;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "hybridMode")
	public WebElement eleCivilianMode;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Airborne']")
	public WebElement eleAirborne;
	// Device option in Settings page
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Maps']")
	public WebElement eleMaps;

	// Device option in Settings page
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='BIST']")
	public WebElement eleBIST;

	// Device option in Settings page
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Key Management']")
	public WebElement eleKeyManagement;

	// Device option in Settings page
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Advanced Settings']")
	public WebElement eleAdvancedSettings;

	// Key Management password field
	//Advanced settings password field
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "editText")
	public WebElement eleKeyManagementPassword;

	// Key Management password pop-up 'ÖK" button
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "positive_button1")
	public WebElement eleKMMPasswordOKButton;

	// Navigation Settings under Maps option in Settings screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Navigation Settings']")
	public WebElement eleNavigationSettings;

	// Map Formats under Maps option in Settings screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Map Formats']")
	public WebElement eleMapFormats;

	// Raster Map Formats under Map Formats option in Settings screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Raster Maps']")
	public WebElement eleRasterMapFormats;

	// Vector Map Formats under Map Formats option in Settings screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Vector Maps']")
	public WebElement eleVectorMapFormats;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "search")
	public WebElement eleMapsearch;

	// User Defined Settings under Advanced Settings option in Settings screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='User Defined Settings']")
	public WebElement eleUserDefinedSettings;

	// Screen Timeout under Advanced Settings option in Settings screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Screen Timeout']")
	public WebElement eleScreenTimeout;

	// Tamper under Advanced Settings option in Settings screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Tamper']")
	public WebElement eleTamper;

	// Sensor FW Update under Advanced Settings option in Settings screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Sensor FW Update']")
	public WebElement eleSensorFWUpdate;

	// Self Destruct under Advanced Settings option in Settings screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Self Destruct']")
	public WebElement eleSelfDestruct;

	// User Defined Zones under User Defined Settings screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='User Defined Zones']")
	public WebElement eleUDZones;

	// Datum under User Defined Settings screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Datum']")
	public WebElement eleDatum;

	// IGRS Zones under User Defined Settings screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='IGRS Zones']")
	public WebElement eleIGRSZones;

	//User defined zones search bar
	@AndroidFindBy(id="com.accord.smartnav20_v20:id/search_route")
	public WebElement eleUDZoneSearch;

	//Select button in UD zones screen
	@AndroidFindBy(id = "com.accord.smartnav20_v20:id/btn_go_to")
	public WebElement eleZoneSelect;

	//Semi major axis option
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "semiMatrixAxis")
	public WebElement eleSemiMajorAxis;

	//Inverse flattening option
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "flattening")
	public WebElement eleInvFlattening;

	//Delta X option
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "deltaX")
	public WebElement eleDeltaX;

	//Delta X option
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "deltaY")
	public WebElement eleDeltaY;

	//Delta X option
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "deltaZ")
	public WebElement eleDeltaZ;

	// Datum page save button
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "next_btn")
	public WebElement eleSaveDatum;

	//Datum save successfully pop-up OK button
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "positive_button")
	public WebElement eleDatumSavedOkButton;

	//Semi major axis field validation error
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"+
			"android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/"+
			"android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/"+
			"android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/"+
			"android.widget.TextView")
	public WebElement eleDatumValidationError1;

	//Inverse flattening field validation error
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"+
			"android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/"+
			"android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/"+
			"android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/"+
			"android.widget.TextView")
	public WebElement eleDatumValidationError2;

	//Delta X field validation error
	//Delta Y field validation error
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"+
			"android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/"+
			"android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/"+
			"android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/"+
			"android.widget.TextView")
	public WebElement eleDatumValidationError3;

	// Delta Z field validation error
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"+
			"android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/"+
			"android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/"+
			"android.view.ViewGroup/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.FrameLayout/"+
			"android.widget.TextView")
	public WebElement eleDatumValidationError4;

	public void setUserDefinedZone(HashMap<String, String> hmValues){
		SettingsPage settingsPage = new SettingsPage(driver);
		settingsPage.eleSettings.click();
		scrollUntilElement(driver, "Advanced Settings");
		settingsPage.eleAdvancedSettings.click();
		settingsPage.eleKeyManagementPassword.sendKeys(MAINTENANCE_PASSWORD);
		settingsPage.eleKMMPasswordOKButton.click();
		settingsPage.eleUserDefinedSettings.click();
		settingsPage.eleUDZones.click();

		settingsPage.eleUDZoneSearch.sendKeys(hmValues.get("Zone"));

		List<WebElement> allElements = new ArrayList<>(driver.findElements(By.xpath("//android.widget.TextView[@index='1']")));
		List<WebElement> currElements = new ArrayList<>(allElements);
		List<WebElement> prevElements = new ArrayList<>();

		for(WebElement zone : allElements){
			if(zone.getText().equals(hmValues.get("Zone"))){
				zone.click();
				settingsPage.eleZoneSelect.click();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
				return;
			}
		}

		while(!prevElements.containsAll(currElements)){

			prevElements = new ArrayList<>(currElements);
			// Perform the scroll down action
			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
			// Find the new elements
			currElements = driver.findElements(By.xpath("//android.widget.TextView[@index='1']"));

			for(WebElement zone : currElements){
				if(zone.getText().equals(hmValues.get("Zone"))){
					zone.click();
					settingsPage.eleZoneSelect.click();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						throw new RuntimeException(e);
					}
					return;
				}
			}
		}

	}

}
