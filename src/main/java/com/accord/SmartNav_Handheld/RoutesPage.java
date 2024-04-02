package com.accord.SmartNav_Handheld;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static com.accord.SmartNav_Handheld.Utils.Constants.SMART_NAV_PACKAGE_NAME;

public class RoutesPage {

	AndroidDriver driver;

	public RoutesPage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	//Location option from main menu
	///hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.ImageView

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Routes']")
	public WebElement eleRoutes;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME  +"btn_add_route")
	public WebElement eleCreateRoute;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "search_route")
	public WebElement elesearchByRouteName;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "btn_rfilter")
	public WebElement eleRouteSort;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "btn_edit")
	public WebElement eleEditRoute;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "btn_delete")
	public WebElement eleDeleteRoute;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "textView2")
	public WebElement eleRouteCreationHeader;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "route_name")
	public WebElement eleRouteName;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "route_notes")
	public WebElement eleRouteAdditionalNotes;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "routelist_heading")
	public WebElement eleRouteListHeader;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "btn_view_sele_waypoint")
	public WebElement eleViewSelectedWayptsButton;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "textinput_error")
	public WebElement eleRouteNameValidationError;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
			"android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/" +
			"android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/" +
			"android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/" +
			"android.widget.ScrollView/android.widget.LinearLayout/" +
			"androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup")
	public WebElement eleFirstEntryRouteList;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
			"android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/" +
			"android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/" +
			"android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/" +
			"android.widget.FrameLayout[2]/android.view.ViewGroup")
	public WebElement eleSecondEntryWaypointList;
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "title")
	public WebElement elePopupHeading;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "sub_title")
	public WebElement elePopupMessage;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "positive_button")
	public WebElement elePopupOK;

	/*@AndroidFindBy(xpath = "//android.widget.Button[@text = 'ADD']")
	public WebElement eleAddWaypointButton;
*/
	@AndroidFindBy(xpath = "//android.widget.Button[@text = 'REMOVE']")
	public WebElement eleRemoveWaypointButton;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "textView_sele_rname")
	public WebElement eleSelectedWaypointTitle;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
			"android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/" +
			"android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/" +
			"android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/" +
			"android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ImageButton")
	public WebElement eleDragIcon;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "btn_create_route")
	public WebElement eleCreateRouteButton;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "btn_create_route")
	public WebElement eleUpdateRouteButton;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "nestedScroll")
	public WebElement eleRouteListArea;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "textView7")
	public WebElement eleRouteNameinList;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "textView8")
	public WebElement eleRouteDistance;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "imageView9")
	public WebElement eleRouteDetailIcon;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "update")
	public WebElement eleEditCreatedRouteButton;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "checkBox_route")
	public WebElement eleSelectAllOption;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "btn_rfilter")
	public WebElement eleSortByButton;

	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "multiselect_count")
	public WebElement eleMultiSelectionCountRoutes;

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

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Distance ascending']")
	public WebElement eleSortbyDistanceAscending;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Distance descending']")
	public WebElement eleSortbyDistanceDescending;

	public void selectRoutesPage() throws InterruptedException {
		eleRoutes.click();
		Thread.sleep(2000);
	}

}
