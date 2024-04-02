package com.accord.SmartNav_Handheld;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static com.accord.SmartNav_Handheld.Utils.Constants.SMART_NAV_PACKAGE_NAME;


public class LocationPage {

	AndroidDriver driver;

	//Location option from main menu
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Location']")
	public WebElement eleLocation;

	//Edit icon in location screen
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "editFloatingBtn")
	public WebElement eleEditIcon;

	//Geosystem settings option in edit screen
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "geo_system_button")
	public WebElement eleGeoSystemSettings;


	//Position format dropdown in geo system settings
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "spinner")
	public WebElement elePositionFormat;

	//Datum dropdown in geosystem settings
	@AndroidFindBy(id= SMART_NAV_PACKAGE_NAME  + "spinner2")
	public WebElement eleDatum;

	//Edit pop-up close icon
	@AndroidFindBy(id= SMART_NAV_PACKAGE_NAME + "imageviewcancel")
	public WebElement eleEditOptionCloseIcon;

	//Latitude field in location screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Latitude']")
	public WebElement eleLatitude;

	//Longitude field in location screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Longitude']")
	public WebElement eleLongitude;

	//IGRS field in location screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='IGRS']")
	public WebElement eleIGRS;

	//Zone, Map Sheet field in location screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Zone, Map Sheet']")
	public WebElement eleZoneAndMS;

	//X(m) field in location screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='X (m)']")
	public WebElement eleX;

	//X(m) field in location screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Y (m)']")
	public WebElement eleY;

	//X(m) field in location screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Z (m)']")
	public WebElement eleZ;

	//MGRS field in location screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='MGRS']")
	public WebElement eleMGRS;

	//Easting (m) field in location screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Easting (m)']")
	public WebElement eleEasting;

	//Northing (m) field in location screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Northing (m)']")
	public WebElement eleNorthing;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.TextView[2]")
	public WebElement eleCoordinates;

	//Unit settings option in edit screen
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "unit_settings_button")
	public WebElement eleUnitSettings;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "textView41")
	public WebElement eleUnitSettingsHeader;
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "imageviewcancel")
	public WebElement eleUnitSettingsCloseIcon;
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "textView5")
	public WebElement eleUnitSettingSubheadingSpeed;
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "distance_textview")
	public WebElement eleUnitSettingSubheadingDistance;
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "speed_unit1")
	public WebElement eleSpeedUnitMetersPerSecond;
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "speed_unit2")
	public WebElement eleSpeedUnitKilometersPerHour;
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "speed_unit3")
	public WebElement eleSpeedUnitMilesPerHour;
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "speed_unit4")
	public WebElement eleSpeedUnitKnots;
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "distance_unit1")
	public WebElement eleDistanceUnitMeters;
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "distance_unit2")
	public WebElement eleDistanceUnitKilometers	;
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "distance_unit3")
	public WebElement eleDistanceUnitMiles;
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "distance_unit4")
	public WebElement eleDistanceUnitNauticalMiles;
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "distance_unit5")
	public WebElement eleDistanceUnitFeet;
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "altitude_unit1")
	public WebElement eleAltitudeUnitMeters;
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "altitude_unit2")
	public WebElement eleAltitudeUnitFeet;
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "altitude_unit3")
	public WebElement eleAltitudeUnitNauticalMiles;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
			"android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/" +
			"android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/" +
			"android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/" +
			"android.widget.FrameLayout[7]/android.view.ViewGroup/android.widget.TextView[2]")
	public WebElement eleAltitudeValue;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
			"android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/" +
			"android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/" +
			"android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/" +
			"android.widget.FrameLayout[8]/android.view.ViewGroup/android.widget.TextView[2]")
	public WebElement eleSpeedValue;

	public LocationPage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public void selectLocation() throws InterruptedException {
		eleLocation.click();
		Thread.sleep(2000);
	}

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.view.ViewGroup[1]/android.widget.TextView")
	protected WebElement eleDDFormat;

	@AndroidFindBy(accessibility = "back")
	public WebElement eleBackButton;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "userdefinedZoneSpinner")
	public WebElement eleuserdefinedZoneSpinner;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.Spinner")
	public WebElement elePrecisionButton1;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.view.ViewGroup[4]/android.widget.TextView")
	public WebElement elePrecisionSelection;



}
