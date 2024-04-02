package com.accord.SmartNav_Handheld;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static com.accord.SmartNav_Handheld.Utils.Constants.SMART_NAV_PACKAGE_NAME;

public class SatellitesPage {

	AndroidDriver driver;

	public SatellitesPage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	//Satellite option from main menu
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Satellites']")
	public WebElement eleSatellites;

	// Signal Strength option
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Signal Strength']")
	public WebElement eleSignalStrength;

	//Satellite Visibility option
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Satellite Visibility']")
	public WebElement eleSatelliteVisibility;

	// All Constellation option
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='All']")
	public WebElement eleSignalStrengthAll;

	// NavIC - SPS constellation option
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='NavIC - SPS']")
	public WebElement eleSignalStrengthNavicSPS;

	//GPS constellation option
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='GPS']")
	public WebElement eleSignalStrengthGPS;

	//SBAS constellation option
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='SBAS']")
	public WebElement eleSignalStrengthSBAS;

	//GLONASS constellation option
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='GLONASS']")
	public WebElement eleSignalStrengthGLONASS;

	//GALILEO constellation option
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='GALILEO']")
	public WebElement eleSignalStrengthGALILEO;

	//BEIDOU constellation option
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='BEIDOU']")
	public WebElement eleSignalStrengthBEIDOU;

	//GPS checkbox in satellite visibility screen
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "checkBoxGps")
	public WebElement eleGPSCheckbox;

	//GALILEO checkbox in satellite visibility screen
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "checkBoxGalileo")
	public WebElement eleGALILEOCheckbox;

	//GLONASS checkbox in satellite visibility screen
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "checkBoxGlonass")
	public WebElement eleGLONASSCheckbox;

	//SBAS checkbox in satellite visibility screen
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "checkBoxSbas")
	public WebElement eleSBASCheckbox;

	//NavIC checkbox in satellite visibility screen
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "checkBoxIrnss")
	public WebElement eleNavICCheckbox;

	//BEIDOU checkbox in satellite visibility screen
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "checkBoxBeido")
	public WebElement eleBEIDOUCheckbox;

}
