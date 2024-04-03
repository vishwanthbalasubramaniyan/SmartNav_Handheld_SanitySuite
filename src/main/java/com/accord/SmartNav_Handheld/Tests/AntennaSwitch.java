package com.accord.SmartNav_Handheld.Tests;

import com.accord.SmartNav_Handheld.SettingsPage;
import org.testng.annotations.Test;

public class AntennaSwitch extends BaseTest{
        SettingsPage SettingsPage;

    @Test(priority = 1)
    public void settingsPage() throws InterruptedException{
        test = extent.createTest("Settings screen", "Verify the basic details in settings screen");
        setActivityToMainMenu();
       // driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")).click();
        enterLoginPassword();
        SettingsPage = new SettingsPage(driver);
        SettingsPage.eleSettings.click();
        SettingsPage.eleGNSSSettings.click();
        SettingsPage.eleExternalAntenna.click();

        SettingsPage.eleBackButton.click();
        scrollUntilElement(driver,"Advanced Settings");
        SettingsPage.eleAdvancedSettings.click();
        SettingsPage.eleKeyManagementPassword.sendKeys("A@#$rdDEV");
        SettingsPage.eleKMMPasswordOKButton.click();
        scrollUntilElement(driver,"GNSS");
        SettingsPage.eleGNSS.click();
        SettingsPage.elePAUSE1.click();




    }


}
