package com.accord.SmartNav_Handheld.Tests;

import com.accord.SmartNav_Handheld.HelpPage;
import com.accord.SmartNav_Handheld.SettingsPage;
import com.accord.SmartNav_Handheld.Utils.AppiumUtils;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;

public class DeviceBasicDetails extends BaseTest {
    HelpPage HelpPage;

    @Test(priority = 1)
    public void helpScreen() {
        test = extent.createTest("Help screen details", "Verify the values in help screen");
        setActivityToMainMenu();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")).click();
        enterLoginPassword();
        AppiumUtils.scrollUntilElement(driver, "Help");
        HelpPage = new HelpPage(driver);
        HelpPage.eleHelp.click();
        //About screen details
        HelpPage.eleAbout.click();
        List<HashMap<String, String>> lsHelpScreenData = AppiumUtils.getDataFromDataBase("DeviceBasicDetails");
        for (HashMap<String, String> input : lsHelpScreenData) {
            String strAppVersion = input.get("AppVersion");
            String strOSVersion = input.get("OSVersion");
            String strFirmwareVersion = input.get("FirmwareVersion");
            if (HelpPage.eleAppVersion.getText().equals(strAppVersion)) {
                test.pass("Appversion is  matching " + HelpPage.eleAppVersion.getText());
            } else {
                test.fail("Appversion is not  matching " + HelpPage.eleAppVersion.getText());
            }
            if (HelpPage.eleOSVersion.getText().equals(strOSVersion)) {
                test.pass("OSVersion is  matching " + HelpPage.eleOSVersion.getText());
            } else {
                test.fail("OSversion is not  matching " + HelpPage.eleOSVersion.getText());
            }
            if (HelpPage.eleFirmwareVersion.getText().equals(strFirmwareVersion)) {
                test.pass("FirmwareVersion is  matching " + HelpPage.eleFirmwareVersion.getText());
            } else {
                test.fail("FirmwareVersion is not  matching " + HelpPage.eleFirmwareVersion.getText());
            }
            break;
        }

        //Storage screen details
        HelpPage.eleBackButton.click();
        HelpPage.eleStorage.click();
        for (HashMap<String, String> input : lsHelpScreenData){
            String strDiskSpace = input.get("DiskSpace");
            String strRAMSpace = input.get("RAMSpace");
            String TotalDiskSpace = HelpPage.eleDiskSpace.getText() + HelpPage.eleDiskSpaceGB.getText();
            String TotalRAMSpace = HelpPage.eleRAMSpace.getText() + HelpPage.eleRAMSpaceGB.getText();
            if(TotalDiskSpace.equals(strDiskSpace)){
                test.pass("Expected TotalDisk Space is " + strDiskSpace + " Actual Total disk space is " + TotalDiskSpace);
            }else {
                test.fail("Expected TotalDisk Space is " + strDiskSpace + " Actual Total disk space is " + TotalDiskSpace);
            }
            if(TotalRAMSpace.equals(strRAMSpace)){
                test.pass("Expected TotalRAM Space is " + strRAMSpace + " Actual TotalRam Space is " + TotalRAMSpace);
            }else {
                test.fail("Expected TotalRAM Space is " + strRAMSpace + " Actual TotalRam Space is " + TotalRAMSpace);
            }
            break;
        }
    }

    SettingsPage SettingsPage;

    @Test(priority = 2)
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
        test.info("Lock Screen Settings StartUP is turned ON ");
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
        //Maps
        SettingsPage.eleMaps.click();
        SettingsPage.eleMapFormats.click();
        //Raster Map details
        SettingsPage.eleRasterMapFormats.click();

//        List<HashMap<String, String>> lsMaps = getDataFromDataBase("DeviceBasicDetails");
//        for (HashMap<String, String> input : lsMaps) {
//            String strRasterMap = input.get("RasterMap");
//            SettingsPage.eleMapsearch.click();
//            SettingsPage.eleMapsearch.sendKeys(strRasterMap);
//            List<WebElement> lsSearchedMap = driver.findElements(By.xpath("//android.widget.TextView[@resource-id='com.accord.smartnav20_v20:id/textView7']"));
//            String searchMap = lsSearchedMap.toString();
//            if (lsSearchedMap.isEmpty()) {
//                test.info("Searched map is not present in the list ");
//            } else {
//                if(strRasterMap.equals(searchMap)){
//                    test.info("Searched map is present in the device");
//                }else{
//                    test.info("Searched map is not present in the device");
//                }
//
//            }

        }
    }




