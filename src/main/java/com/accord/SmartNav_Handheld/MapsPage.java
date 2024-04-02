package com.accord.SmartNav_Handheld;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static com.accord.SmartNav_Handheld.Utils.Constants.SMART_NAV_PACKAGE_NAME;

public class MapsPage {

	AndroidDriver driver;

	public MapsPage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	//Maps option from main menu
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Maps']")
	public WebElement eleMaps;

	//Maps area on Map screen
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "mapview")
	public WebElement eleMapsArea;

	//Location details layout in Maps screen
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "button2")
	public WebElement eleLocationBox;

	//Compass layout in Maps screen
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "compasslayout1")
	public WebElement eleCompassIcon;

	//Mark button in Maps screen
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "markButton")
	public WebElement eleMarkIcon;

	//Street Nav button in Maps screen
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "street_nav_button")
	public WebElement eleStreetNavIcon;

	//Re-center icon in Maps screen
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "recenter")
	public WebElement eleRecenterIcon;

	//Waypoint on Map option
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "wapoint_on_map_button")
	public WebElement eleWaypointOnMapOption;

	//Full screen on Map option
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "btn_full_screen")
	public WebElement eleFullScreenOption;

	//Goto on Map option
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "goto_on_map_button")
	public WebElement eleGoToOnMapOption;

	//Route on Map option
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "route_on_map_button")
	public WebElement eleRouteOnMapOption;

	//Create on Map Pop-up cancel button
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "cancel")
	public WebElement eleCancelIcon;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "positive_button")
	public WebElement eleMarkOkButton;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "negetive_button")
	public WebElement eleMarkCancelButton;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "imageButton")
	public WebElement eleBackButton;

}
