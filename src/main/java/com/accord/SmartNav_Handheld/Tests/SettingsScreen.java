package com.accord.SmartNav_Handheld.Tests;

import com.accord.SmartNav_Handheld.SettingsPage;
import org.testng.annotations.Test;

public class SettingsScreen extends BaseTest{
    SettingsPage SettingsPage;

    @Test(priority = 1)
    public void settingsPage() throws InterruptedException {
        test = extent.createTest("Settings screen", "Verify the basic details in settings screen");
        setActivityToMainMenu();
        enterLoginPassword();
        SettingsPage = new SettingsPage(driver);
        SettingsPage.eleSettings.click();
        //Turn OFF Device Notification
       SettingsPage.eleDeviceSettings.click();
        SettingsPage.eleNotification.click();
        SettingsPage.eleNotificationOFF.click();
        SettingsPage.eleNotificationOFF.getText();
        test.info("Notification is turned OFF");
        SettingsPage.eleBackButton.click();
        //Device StartUp PIN Enable
        SettingsPage.eleLockScreenSettings.click();
        SettingsPage.eleStartUpON.click();
        test.info("Lock Screen Settings Start UP is turned ON ");
        SettingsPage.eleScreenLockON.click();
                test.info("Screen Lock is turned ON");
        SettingsPage.eleBackButton.click();
        SettingsPage.eleBackButton.click();
        //Device Logging period set as 1Sec
        SettingsPage.eleLogging.click();
        SettingsPage.eleMinutesField.click();
        SettingsPage.eleMinutesField.clear();
        SettingsPage.eleMinutesField.sendKeys("00");
        SettingsPage.eleSecondsField.click();
        SettingsPage.eleSecondsField.clear();
        SettingsPage.eleSecondsField.sendKeys("01");
        SettingsPage.eleLoggingSetButton.click();
        SettingsPage.eleLoggingOKButton.click();
        test.info("Logging period set as 1sec successfully ");
        SettingsPage.eleBackButton.click();
        //Device in Civilian Mode and All constellations are enabled
        SettingsPage.eleGNSSSettings.click();
        SettingsPage.eleMilitaryMode.click();
        SettingsPage.eleSwitchMode.click();
        SettingsPage.eleSwitcModeOkButton.click();
        SettingsPage.eleCivilianMode.click();
        SettingsPage.eleSwitchMode.click();
        SettingsPage.eleSwitcModeOkButton.click();
        test.info("Operational Mode set as Civilian Mode ");
        SettingsPage.eleBackButton.click();

    }
}







