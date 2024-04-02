package com.accord.SmartNav_Handheld;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static com.accord.SmartNav_Handheld.Utils.AppiumUtils.scrollUntilElement;
import static com.accord.SmartNav_Handheld.Utils.Constants.SMART_NAV_PACKAGE_NAME;

public class GNSSSettingsPage extends SettingsPage{

    AndroidDriver driver;

    public GNSSSettingsPage(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //GPS constellation checkbox
    @AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "checkBoxGps_settings")
    public WebElement eleGPSCheckbox;

    //GLONASS constellation checkbox
    @AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "checkBoxglonass_settings")
    public WebElement eleGLONASSCheckbox;

    //GALILEO constellation checkbox
    @AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "checkBoxGalileo_settings")
    public WebElement eleGALILEOCheckbox;

    //BEIDOU constellation checkbox
    @AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "checkBoxBeidou_settings")
    public WebElement eleBEIDOUCheckbox;

    //NavIC constellation checkbox
    @AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "checkBoxNavic_settings")
    public WebElement eleNavICCheckbox;

    //Configure button in GNSS Settings
    @AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "send_cmd_sat_btn")
    public WebElement eleConfigureButton;

    //Configure Pop-up Ok button
    @AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "positive_button")
    public WebElement eleConfigurePopupOK;

    //Configure Pop-up Cancel button
    @AndroidFindBy(id = SMART_NAV_PACKAGE_NAME + "negetive_button")
    public WebElement eleConfigurePopupCancel;

    public void configureAllConstellations() throws InterruptedException {
        scrollUntilElement(driver, "CONFIGURE");
        eleGPSCheckbox.click();
        eleGLONASSCheckbox.click();
        eleGALILEOCheckbox.click();
        eleBEIDOUCheckbox.click();
        eleNavICCheckbox.click();
        eleConfigureButton.click();
        eleConfigurePopupOK.click();
        Thread.sleep(5000);
        eleConfigurePopupOK.click();
    }

}
