package com.accord.SmartNav_Handheld;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DeviceSettingsPage extends SettingsPage {

    AndroidDriver driver;

    public DeviceSettingsPage(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    // Display Settings under Device option in Settings screen
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Display Settings']")
    public WebElement eleDisplaySettings;

    // Notifications Settings under Device option in Settings screen
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Notifications']")
    public WebElement eleNotifications;

    // Lock Screen Settings under Device option in Settings screen
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Lock Screen Settings']")
    public WebElement eleLockScreenSettings;

    // Geosystem Settings under Device option in Settings screen
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='GeoSystem Settings']")
    public WebElement eleGeoSystemSettings;

    // Unit Settings under Device option in Settings screen
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Unit Settings']")
    public WebElement eleUnitSettings;

    // Other Settings under Device option in Settings screen
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Other Settings']")
    public WebElement eleOtherSettings;

    //PositionFormat dropdown
    @AndroidFindBy(id="com.accord.smartnav20_v20:id/spinner")
    public WebElement elePositionFormatDropdown;

    //Datum dropdown
    @AndroidFindBy(id = "com.accord.smartnav20_v20:id/spinner2")
    public WebElement eleDatumDropdown;

    //Old PIN field in Update PIN section
    @AndroidFindBy(id ="com.accord.smartnav20_v20:id/text_OldPIN")
    public WebElement eleOldPIN;

    //Precision dropdown
    @AndroidFindBy(id = "com.accord.smartnav20_v20:id/spinner4")
    public WebElement elePrecisionDropdownIGRSNew;

    //Precision dropdown in IGRS old format
    @AndroidFindBy(id = "com.accord.smartnav20_v20:id/precision_spinner")
    public WebElement elePrecisionDropdownIGRSOld;

    // User Defined format zone dropdown
    @AndroidFindBy(id = "com.accord.smartnav20_v20:id/userdefinedZoneSpinner")
    public WebElement eleUDZoneDropdown;

    //Old PIN Validation message field
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"+
            "android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/"+
            "android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/"+
            "android.widget.FrameLayout[2]/android.widget.ScrollView/android.view.ViewGroup/"+
            "android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/"+
            "android.widget.TextView")
    public WebElement eleOldPINValidationMessage;

    //New PIN field in Update PIN section
    @AndroidFindBy(id ="com.accord.smartnav20_v20:id/text_NewPIN")
    public WebElement eleNewPIN;

    //New PIN validation message
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"+
            "android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/"+
            "android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/"+
            "android.widget.FrameLayout[2]/android.widget.ScrollView/android.view.ViewGroup/"+
            "android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/"+
            "android.widget.TextView")
    public WebElement eleNewPINValidationMessage;

    //Confirm PIN field in Update PIN section
    @AndroidFindBy(id ="com.accord.smartnav20_v20:id/text_ConfirmPIN")
    public WebElement eleConfirmPIN;

    //Confirm PIN Validation message
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"+
            "android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/"+
            "android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/"+
            "android.widget.FrameLayout[2]/android.widget.ScrollView/android.view.ViewGroup/"+
            "android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/"+
            "android.widget.TextView")
    public WebElement eleConfirmPINValidationMessage;

    //Update PIN button
    @AndroidFindBy(id ="com.accord.smartnav20_v20:id/update_PIN_btn")
    public WebElement eleUpdatePIN;

    //Update PIN validation alert pop-up message
    @AndroidFindBy(id = "com.accord.smartnav20_v20:id/sub_title")
    public WebElement elePopUpTextMessage;

    //Update PIN validation alert pop-up heading
    @AndroidFindBy(id = "com.accord.smartnav20_v20:id/title")
    public WebElement elePopUpHeading;

    //Info pop-up OK button
    //Alert pop-up OK button
    @AndroidFindBy(id = "com.accord.smartnav20_v20:id/positive_button")
    public WebElement eleOKPositiveButton;

}