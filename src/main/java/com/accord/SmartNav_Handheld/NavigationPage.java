package com.accord.SmartNav_Handheld;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static com.accord.SmartNav_Handheld.Utils.Constants.SMART_NAV_PACKAGE_NAME;

public class NavigationPage {

	AndroidDriver driver;

	public NavigationPage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	//Navigation element from main menu screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Navigation']")
	public WebElement eleNavigation;

	//Time field in Navigation screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Time']")
	public WebElement eleTime;

	//ALT field in Navigation screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='ALT']")
	public WebElement eleALT;

	//ETA field in Navigation screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='ETA']")
	public WebElement eleETA;

	//TTN field in Navigation screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='TTN']")
	public WebElement eleTTN;

	//DST field in Navigation screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='DST']")
	public WebElement eleDST;

	//DTD field in Navigation screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='DTD']")
	public WebElement eleDTD;

	//TTD field in Navigation screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='TTD']")
	public WebElement eleTTD;

	//BRG field in Navigation screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='BRG']")
	public WebElement eleBRG;

	//HDG field in Navigation screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='HDG']")
	public WebElement eleHDG;

	//XTE field in Navigation screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='XTE']")
	public WebElement eleXTE;

	//Speed field in Navigation screen
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"+
			"android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/"+
			"android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/"+
			"android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView[1]")
	public WebElement eleSpeed;

	//TAS field in Navigation screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='TAS']")
	public WebElement eleTAS;

	//TMS field in Navigation screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='TMS']")
	public WebElement eleTMS;

	//NXT field in Navigation screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='NXT']")
	public WebElement eleNXT;

	//ETN field in Navigation screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='ETN']")
	public WebElement eleETN;

	//DTN field in Navigation screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='DTN']")
	public WebElement eleDTN;

	//TST field in Navigation screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='TST']")
	public WebElement eleTST;

	//TOD field in Navigation screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='TOD']")
	public WebElement eleTOD;

	//TMR field in Navigation screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='TMR']")
	public WebElement eleTMR;

	//VMG field in Navigation screen
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='VMG']")
	public WebElement eleVMG;

	// Abbreviation text field
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "sub_title")
	public WebElement eleAbbreviationText;

	//OK button on the abbreviation Pop-up
	@AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "positive_button")
	public WebElement eleOKButton;

}
