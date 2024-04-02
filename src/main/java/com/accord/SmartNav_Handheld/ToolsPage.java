package com.accord.SmartNav_Handheld;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static com.accord.SmartNav_Handheld.Utils.Constants.SMART_NAV_PACKAGE_NAME;

public class ToolsPage {

	AndroidDriver driver;

	public ToolsPage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	//Tools option from main menu
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Tools']")
	public WebElement eleTools;

	// Conversion option in tools
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME+"subMenuRecyclerView")
	public WebElement eleConversion;

	// Geosystem conversion option in conversion screen
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME+"subMenuRecyclerView")
	public WebElement eleGeosystemConversion;

	//Convert From position format dropdown
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME+"spinner")
	public WebElement eleConvertFrom;

	//Convert To position format dropdown for DD format
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME+"spinner1")
	public WebElement eleConvertTo;

	//Convert To position format dropdown for DMS format
	//Convert To position format dropdown for DMM format
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME+"spinner3")
	public WebElement eleConvertTo1;

	//N/S dropdown for DMS format
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME+"spinner1")
	public WebElement eleLatDirectionDropdown;

	//Datum dropdown
	//E/W dropdown for DMS format
	@AndroidFindBy(id=SMART_NAV_PACKAGE_NAME+"spinner2")
	public WebElement eleDatum;

	//WGS84 datum option
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='WGS 84']")
	public WebElement eleWGS84Datum;

	//Kalianpur 1975 datum option
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Kalianpur 1975']")
	public WebElement eleKpur1975Datum;

	//User Defined datum option
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='User defined']")
	public WebElement eleUserDefinedDatum;

	//GeoSystem screen Next button
	//Convert button when Convert From pos format is DD
	//Convert button when Convert From pos format is User Defined
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME+"button4")
	public WebElement eleButton;

	//Convert button when Convert From pos format is DMS
	//Convert button when Convert From pos format is DMM
	//Convert button when Convert From pos format is IGRS(New)
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME+"button4")
	public WebElement eleConvertButton;

	//Latitude field
	@AndroidFindBy(id= SMART_NAV_PACKAGE_NAME+"lattiude")
	public WebElement eleLatitude;

	//Longitude field
	@AndroidFindBy(id=SMART_NAV_PACKAGE_NAME+"longitude")
	public WebElement eleLongitude;

	//Altitude field
	@AndroidFindBy(id=SMART_NAV_PACKAGE_NAME+"altitude")
	public WebElement eleAltitude;

	//DD format from Dropdown
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='dd.ddddd']")
	public WebElement eleDDFormat;

	//DMS format from Dropdown
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='dd mm ss.ss']")
	public WebElement eleDMSFormat;

	//DMM format from Dropdown
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='dd mm.mmmm']")
	public WebElement eleDMMFormat;

	//IGRS New format from Dropdown
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='IGRS (New format)']")
	public WebElement eleIGRSNewFormat;

	//ECEF format from Dropdown
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='ECEF']")
	public WebElement eleECEFFormat;

	//MGRS format from Dropdown
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='MGRS']")
	public WebElement eleMGRSFormat;

	//UserDefined_LCC format from Dropdown
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='UserDefined_LCC']")
	public WebElement eleUserDefinedFormat;

	//Latitude field validation error
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"+
			"android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup"+
			"/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/"+
			"android.widget.FrameLayout[1]/android.widget.ScrollView/android.view.ViewGroup/"+
			"android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/"+
			"android.widget.TextView")
	public WebElement eleLatitudeError;

	//Longitude field validation error
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"+
			"android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup"+
			"/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/"+
			"android.widget.FrameLayout[1]/android.widget.ScrollView/android.view.ViewGroup/"+
			"android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/"+
			"android.widget.TextView")
	public WebElement eleLongitudeError;

	//Altitude field validation error
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"+
			"android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup"+
			"/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/"+
			"android.widget.FrameLayout[1]/android.widget.ScrollView/android.view.ViewGroup/"+
			"android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/"+
			"android.widget.TextView")
	public WebElement eleAltitudeError;

	// Latitude Field in DMS format - Degree value
	@AndroidFindBy(id= SMART_NAV_PACKAGE_NAME + "ed_dms_1")
	public WebElement eleDMSLatitudeDegree;

	//Latitude Field in DMS format - Minutes value
	@AndroidFindBy(id= SMART_NAV_PACKAGE_NAME + "ed_dms_2")
	public WebElement eleDMSLatitudeMinutes;

	//Latitude Field in DMS format - Seconds value
	@AndroidFindBy(id= SMART_NAV_PACKAGE_NAME + "ed_dms_3")
	public WebElement eleDMSLatitudeSeconds;

	//Longitude Field in DMS format - Degree value
	@AndroidFindBy(id= SMART_NAV_PACKAGE_NAME + "ed_dms_4")
	public WebElement eleDMSLongitudeDegree;

	//Longitude Field in DMS format - Minutes value
	@AndroidFindBy(id= SMART_NAV_PACKAGE_NAME + "ed_dms_5")
	public WebElement eleDMSLongitudeMinutes;

	//Longitude Field in DMS format - Seconds value
	@AndroidFindBy(id= SMART_NAV_PACKAGE_NAME + "ed_dms_6")
	public WebElement eleDMSLongitudeSeconds;

	//Latitude validation error field
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"+
			"android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/"+
			"android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/"+
			"android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/"+
			"android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/"+
			"android.widget.FrameLayout/android.widget.TextView")
	public WebElement eleDMSLatitudeError;

	//Longitude validation error field
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"+
			"android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/"+
			"android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/"+
			"android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/"+
			"android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/"+
			"android.widget.FrameLayout/android.widget.TextView")
	public WebElement eleDMSLongitudeError;

	//Altitude validation error field
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"+
			"android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/"+
			"android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/"+
			"android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/"+
			"android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.LinearLayout/"+
			"android.widget.FrameLayout/android.widget.TextView")
	public WebElement eleDMSAltitudeError;

	//Latitude Field in DMM format - Degree value
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "ed_dm_1")
	public WebElement eleDMMLatitudeDegree;

	//Latitude Field in DMM format - Minutes value
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "ed_dm_2")
	public WebElement eleDMMLatitudeMinutes;

	//Longitude Field in DMM format - Degree value
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "ed_dm_3")
	public WebElement eleDMMLongitudeDegree;


	//Longitude Field in DMM format - Minutes value
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "ed_dm_4")
	public WebElement eleDMMLongitudeMinutes;

	//Dropdown for latitude sign (N / S sign) in DMM format
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "latitude_spinner")
	public WebElement eleDMMLatSpinner;

	//DMM Lat field error
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"+
			"android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/"+
			"android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/"+
			"android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/"+
			"android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/"+
			"android.widget.FrameLayout/android.widget.TextView")
	public WebElement eleDMMLatitudeError;

	//DMM Long field error
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"+
			"android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/"+
			"android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/"+
			"android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/"+
			"android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/"+
			"android.widget.FrameLayout/android.widget.TextView")
	public WebElement eleDMMLongitudeError;

	//DMM Altitude field error
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"+
			"android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/"+
			"android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/"+
			"android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/"+
			"android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.LinearLayout/"+
			"android.widget.FrameLayout/android.widget.TextView")
	public WebElement eleDMMAltitudeError;

	// MGRS string field
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "mgrs_string")
	public WebElement eleMGRS;

	//MGRS pos format Convert button
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "button7")
	public WebElement eleMGRSConvertButton;

	//MGRS String field validation
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"+
			"android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/"+
			"android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup"+
			"/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout[1]/"+
			"android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView")
	public WebElement eleMGRSStringError;

	//MGRS Altitude field error
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout"+
			"/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/"+
			"android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/"+
			"android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView")
	public WebElement eleMGRSAltitudeError;

	//ECEF X field
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "editText_X")
	public WebElement eleECEFX;

	//ECEF Y field
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "editText_Y")
	public WebElement eleECEFY;

	// ECEF Z field
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "editText_Z")
	public WebElement eleECEFZ;

	//ECEF Convert button
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "button4")
	public WebElement eleECEFConvertButton;

	//X field validation message
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"+
			"android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/"+
			"android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/"+
			"android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/"+
			"android.widget.FrameLayout/android.widget.TextView")
	public WebElement eleECEF_X_ValidationError;

	//Y field validation message
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"+
			"android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/"+
			"android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/"+
			"android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/"+
			"android.widget.FrameLayout/android.widget.TextView")
	public WebElement eleECEF_Y_ValidationError;

	//Z field validation message
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"+
			"android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/"+
			"android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/"+
			"android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.LinearLayout/"+
			"android.widget.FrameLayout/android.widget.TextView")
	public WebElement eleECEF_Z_ValidationError;

	//User defined - Easting field
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "easting")
	public WebElement eleUDEasting;

	//User defined - Northing field
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "northing")
	public WebElement eleUDNorthing;

	//User defined zone field
	//IGRS zone field
	@AndroidFindBy(id =SMART_NAV_PACKAGE_NAME+"zone")
	public WebElement eleZone;

	//Search field in UD zone dropdown
	//Search field in IGRS zone dropdown
	@AndroidFindBy(id= SMART_NAV_PACKAGE_NAME+ "searchItemET")
	public WebElement eleZoneSearch;

	//Zone field validation error in Convert screen
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"+
			"android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/"+
			"android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/"+
			"android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/"+
			"android.widget.TextView")
	public WebElement eleUDZoneValidationError;

	//Easting field validation error
	//Northing field validation error (after scrolling, easting becomes first element and northing becomes second element
	//so reusing the same component for both fields. And northing error will be taken only after scrolling
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"+
			"android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/"+
			"android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/"+
			"android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/"+
			"android.widget.TextView")
	public WebElement eleUDEastingNorthingValidationError;

	//Altitude field validation error
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"+
			"android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/"+
			"android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/"+
			"android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/"+
			"android.widget.TextView")
	public WebElement eleUDAltitudeValidationError;

	//IGRS - Grid Letter field
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "gridletter")
	public WebElement eleGridLetter;

	//IGRS - Easting field
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "easting")
	public WebElement eleIGRSEasting;

	//IGRS - Northing field
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "northing")
	public WebElement eleIGRSNorthing;

	//IGRS - Altitude field
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "altitude1")
	public WebElement eleAltitude1;

	//Precision dropdown field
	@AndroidFindBy(id="com.accord.smartnav20_v20:id/spinner4")
	public WebElement eleIGRSPrecision;

	//Zone field validation error
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"+
			"android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/"+
			"android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/"+
			"android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/"+
			"android.widget.TextView")
	public WebElement eleIGRSZoneValidationMessage;

	//Zone field validation error
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"+
			"android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/"+
			"android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/"+
			"android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/"+
			"android.widget.TextView")
	public WebElement eleIGRSGridLetterValidationMessage;

	//Zone field validation error
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"+
			"android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/"+
			"android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/"+
			"android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/"+
			"android.widget.TextView")
	public WebElement eleIGRSEastingValidationMessage;

	//Northing validation error
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"+
			"android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/"+
			"android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/"+
			"android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/"+
			"android.widget.TextView")
	public WebElement eleIGRSNorthingValidationMessage;

	//Altitude validation error
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"+
			"android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/"+
			"android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/"+
			"android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/"+
			"android.widget.TextView")
	public WebElement eleIGRSAltitudeValidationMessage;

	public void setPrecision(String strPrecision){
		driver.findElement(By.xpath("//android.widget.TextView[@text='"+strPrecision+"']")).click();
	}

	//DMS format Latitude field in converted data window
	//MGRS Format MGRS string in converted data window
	//ECEF Format X field in converted data window
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "value1")
	public WebElement eleConvertedValue1;

	//DMS format Longitude field in converted data window
	//MGRS format Altitude in converted data window
	//ECEF Format Y field in converted data window
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "value2")
	public WebElement eleConvertedValue2;

	//DMS format Latitude field in converted data window
	//ECEF Format Z field in converted data window
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "value3")
	public WebElement eleConvertedValue3;

	//IGRS New format Altitude field in converted data window
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "value4")
	public WebElement eleConvertedValue4;

	//Conversion pop-up OK button
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "positive_button")
	public WebElement eleOKButton;
}
