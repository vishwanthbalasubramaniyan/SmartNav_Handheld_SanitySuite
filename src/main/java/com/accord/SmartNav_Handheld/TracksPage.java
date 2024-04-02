package com.accord.SmartNav_Handheld;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static com.accord.SmartNav_Handheld.Utils.Constants.SMART_NAV_PACKAGE_NAME;

public class TracksPage {

	AndroidDriver driver;

	public TracksPage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	public void selectTracks() throws InterruptedException {
		eleTracks.click();
		Thread.sleep(2000);
	}

	//Tracks option from main menu
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Tracks']")
	public WebElement eleTracks;

	//Tracks Search field
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "track_search")
	public WebElement eleTracksSearchField;

	//Tracks screen sort option
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "btn_sort_name")
	public WebElement eleTracksSort;

	//Name A-Z sort option in tracks screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Name A-Z']")
	public WebElement eleSortAZ;

	//Name Z-A sort option in tracks screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Name Z-A']")
	public WebElement eleSortZA;

	//First entry in Tracks page
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView[1]")
	public WebElement eleFirstTrack;

	//Rename button in tracks screen
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "btn_edit")
	public WebElement eleRenameButton;

	//Input field in Rename pop-up
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "editText")
	public WebElement eleTrackNameEditField;

	//Save button in rename pop-up
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "positive_button1")
	public WebElement eleSaveRenameButton;

	//Rename field validation error
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "textinput_error")
	public WebElement eleTrackNameValidationError;

	//Track rename success popup OK button
	//Tracks delete confirmation button
	//Tracks delete all confirmation button
	//Deleted successfully success message Ok button
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "positive_button")
	public WebElement eleTrackPositiveButton;

	// Track Delete button
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "btn_delete")
	public WebElement eleTrackDelete;

	//Delete pop-up heading
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "title")
	public WebElement eleDeletePopupHeading;

	//Rename cancel button in Tracks page
	@AndroidFindBy(id=SMART_NAV_PACKAGE_NAME + "negative_button1")
	public WebElement eleRenameCancelButton;

	//Tracks page Select All button
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "select_all")
	public WebElement eleSelectAll;


	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "track_search")
	public static WebElement eleSearchTracks;
}
