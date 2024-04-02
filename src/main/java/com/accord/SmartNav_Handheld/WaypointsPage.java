package com.accord.SmartNav_Handheld;

import com.google.common.base.Verify;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;

import static com.accord.SmartNav_Handheld.Utils.Constants.SMART_NAV_PACKAGE_NAME;

public class WaypointsPage {
	AndroidDriver driver;

	public WaypointsPage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// The Waypoints option in main menu screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Waypoints']")
	public WebElement eleWaypoints;

	// Create Waypoint Button
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "btn_plus_add_route")
	public WebElement eleCreateNewWaypoint;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "waypoint_name")
	public WebElement eleWaypointName;

	// Latitude Field in DD format
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "lattiude")
	public WebElement eleDDLatitude;

	// Longitude Field in DD format
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "longitude")
	public WebElement eleDDLongitude;

	// Altitude Field
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "altitude")
	public WebElement eleAltitude;

	// Latitude Field in DMS format - Degree value
	@AndroidFindBy(id= SMART_NAV_PACKAGE_NAME + "ed_dms_1")
	public WebElement eleDMSLatitudeDegree;

	//Latitude Field in DMS format - Minutes value
	@AndroidFindBy(id= SMART_NAV_PACKAGE_NAME + "ed_dms_2")
	public WebElement eleDMSLatitudeMinutes;

	//Latitude Field in DMS format - Seconds value
	@AndroidFindBy(id= SMART_NAV_PACKAGE_NAME + "ed_dms_3")
	public WebElement eleDMSLatitudeSeconds;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='N']")
	public WebElement eleDMSLatitudeDirectionNorth;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='S']")
	public WebElement eleDMSLatitudeDirectionSouth;


	//Longitude Field in DMS format - Degree value
	@AndroidFindBy(id= SMART_NAV_PACKAGE_NAME + "ed_dms_4")
	public WebElement eleDMSlongitudeDegree;

	//Longitude Field in DMS format - Minutes value
	@AndroidFindBy(id= SMART_NAV_PACKAGE_NAME + "ed_dms_5")
	public WebElement eleDMSlongitudeMinutes;

	//Longitude Field in DMS format - Seconds value
	@AndroidFindBy(id= SMART_NAV_PACKAGE_NAME + "ed_dms_6")
	public WebElement eleDMSlongitudeSeconds;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='E']")
	public WebElement eleDMSLongitudeDirectionEast;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='W']")
	public WebElement eleDMSLongitudeDirectionWest;


	//Latitude Field in DMM format - Degree value
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "ed_dm_1")
	public WebElement eleDMMLatitudeDegree;

	//Latitude Field in DMM format - Minutes value
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "ed_dm_2")
	public WebElement eleDMMLatitudeMinutes;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='N']")
	public WebElement eleDMMLatitudeDirectionNorth;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='S']")
	public WebElement eleDMMLatitudeDirectionSouth;

	//Longitude Field in DMM format - Degree value
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "ed_dm_3")
	public WebElement eleDMMLongitudeDegree;


	//Longitude Field in DMM format - Minutes value
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "ed_dm_4")
	public WebElement eleDMMLongitudeMinutes;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='E']")
	public WebElement eleDMMLongitudeDirectionEast;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='W']")
	public WebElement eleDMMLongitudeDirectionWest;

	//ECEF X field
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "editText_X")
	public WebElement eleECEFX;

	//ECEF Y field
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "editText_Y")
	public WebElement eleECEFY;

	// ECEF Z field
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "editText_Z")
	public WebElement eleECEFZ;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
			"android.widget.FrameLayout/android.view.ViewGroup/" +
			"android.widget.FrameLayout/android.view.ViewGroup/" +
			"android.widget.FrameLayout/android.widget.FrameLayout/" +
			"android.view.ViewGroup/android.widget.FrameLayout/" +
			"android.view.ViewGroup/android.widget.LinearLayout[1]/" +
			"android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView")
	public WebElement eleECEF_X_ValidationError;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
			"android.widget.FrameLayout/android.view.ViewGroup/" +
			"android.widget.FrameLayout/android.view.ViewGroup/" +
			"android.widget.FrameLayout/android.widget.FrameLayout/" +
			"android.view.ViewGroup/android.widget.FrameLayout/" +
			"android.view.ViewGroup/android.widget.LinearLayout[2]/" +
			"android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView")
	public WebElement eleECEF_Y_ValidationError;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
			"android.widget.FrameLayout/android.view.ViewGroup/" +
			"android.widget.FrameLayout/android.view.ViewGroup/" +
			"android.widget.FrameLayout/android.widget.FrameLayout/" +
			"android.view.ViewGroup/android.widget.FrameLayout/" +
			"android.view.ViewGroup/android.widget.LinearLayout[3]/" +
			"android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView")
	public WebElement eleECEF_Z_ValidationError;

	// MGRS string field
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "mgrs_string")
	public WebElement eleMGRS;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
			"android.widget.FrameLayout/android.view.ViewGroup/" +
			"android.widget.FrameLayout/android.view.ViewGroup/" +
			"android.widget.FrameLayout/android.widget.FrameLayout/" +
			"android.view.ViewGroup/android.widget.FrameLayout/" +
			"android.view.ViewGroup/android.widget.LinearLayout[1]/" +
			"android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView")
	public WebElement eleMGRS_StringValidationError;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
			"android.widget.FrameLayout/android.view.ViewGroup/" +
			"android.widget.FrameLayout/android.view.ViewGroup/" +
			"android.widget.FrameLayout/android.widget.FrameLayout/" +
			"android.view.ViewGroup/android.widget.FrameLayout/" +
			"android.view.ViewGroup/android.widget.LinearLayout[2]/" +
			"android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView")
	public WebElement eleMGRSAltitudeValidationError;

	@AndroidFindBy(id= SMART_NAV_PACKAGE_NAME + "button7")
	public WebElement eleMGRSNextButton;

	//User defined - Easting field
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "easting")
	public WebElement eleUDEasting;

	//User defined - Northing field
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "northing")
	public WebElement eleUDNorthing;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
			"android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/" +
			"android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/" +
			"android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/" +
			"android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/" +
			"android.widget.FrameLayout/android.widget.TextView")
	public WebElement eleUDEastingValidationError;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
			"android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/" +
			"android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/" +
			"android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/" +
			"android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.LinearLayout/" +
			"android.widget.FrameLayout/android.widget.TextView")
	public WebElement eleUDNorthingValidationError;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
			"android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/" +
			"android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/" +
			"android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/" +
			"android.view.ViewGroup/android.widget.LinearLayout[4]/android.widget.LinearLayout/" +
			"android.widget.FrameLayout/android.widget.TextView")
	public WebElement eleUDAltitudeValidationMessage;


	//IGRS & UD - Zone dropdown
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "zone")
	public WebElement eleZoneDropdown;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "zone_spinner")
	public WebElement eleIGRSNewDropdown;

	//Search field in zone pop-up
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "searchItemET")
	public WebElement eleZoneSearch;

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

	//The Next button on the second page of waypoint creation process
	@AndroidFindBy(id= SMART_NAV_PACKAGE_NAME + "next_btn")
	public WebElement eleSecondNextButton;

	@AndroidFindBy(id= SMART_NAV_PACKAGE_NAME + "next_btn1")
	public WebElement eleSecondNext1Button;

	//Next button in Waypoint creation screen
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "button4")
	public WebElement eleNextButton;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "spinnerGeoSystem")
	public WebElement eleGeosystemDropdown;

	//Create waypoint button in last screen of waypoint creation
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "crt_wayp_btn")
	public WebElement eleCreateWaypointButton;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "positive_button")
	public WebElement eleSuccessPopupOKButton;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "textinput_error")
	public WebElement eleWaypointNameValidationMessage;
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
			"android.widget.FrameLayout/android.view.ViewGroup/" +
			"android.widget.FrameLayout/android.view.ViewGroup/" +
			"android.widget.FrameLayout/android.widget.FrameLayout/" +
			"android.view.ViewGroup/android.widget.FrameLayout/" +
			"android.view.ViewGroup/android.widget.LinearLayout[1]/" +
			"android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView")
	public WebElement eleLatitudeValidationMessage;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
			"android.widget.FrameLayout/android.view.ViewGroup/" +
			"android.widget.FrameLayout/android.view.ViewGroup/" +
			"android.widget.FrameLayout/android.widget.FrameLayout/" +
			"android.view.ViewGroup/android.widget.FrameLayout/" +
			"android.view.ViewGroup/android.widget.LinearLayout[2]/" +
			"android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView")
	public WebElement eleLongitudeValidationMessage;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
			"android.widget.FrameLayout/android.view.ViewGroup/" +
			"android.widget.FrameLayout/android.view.ViewGroup/" +
			"android.widget.FrameLayout/android.widget.FrameLayout/" +
			"android.view.ViewGroup/android.widget.FrameLayout/" +
			"android.view.ViewGroup/android.widget.LinearLayout[3]/" +
			"android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView")
	public WebElement eleAltitudeValidationMessage;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
			"android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/" +
			"android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/" +
			"android.view.ViewGroup/android.widget.FrameLayout/" +
			"android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[1]/" +
			"android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView")
	public WebElement eleIGRSZoneValidationMessage;
	@AndroidFindBy(xpath = "hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
			"android.widget.FrameLayout/android.view.ViewGroup/" +
			"android.widget.FrameLayout/android.view.ViewGroup/" +
			"android.widget.FrameLayout/android.widget.FrameLayout/" +
			"android.view.ViewGroup/android.widget.FrameLayout/" +
			"android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[1]/" +
			"android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView")
	public WebElement eleIGRSGridLettersValidationMessage;
	@AndroidFindBy(xpath = "hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
			"android.widget.FrameLayout/android.view.ViewGroup/" +
			"android.widget.FrameLayout/android.view.ViewGroup/" +
			"android.widget.FrameLayout/android.widget.FrameLayout/" +
			"android.view.ViewGroup/android.widget.FrameLayout/" +
			"android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[2]/" +
			"android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView")
	public WebElement eleIGRSEastingValidationMessage;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
			"android.widget.FrameLayout/android.view.ViewGroup/" +
			"android.widget.FrameLayout/android.view.ViewGroup/" +
			"android.widget.FrameLayout/android.widget.FrameLayout/" +
			"android.view.ViewGroup/android.widget.FrameLayout/" +
			"android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[3]/" +
			"android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView")
	public WebElement eleIGRSNorthingValidationMessage;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
			"android.widget.FrameLayout/android.view.ViewGroup/" +
			"android.widget.FrameLayout/android.view.ViewGroup/" +
			"android.widget.FrameLayout/android.widget.FrameLayout/" +
			"android.view.ViewGroup/android.widget.FrameLayout/" +
			"android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[4]/" +
			"android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView")
	public  WebElement eleIGRSAltitudeValidationMessage;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "search_by_edittext")
	public WebElement eleWaypointSearchField;



	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "btn_wsort")
	public WebElement eleSortByButton;


	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "alertTitle")
	public WebElement eleSortByPopUpHeader;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Name A-Z']")
	public WebElement eleSortAlphabetically;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Name Z-A']")
	public WebElement eleSortReverseAlphabetically;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Oldest']")
	public WebElement eleSortbyOldestDate;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Latest']")
	public WebElement eleSortbyLatestDate;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "multiselect_count")
	public WebElement eleMultiSelectionCountWaypoints;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "select_all")
	public WebElement eleSelectAllOption;


	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "btn_wfilter")
	public WebElement eleFilterButton;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "textView_filter")
	public WebElement eleFilterPopupHeader;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "category_spinner")
	public WebElement eleFilterCategoryDropdown;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "status_spinner")
	public WebElement eleFilterStatusDropdown;
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "btn_apply")
	public WebElement eleFilterApplyButton;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "btn_cancel")
	public WebElement eleFilterCancelButton;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Spinner[1]/android.view.ViewGroup/android.widget.TextView")
	public WebElement eleFilterCategoryField;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Spinner[2]/android.view.ViewGroup/android.widget.TextView")
	public WebElement eleFilterStatusField;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "text_radius")
	public WebElement eleFilterRadiusField;

	public void selectWaypoints() {
		eleWaypoints.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "btn_delete")
	public WebElement eleDeleteWaypoint;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "title")
	public WebElement eleDeletePopupHeading;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "sub_title")
	public WebElement eleDeletePopupMessage;
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "negetive_button")
	public WebElement eleDeletePopupCancel;
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "positive_button")
	public WebElement eleDeletePopupOK;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "title")
	public WebElement eleDeleteSuccessInfo;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "sub_title")
	public WebElement eleDeleteSuccessMessage;
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "positive_button")
	public WebElement eleDeleteSuccessOK;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]")
	public WebElement eleWaypointList;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView[1]")
	public WebElement eleFirstWaypoint;


	@AndroidFindBy(xpath = "//android.widget.ImageView[@index=3]")
	// @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView[2]")
	public WebElement eleimageTipWaypoint;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[5]/android.view.ViewGroup/android.widget.TextView[2]")
	public WebElement eleCategoryFirstWaypoint;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME +"btn_edit")
	public WebElement eleEditWaypoint;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "btn_go_to")
	public WebElement eleGoToButton;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "positive_button")
	public WebElement eleGoToWarningButton;

	@AndroidFindBy(accessibility = "back")
	public WebElement eleBackButton;

	//Waypoint category dropdown in waypoint creation screen
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "spinner_c_name")
	public WebElement eleCategoryDropdown;


	public void selectCreateWaypoint() {
		eleCreateNewWaypoint.click();
	}

	public void next() {
		eleNextButton.click();
	}

	public void validateWaypointName(String strWaypointName, String strValidationMessage) {
		eleWaypointName.sendKeys(strWaypointName);
		next();
		Verify.verify(eleWaypointNameValidationMessage.getText().equalsIgnoreCase(strValidationMessage), "Expected message : "+strValidationMessage);
		eleWaypointName.clear();
	}
	public void selectPositionFormat(String strPosFormat) {
		eleGeosystemDropdown.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		driver.findElement(By.xpath("//android.widget.TextView[@text='" + strPosFormat + "']")).click();
	}

	public void saveWaypoint() {
		eleCreateWaypointButton.click();
		eleSuccessPopupOKButton.click();
	}

	public void deleteWaypoints(){
		eleDeletePopupOK.click();
		eleDeleteSuccessOK.click();
	}

	public void  createWaypoint(HashMap<String, String> hmWaypointData) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		eleCreateNewWaypoint.click();
		eleWaypointName.sendKeys(hmWaypointData.get("WaypointName"));
		String strPosFormat = hmWaypointData.get("PositionFormat");
		selectPositionFormat(strPosFormat);
		next();
		switch(strPosFormat) {
			case "dd.ddddd" : createWaypointinDDFormat(hmWaypointData);
				break;
			case "dd mm ss.ss" : createWaypointinDMSFormat(hmWaypointData);
				break;
			case "dd mm.mmmm" : createWaypointinDMMFormat(hmWaypointData);
				break;
			case "IGRS (New)" : createWaypointInIGRSFormat(hmWaypointData);
				break;
			case "IGRS (Old)" : createWaypointInIGRSOldFormat(hmWaypointData);
				break;
			case "ECEF" : createWaypointinECEFFormat(hmWaypointData);
				break;
			case "MGRS" : createWaypointinMGRSFormat(hmWaypointData);
				break;
			case "UserDefined_LCC" : createWaypointinUDFormat(hmWaypointData);
				break;
		}

	}

	public void createWaypointinDDFormat(HashMap<String, String> hmWaypointData) {

		eleDDLatitude.sendKeys(hmWaypointData.get("DDLatitude"));
		eleDDLongitude.sendKeys(hmWaypointData.get("DDLongitude"));
		eleAltitude.sendKeys(hmWaypointData.get("Altitude"));
		next();
		setWaypointCategory(hmWaypointData.get("Category"));
		saveWaypoint();
	}


	public void createWaypointinDMSFormat(HashMap<String, String> hmWaypointData) {
		eleDMSLatitudeDegree.sendKeys(hmWaypointData.get("DMSLat_Degree"));
		eleDMSLatitudeMinutes.sendKeys(hmWaypointData.get("DMSLat_Minutes"));
		eleDMSLatitudeSeconds.sendKeys(hmWaypointData.get("DMSLat_Seconds"));
		eleDMSlongitudeDegree.sendKeys(hmWaypointData.get("DMSLong_Degree"));
		eleDMSlongitudeMinutes.sendKeys(hmWaypointData.get("DMSLong_Minutes"));
		eleDMSlongitudeSeconds.sendKeys(hmWaypointData.get("DMSLong_Seconds"));
		eleAltitude.sendKeys(hmWaypointData.get("Altitude"));
		eleSecondNextButton.click();
		setWaypointCategory(hmWaypointData.get("Category"));
		saveWaypoint();
	}

	public void createWaypointinDMMFormat(HashMap<String, String> hmWaypointData) {
		eleDMMLatitudeDegree.sendKeys(hmWaypointData.get("DMMLat_Degree"));
		eleDMMLatitudeMinutes.sendKeys(hmWaypointData.get("DMMLat_Minutes"));
		eleDMMLongitudeDegree.sendKeys(hmWaypointData.get("DMMLong_Degree"));
		eleDMMLongitudeMinutes.sendKeys(hmWaypointData.get("DMMLong_Minutes"));
		eleAltitude.sendKeys(hmWaypointData.get("Altitude"));
		eleSecondNextButton.click();
		setWaypointCategory(hmWaypointData.get("Category"));
		saveWaypoint();
	}

	public void createWaypointinECEFFormat(HashMap<String, String> hmWaypointData) {
		eleECEFX.sendKeys(hmWaypointData.get("X"));
		eleECEFY.sendKeys(hmWaypointData.get("Y"));
		eleECEFZ.sendKeys(hmWaypointData.get("Z"));
		eleNextButton.click();
		setWaypointCategory(hmWaypointData.get("Category"));
		saveWaypoint();
	}

	public void createWaypointinMGRSFormat(HashMap<String, String> hmWaypointData) {
		eleMGRS.sendKeys(hmWaypointData.get("MGRS"));
		eleAltitude.sendKeys(hmWaypointData.get("Altitude"));
		eleMGRSNextButton.click();
		setWaypointCategory(hmWaypointData.get("Category"));
		saveWaypoint();
	}

	public void createWaypointinUDFormat(HashMap<String, String> hmWaypointData) {
		eleZoneDropdown.click();
		String strUDZone = hmWaypointData.get("Zone");
		eleZoneSearch.sendKeys(strUDZone);
		driver.findElement(By.xpath("//android.widget.TextView[@text='"+strUDZone+"']")).click();

		eleUDEasting.sendKeys(hmWaypointData.get("UD_SP2_Easting"));
		eleUDNorthing.sendKeys(hmWaypointData.get("UD_SP2_Northing"));
		eleAltitude1.sendKeys(hmWaypointData.get("Altitude"));
		eleSecondNextButton.click();
		setWaypointCategory(hmWaypointData.get("Category"));
		saveWaypoint();
	}

	public void createWaypointInIGRSFormat(HashMap<String, String> hmWaypointData) {
		eleIGRSNewDropdown.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		String strIGRSZone = hmWaypointData.get("Zone");

		eleZoneSearch.sendKeys(strIGRSZone);
		driver.findElement(By.xpath("//android.widget.TextView[@text='"+strIGRSZone+"']")).click();
		eleGridLetter.sendKeys(hmWaypointData.get("IGRS_GridLetters"));
		eleIGRSEasting.sendKeys(hmWaypointData.get("IGRS_SP2_Easting"));
		eleIGRSNorthing.sendKeys(hmWaypointData.get("IGRS_SP2_Northing"));
		eleAltitude1.sendKeys(hmWaypointData.get("Altitude"));

		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
		eleNextButton1.click();
		setWaypointCategory(hmWaypointData.get("Category"));
		saveWaypoint();
	}

	private void createWaypointInIGRSOldFormat(HashMap<String, String> hmWaypointData) {
		eleZoneDropdown.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

		String strIGRSOldZone = hmWaypointData.get("Zone");
		driver.findElement(By.xpath("//android.widget.TextView[@text='"+strIGRSOldZone+"']")).click();
		eleIGRSEasting.sendKeys(hmWaypointData.get("IGRS_SP1_Easting"));
		eleIGRSNorthing.sendKeys(hmWaypointData.get("IGRS_SP1_Northing"));
		eleAltitude1.sendKeys(hmWaypointData.get("Altitude"));
		eleSecondNextButton.click();
		setWaypointCategory(hmWaypointData.get("Category"));
		saveWaypoint();
	}

	public void  setWaypointCategory(String strCategory){
		eleCategoryDropdown.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		driver.findElement(By.xpath("//android.widget.TextView[@text='"+strCategory+"']")).click();
	}

	//Vishwanth Details
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView[2]")
	public WebElement eleWaypointValue;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.TextView[2]")
	public WebElement eleWaypointLatitude;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.view.ViewGroup/android.widget.TextView[2]")
	public WebElement eleWaypointLongitude;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[5]/android.view.ViewGroup/android.widget.TextView[2]")
	public WebElement eleWaypointCategory;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.TextView[2]")
	public WebElement eleWaypointAltitude;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.TextView[2]")
	public WebElement eleWaypointXvalue;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.view.ViewGroup/android.widget.TextView[2]")
	public WebElement eleWaypointYvalue;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.TextView[2]")
	public WebElement eleWaypointZvalue;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.TextView[2]")
	public WebElement eleWaypointMGRSvalue;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.TextView[2]")
	public WebElement eleWaypointUDEastingValue;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.view.ViewGroup/android.widget.TextView[2]")
	public WebElement eleWaypointUDNorthingValue;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.TextView[2]")
	public WebElement eleWaypointUDZoneValue;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[5]/android.view.ViewGroup/android.widget.TextView[2]")
	public WebElement eleWaypointUDAltitude;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.TextView[2]")
	public WebElement eleWaypointIGRSValue;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.view.ViewGroup/android.widget.TextView[2]")
	public WebElement eleWaypointIGRSMapsheet;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.TextView[2]")
	public WebElement eleWaypointIGRSZone;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[5]/android.view.ViewGroup/android.widget.TextView[2]")
	public WebElement eleWaypointIGRSAltitude;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[6]/android.view.ViewGroup/android.widget.TextView[2]")
	public WebElement eleWapointIGRSCategory;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.view.ViewGroup/android.widget.TextView[2]")
	public WebElement eleWaypointMGRSAltitude;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.TextView[2]")
	public WebElement eleWypointMGRSCategory;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")
	public WebElement eleNextButton1;


}
