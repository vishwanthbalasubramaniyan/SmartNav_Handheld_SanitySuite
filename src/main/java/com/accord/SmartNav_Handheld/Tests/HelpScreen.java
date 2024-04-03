package com.accord.SmartNav_Handheld.Tests;

import com.accord.SmartNav_Handheld.HelpPage;
import com.accord.SmartNav_Handheld.SettingsPage;
import com.accord.SmartNav_Handheld.Utils.AppiumUtils;
import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.List;

public class HelpScreen extends BaseTest {
    HelpPage HelpPage;

    @Test(priority = 1)
    public void helpScreen() {
        test = extent.createTest("Help screen details", "Verify the values in help screen");
        setActivityToMainMenu();
        // driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")).click();
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
                test.pass("Expected AppVersion is " + strAppVersion + " Actual AppVersion is " + HelpPage.eleAppVersion.getText());
            } else {
                test.fail("Expected AppVersion is " + strAppVersion + " Actual AppVersion is " + HelpPage.eleAppVersion.getText());
            }
            if (HelpPage.eleOSVersion.getText().equals(strOSVersion)) {
                test.pass("Expected OSVersion is " + strOSVersion + " Actual OSVersion is " + HelpPage.eleOSVersion.getText());
            } else {
                test.fail("Expected OSVersion is " + strOSVersion + " Actual OSVersion is " + HelpPage.eleOSVersion.getText());
            }
            if (HelpPage.eleFirmwareVersion.getText().equals(strFirmwareVersion)) {
                test.pass("Expected FirmwareVersion is " + strFirmwareVersion + " Actual FirmwareVersion is " + HelpPage.eleFirmwareVersion.getText());
            } else {
                test.fail("Expected FirmwareVersion is " + strFirmwareVersion + " Actual FirmwareVersion is " + HelpPage.eleFirmwareVersion.getText());
            }
            break;


        }

        //Storage screen details
        HelpPage.eleBackButton.click();
        HelpPage.eleStorage.click();
        for (HashMap<String, String> input : lsHelpScreenData) {
            String strDiskSpace = input.get("DiskSpace");
            String strRAMSpace = input.get("RAMSpace");
            String TotalDiskSpace = HelpPage.eleDiskSpace.getText() + HelpPage.eleDiskSpaceGB.getText();
            String TotalRAMSpace = HelpPage.eleRAMSpace.getText() + HelpPage.eleRAMSpaceGB.getText();
            if (TotalDiskSpace.equals(strDiskSpace)) {
                test.pass("Expected TotalDisk Space is " + strDiskSpace + " Actual Total disk space is " + TotalDiskSpace);
            } else {
                test.fail("Expected TotalDisk Space is " + strDiskSpace + " Actual Total disk space is " + TotalDiskSpace);
            }
            if (TotalRAMSpace.equals(strRAMSpace)) {
                test.pass("Expected TotalRAM Space is " + strRAMSpace + " Actual TotalRam Space is " + TotalRAMSpace);
            } else {
                test.fail("Expected TotalRAM Space is " + strRAMSpace + " Actual TotalRam Space is " + TotalRAMSpace);
            }
            break;
        }

    }
//   public void kiosk(String strKiosk){
//        List<WebElement> iskiosk = driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.TextView[2]"));
//    for (int iindex=4;iindex<=iskiosk.get();iindex++){
//
//    }


}